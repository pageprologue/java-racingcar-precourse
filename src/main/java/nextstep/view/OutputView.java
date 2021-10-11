package nextstep.view;

import nextstep.domain.Car;

import java.util.Collections;
import java.util.List;

public class OutputView {
    private static final String RACE_RESULT_DELIMITER = "-";
    private static final String WINNERS_JOIN_DELIMITER = ", ";

    private OutputView() {
    }

    public static void printCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printRaceCountMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printCars(List<Car> cars) {
        for (Car car : cars) {
            String raceResult = String.join("", Collections.nCopies(car.getPosition(), RACE_RESULT_DELIMITER));
            System.out.printf("%s : %s%n", car.getName(), raceResult);
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        String winnerNames = String.join(WINNERS_JOIN_DELIMITER, winners);
        System.out.printf("최종 우승자는 %s 입니다.%n", winnerNames);
    }
}
