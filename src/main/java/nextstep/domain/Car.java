package nextstep.domain;

public class Car {
    public static final int MAX_CAR_NAME_LENGTH = 5;
    private final String name;

    public Car(String name) {
        validateCarName(name);
        this.name = name;
    }

    private void validateCarName(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하입니다.");
        }
    }

    public String getName() {
        return name;
    }
}
