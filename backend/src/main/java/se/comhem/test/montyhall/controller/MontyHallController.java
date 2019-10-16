package se.comhem.test.montyhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.comhem.test.montyhall.model.GameMode;
import se.comhem.test.montyhall.model.GameSimulationStatistic;
import se.comhem.test.montyhall.service.MontyHallService;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class MontyHallController {

    @Autowired
    MontyHallService montyHallService;

    @GetMapping(value = "/simulate")
    public ResponseEntity<GameSimulationStatistic> simulateMontyHall(
            @RequestParam(value="iterations", defaultValue="10000") long iterations,
            @RequestParam(value="gamemode", defaultValue="KEEP_DOOR") String gameMode) {
        return ResponseEntity.ok(
                montyHallService.simulateMontyHall(
                        iterations, GameMode.valueOf(gameMode)));
    }
}
