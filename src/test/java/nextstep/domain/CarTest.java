package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class CarTest {
    @Test
    @DisplayName("이름과 위치를 갖는 자동차 객체를 생성한다.")
    void create() {
        //given
        String name = "red";

        //when
        Car car = new Car(name);

        //then
        assertThat(car.getName()).isEqualTo(name);
        assertThat(car.getPosition()).isZero();
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "yellow"})
    @DisplayName("자동차 이름이 1 ~ 5자 사이가 아니면 예외가 발생한다.")
    void validateCarName() {
        //given
        String invalidName = "yellow";

        //when //then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car(invalidName))
                .withMessage("자동차 이름은 1 ~ 5자 입니다.");
    }

    @Test
    @DisplayName("레이스를 진행하면서 랜덤 값이 4이상이면 전진한다.")
    void raceOnceForward() {
        //given
        Car car = new Car("blue");

        //when
        car.move(() -> true);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("레이스를 진행하면서 랜덤 값이 3이하이면 멈춘다.")
    void raceOnceStop() {
        //given
        Car car = new Car("blue");

        //when
        car.move(() -> false);

        //then
        assertThat(car.getPosition()).isZero();
    }
}
