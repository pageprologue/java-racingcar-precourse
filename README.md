# 자동차 경주 게임

## 기능 요구사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이 하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
- 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
- 사용자가 잘못된 값을 입력할 경우 “[ERROR]”로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.

## 기능 목록

- 자동차
    - [x] 자동차는 이름과 위치를 갖는다.
        - [x] 자동차 이름이 비어있는 경우(1자 미만) 예외가 발생한다.
        - [x] 자동차 이름이 5자 이하인 경우 예외가 발생한다.
    - [x] 레이스를 진행하면 이동 전략에 따라 전진하거나 멈춘다.
        - [x] 0 ~ 9 사이의 랜덤 값에 따라 이동한다.
            - [x] 랜덤 값이 4 이상이면 전진한다.
            - [x] 랜덤 값이 3 이하이면 멈춘다.

- 랩
    - [x] 레이스의 시도 횟수를 갖는다.
        - [x] 시도 횟수가 1회 미만인 경우 예외가 발생한다.

- 우승자
    - [x] 가장 많이 전진한 자동차가 우승한다.
    - [x] 우승자는 한 명 이상일 수 있다.

- 레이스 게임
    - [x] 레이스에 참여할 자동차와 레이스 횟수를 초기화한다.
    - [x] 레이스 횟수 만큼 레이스를 진행한다.
    - [x] 레이스가 끝나면 우승자를 조회한다.
    
- 입력
    - [ ] 레이스 경주에 참여할 자동차의 이름을 구분자(",")를 통해 입력 받는다.
    - [ ] 레이스 경주 횟수를 입력받는다.
        - [ ] 레이스 경주 횟수가 숫자가 아닌 경우 예외가 발생한다.
    - [ ] 사용자가 잘못된 값을 입력할 경우 “[ERROR]”로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.

- 출력
    - [ ] 사용자 입력을 위한 안내 메시지를 출력한다.
    - [ ] 자동차의 이름과 레이스 결과(전진 횟수)를 출력한다.
    - [ ] 레이스 경주의 우승자를 출력한다.
