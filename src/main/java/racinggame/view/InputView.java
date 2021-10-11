package racinggame.view;

import nextstep.utils.Console;

import java.util.List;

public class InputView {
    private InputView() {
    }

    public static List<String> getCarNames() {
        OutputView.printCarNameMessage();
        String input = Console.readLine();
        return InputParser.splitValidate(input);
    }

    public static int getRaceCount() {
        OutputView.printRaceCountMessage();
        return InputParser.parseIntValidate(Console.readLine());
    }
}

