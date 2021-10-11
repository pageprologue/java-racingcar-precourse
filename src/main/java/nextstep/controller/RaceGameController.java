package nextstep.controller;

import nextstep.domain.GameState;
import nextstep.domain.RaceGame;
import nextstep.view.InputView;
import nextstep.view.OutputView;

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
