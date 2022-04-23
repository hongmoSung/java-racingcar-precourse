package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.regex.Pattern;

public class Car {

    private final String name;
    private int forwardCount = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void depart() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        randomNumberValidation(randomNumber);
        if (randomNumber >= 4) forwardCount += 1;
    }

    private void randomNumberValidation(Integer randomNumber) {
        if (!Pattern.matches("\\d", randomNumber.toString()))
            throw new IllegalArgumentException("[ERROR] " + "랜덤숫자는 0-9만 가능합니다.");
    }

    public void printCar() {
        StringBuilder scoreLine = new StringBuilder();
        for (int i = 0; i < forwardCount; i++) {
            scoreLine.append("-");
        }
        System.out.println(name + " : " + scoreLine);
    }

}
