package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private final List<String> names = new ArrayList<>();

    public void compare(List<Car> cars) {
        int maxPosition = maxPosition(cars);
        for (Car car : cars) {
            comparePosition(maxPosition, car);
        }
    }
    
    private int maxPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private void comparePosition(int maxPosition, Car car) {
        if (maxPosition == car.getPosition()) {
            names.add(car.getName());
        }
    }

    public List<String> getNames() {
        return names;
    }
}
