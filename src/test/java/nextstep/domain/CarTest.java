package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class CarTest {

    @Test
    @DisplayName("자동차 이름이 문자열 5자 이하인 객체를 생성한다.")
    void create() {
        //given
        String name = "red";

        //when
        Car car = new Car(name);

        //then
        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("자동차 이름이 이름이 문자열 5자를 초과하면 예외가 발생한다.")
    void validateCarName() {
        //given
        String name = "yellow";

        //when //then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car("yellow"))
                .withMessage("자동차 이름은 5자 이하입니다.");
    }
}
