package se.comhem.test.montyhall.model;

public class GameSimulationStatistic {

    private long numberOfIterations;
    private long numberOfWins;

    public GameSimulationStatistic(long numberOfIterations, long numberOfWins) {
        this.numberOfIterations = numberOfIterations;
        this.numberOfWins = numberOfWins;
    }

    public long getNumberOfIterations() {
        return numberOfIterations;
    }

    public long getNumberOfWins() {
        return numberOfWins;
    }

    @Override
    public String toString() {
        return "GameSimulationStatistic{" +
                "numberOfIterations=" + numberOfIterations +
                ", numberOfWins=" + numberOfWins +
                '}';
    }
}

