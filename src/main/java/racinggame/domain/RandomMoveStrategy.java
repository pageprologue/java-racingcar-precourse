package racinggame.domain;

import nextstep.utils.Randoms;

public class RandomMoveStrategy implements MoveStrategy {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int STOP_THRESHOLD = 3;

    @Override
    public boolean canMove() {
        int randomValue = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        return randomValue > STOP_THRESHOLD;
    }
}
