package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(String carNames) {
        String[] names = carNames.split(",");
        for (String name : names) {
            carNamingRule(name);
            Car car = new Car(name);
            cars.add(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    private void carNamingRule(String name) {
        if (name.length() > 5) throw new IllegalArgumentException("[ERROR]" + "자동차 이름은 5글자를 넘을 수 없습니다.");
    }
}
