package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class LapTest {
    @Test
    @DisplayName("레이스의 시도 횟수를 갖는 객체를 생성한다.")
    void create() {
        //given //when
        Lap lap = new Lap(3);

        //then
        assertThat(lap.getCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("시도 횟수가 1회 미만인 경우 예외가 발생한다.")
    void validateCount() {
        //given

        //when

        //then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Lap(0))
                .withMessage("레이스 경주는 1회 이상 진행할 수 있습니다.");
    }
}
