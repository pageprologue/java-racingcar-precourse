package nextstep.domain;

import java.util.List;

public class RaceGame {
    private final Cars cars;
    private final int round;

    public RaceGame(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public void race(MoveStrategy moveStrategy) {
        for (int i = 0; i < round; i++) {
            cars.raceOnce(moveStrategy);
        }
    }

    public List<Car> getCars() {
        return cars.getCars();
    }
}
