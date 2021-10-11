package racinggame.controller;

import racinggame.domain.RaceGame;
import racinggame.view.InputView;
import racinggame.view.OutputView;

import java.util.List;

public class RaceGameController {
    private RaceGameController() {
    }

    public static void run() {
        try {
            List<String> carNames = InputView.getCarNames();
            int count = InputView.getRaceCount();

            RaceGame raceGame = new RaceGame(carNames, count);
            while (raceGame.isPlaying()) {
                raceGame.raceOnce();
                OutputView.printCars(raceGame.getCars());
            }

            List<String> winner = raceGame.getWinner();
            OutputView.printWinners(winner);

        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }

}
