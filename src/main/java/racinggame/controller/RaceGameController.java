package racinggame.controller;

import racinggame.domain.RaceGame;
import racinggame.view.InputState;
import racinggame.view.InputView;
import racinggame.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RaceGameController {
    private List<String> carNames = new ArrayList<>();
    private int raceCount = 0;

    public void run() {
        InputState.ready();

        while (InputState.isReady()) {
            hasCarNames();
            hasRaceCount();
            isReadyToStart();
        }

        race(carNames, raceCount);
    }

    private void hasCarNames() {
        if (carNames.isEmpty()) {
            setInputCarNames();
        }
    }

    private void setInputCarNames() {
        try {
            carNames = InputView.getCarNames();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void hasRaceCount() {
        if (raceCount == 0) {
            setInputRaceCount();
        }
    }

    private void setInputRaceCount() {
        try {
            raceCount = InputView.getRaceCount();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void isReadyToStart() {
        if (!carNames.isEmpty() && raceCount != 0) {
            InputState.start();
        }
    }

    public void race(List<String> carNames, int count) {
        RaceGame raceGame = new RaceGame(carNames, count);
        racing(raceGame);
        List<String> winner = raceGame.getWinner();
        OutputView.printWinners(winner);
    }

    private void racing(RaceGame raceGame) {
        while (raceGame.isPlaying()) {
            raceGame.raceOnce();
            OutputView.printCars(raceGame.getCars());
        }
    }
}

