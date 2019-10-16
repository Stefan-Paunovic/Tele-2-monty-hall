package se.comhem.test.montyhall.service;

import org.springframework.stereotype.Service;
import se.comhem.test.montyhall.model.*;

import java.util.Random;
import java.util.stream.LongStream;

@Service
public class MontyHallService {

    public GameSimulationStatistic simulateMontyHall(long iterations, GameMode gameMode){
        Long totalNumberOfWins = LongStream.generate(() -> {
            final GameResult result = simulateGame(gameMode);
            if(result.isWin()) {
                return 1;
            }
            return 0;
        }).parallel().limit(iterations).sum();

        return new GameSimulationStatistic(iterations, totalNumberOfWins);
    }

    private GameResult simulateGame(GameMode gameMode){
        Game game = new Game();

        boolean doorChanged;
        switch (gameMode) {
            case KEEP_DOOR:
                keepDoor(game);
                doorChanged = false;
                break;

            case CHANGE_DOOR:
                changeDoor(game);
                doorChanged = true;
                break;

            default: //Random
                Random random = new Random();
                if(random.nextBoolean()){
                    keepDoor(game);
                    doorChanged = false;
                } else {
                    changeDoor(game);
                    doorChanged = true;
                }
        }

        return new GameResult(gameWon(game), doorChanged, game);
    }

    private void keepDoor(Game game){
        game.getDoors().stream()
                .filter(d -> !d.isSelected() && !d.isContainsPrize())
                .findFirst()
                .get()
                .removeByMorty();
    }

    private void changeDoor(Game game){
        game.getDoors().stream()
                .filter(d -> !d.isSelected() && !d.isContainsPrize())
                .findFirst()
                .get()
                .removeByMorty();

        game.getDoors().stream()
                .filter(d -> d.isInitiallySelected())
                .findFirst()
                .get()
                .unSelectDoor();

        game.getDoors().stream()
                .filter(d -> !d.isInitiallySelected() && !d.isRemovedByMonty())
                .findFirst()
                .get()
                .selectDoor();
    }

    private boolean gameWon(Game game){
        return game.getDoors().stream()
                .filter(d -> d.isSelected() && d.isContainsPrize())
                .findFirst()
                .isPresent();
    }
}