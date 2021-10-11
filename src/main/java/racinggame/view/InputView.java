package racinggame.view;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final int MIN_CAR_NAME_LENGTH = 1;
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final String CAR_NAME_DELIMITER = ",";

    private InputView() {
    }

    public static List<String> getCarNames() {
        OutputView.printCarNameMessage();
        String input = Console.readLine();
        return splitValidate(input);
    }

    public static int getRaceCount() {
        OutputView.printRaceCountMessage();
        return parseIntValidate(Console.readLine());
    }

    private static List<String> splitValidate(String input) {
        List<String> carNames = new ArrayList<>();
        for (String carName : input.split(CAR_NAME_DELIMITER)) {
            validateCar(carName.trim());
            carNames.add(carName.trim());
        }
        return carNames;
    }

    private static int parseIntValidate(String input) {
        try {
            int count = Integer.parseInt(input);
            validateLap(count);
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("레이스 경주 횟수는 숫자로 입력해 주세요.");
        }
    }

    private static void validateCar(String name) {
        if (name.length() < MIN_CAR_NAME_LENGTH || name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 1 ~ 5자 입니다.");
        }
    }

    private static void validateLap(int count) {
        if (count < 1) {
            throw new IllegalArgumentException("레이스 경주는 1회 이상 진행할 수 있습니다.");
        }
    }
}
