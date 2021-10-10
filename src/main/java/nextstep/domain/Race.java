package nextstep.domain;

import java.util.List;

public class Race {
    private final Cars cars;

    public Race(Cars cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars.getCars();
    }
}
