package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class CarsTest {
    @Test
    @DisplayName("레이스에 참여할 자동차 목록을 생성한다.")
    void create() {
        //given //when
        Cars cars = Cars.of(Arrays.asList("red", "green", "blue"));

        //then
        assertThat(cars.getCars())
                .extracting("name", "position")
                .containsExactly(
                        tuple("red", 0),
                        tuple("green", 0),
                        tuple("blue", 0)
                );
    }

    @Test
    @DisplayName("레이스에 참여할 자동차 목록에서 자동차 이름이 5자룰 초과하면 예외가 발생한다.")
    void validateCarName() {
        //given //when //then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Cars.of(Arrays.asList("red", "yellow", "blue")))
                .withMessage("자동차 이름은 1 ~ 5자 입니다.");
    }
}
