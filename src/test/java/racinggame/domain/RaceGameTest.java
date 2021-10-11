package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RaceGameTest {
    @Test
    @DisplayName("레이스 게임을 초기화 한다.")
    void create() {
        //given
        List<String> carNames = Arrays.asList("red", "green", "blue");
        int count = 5;

        //when
        RaceGame raceGame = new RaceGame(carNames, count);

        //then
        assertThat(raceGame.getCars()).hasSize(3);
        assertThat(raceGame.getLap()).isEqualTo(5);
    }
}
