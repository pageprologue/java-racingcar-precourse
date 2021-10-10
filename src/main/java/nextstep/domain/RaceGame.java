package nextstep.domain;

import java.util.List;

public class RaceGame {
    private final Cars cars;
    private final Lap lap;

    public RaceGame(Cars cars, int count) {
        this.cars = cars;
        this.lap = new Lap(count);
    }

    public void race(MoveStrategy moveStrategy) {
        for (int i = 0; i < lap.getCount(); i++) {
            cars.raceOnce(moveStrategy);
        }
    }

    public List<Car> getCars() {
        return cars.getCars();
    }
}
