package nextstep.domain;

import java.util.List;

public class RaceGame {
    private static final RandomMoveStrategy moveStrategy = new RandomMoveStrategy();

    private final Cars cars;
    private final Lap lap;
    private final Winner winner;

    public RaceGame(List<String> carNames, int count) {
        this.cars = Cars.of(carNames);
        this.lap = new Lap(count);
        this.winner = new Winner();
    }

    public boolean isPlaying() {
        return lap.isPlaying();
    }

    public void raceOnce() {
        cars.raceOnce(moveStrategy);
    }

    public List<String> getWinner() {
        winner.compare(cars.getCars());
        return winner.getNames();
    }

    public List<Car> getCars() {
        return cars.getCars();
    }

    public int getLap() {
        return 0;
    }
}
