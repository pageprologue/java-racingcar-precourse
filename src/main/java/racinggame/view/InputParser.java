package racinggame.view;

import java.util.ArrayList;
import java.util.List;

public class InputParser {
    private static final String CAR_NAME_DELIMITER = ",";
    private static final int MIN_CAR_NAME_LENGTH = 1;
    private static final int MAX_CAR_NAME_LENGTH = 5;

    private InputParser() {
    }

    public static List<String> splitValidate(String input) {
        List<String> carNames = new ArrayList<>();

        for (String carName : input.split(CAR_NAME_DELIMITER)) {
            validateCar(carName.trim());
            carNames.add(carName.trim());
        }

        return carNames;
    }

    public static int parseIntValidate(String input) {
        try {
            int raceCount = Integer.parseInt(input);
            validateLap(raceCount);
            return raceCount;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 레이스 경주 횟수는 숫자로 입력해 주세요.");
        }
    }

    private static void validateCar(String name) {
        if (name.length() < MIN_CAR_NAME_LENGTH || name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름은 1 ~ 5자 입니다.");
        }
    }

    private static void validateLap(int count) {
        if (count < 1) {
            throw new IllegalArgumentException("[ERROR] 레이스 경주는 1회 이상 진행할 수 있습니다.");
        }
    }
}
