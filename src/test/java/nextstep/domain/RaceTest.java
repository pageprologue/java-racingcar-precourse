package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RaceTest {
    @Test
    @DisplayName("레이스에 참여할 자동차를 초기화한다.")
    void create() {
        //given
        Cars cars = Cars.of(Arrays.asList("red", "green", "blue"));

        //when
        Race race = new Race(cars);

        //then
        assertThat(race.getCars()).hasSize(3);
    }
}
