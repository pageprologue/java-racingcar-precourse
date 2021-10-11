package nextstep.domain;

import java.util.List;

public class RaceGame {
    private final Cars cars;
    private final Lap lap;
    private final Winner winner;

    public RaceGame(List<String> carNames, int count) {
        this.cars = Cars.of(carNames);
        this.lap = new Lap(count);
        this.winner = new Winner();
    }

    public void race() {
        for (int i = 0; i < lap.getCount(); i++) {
            cars.raceOnce(new RandomMoveStrategy());
        }
        winner.compare(cars.getCars());
    }

    public List<Car> getCars() {
        return cars.getCars();
    }

    public int getLap() {
        return lap.getCount();
    }

    public List<String> getWinner() {
        return winner.getNames();
    }
}
