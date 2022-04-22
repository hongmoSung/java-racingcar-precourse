package racingcar;

import java.util.regex.Pattern;

public class Car {

    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void go() {
        System.out.println("전진 합니다.");
    }

    public void stop() {
        System.out.println("멈춥니다.");
    }

    public ResultPlay paly(Integer randomNumber) {
        randomNumberValidation(randomNumber);
        if (randomNumber >= 4) return ResultPlay.GO;
        return ResultPlay.STOP;
    }

    private void randomNumberValidation(Integer randomNumber) {
        if (!Pattern.matches("\\d", randomNumber.toString()))
            throw new IllegalArgumentException("[ERROR] " + "랜덤숫자는 0-9만 가능합니다.");
    }
}
