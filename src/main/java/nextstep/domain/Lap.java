package nextstep.domain;

public class Lap {
    private final int count;

    protected Lap(int count) {
        validateLap(count);
        this.count = count;
    }

    private void validateLap(int count) {
        if (count < 1) {
            throw new IllegalArgumentException("레이스 경주는 1회 이상 진행할 수 있습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
