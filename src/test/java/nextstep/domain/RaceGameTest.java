package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RaceGameTest {
    @Test
    @DisplayName("레이스에 참여할 자동차를 초기화한다.")
    void create() {
        //given
        Cars cars = Cars.of(Arrays.asList("red", "green", "blue"));
        int count = 3;

        //when
        RaceGame raceGame = new RaceGame(cars, count);

        //then
        assertThat(raceGame.getCars()).hasSize(3);
    }

    @Test
    @DisplayName("시도 횟수 만큼 레이스를 진행한다.")
    void race() {
        //given
        Cars cars = Cars.of(Arrays.asList("red", "green", "blue"));
        int count = 3;

        RaceGame raceGame = new RaceGame(cars, count);

        //when
        raceGame.race(() -> true);

        //then
        for (Car car : raceGame.getCars()) {
            assertThat(car.getPosition()).isEqualTo(3);
        }
    }
}
