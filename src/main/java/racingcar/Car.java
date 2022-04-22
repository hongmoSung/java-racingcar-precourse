package racingcar;

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
}
