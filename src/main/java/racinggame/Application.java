package racinggame;

import racinggame.controller.RaceGameController;

public class Application {

    public static void main(String[] args) {
        RaceGameController raceGameController = new RaceGameController();
        raceGameController.run();
    }

}
