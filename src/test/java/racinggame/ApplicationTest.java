package racinggame;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApplicationTest extends NSTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    private static final String ERROR_MESSAGE = "[ERROR]";

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    void 전진_정지() {
        assertRandomTest(() -> {
            run("pobi,woni", "1");
            verify("pobi : -", "woni : ", "최종 우승자는 pobi 입니다.");
        }, MOVING_FORWARD, STOP);
    }

    @Test
    void 이름에_대한_예외_처리() {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,javaji");
            verify(ERROR_MESSAGE);
        });
    }

    @Test
    void 횟수에_대한_예외_처리() {
        assertSimpleTest(() -> {
            runNoLineFound("blue, white", "둘");
            verify(ERROR_MESSAGE);
        });
    }

    @Test
    void 여버번의_횟수_여러명의_우승자() {
        assertRandomTest(() -> {
                    run("red, green, blue", "3");
                    verify("red : -", "green : -", "blue : -",
                            "red : -", "green : --", "blue : -",
                            "red : -", "green : --", "blue : --",
                            "최종 우승자는 green, blue 입니다.");
                }, MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD,
                STOP, MOVING_FORWARD, STOP,
                STOP, STOP, MOVING_FORWARD
        );
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
