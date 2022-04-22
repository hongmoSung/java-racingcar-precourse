package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("각 자동차에 이름을 부여할 수 있다.")
    public void give_a_car_name() {
        Car car = new Car("car");
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        assertThat(car.getName()).isEqualTo("car");
        assertThat(car1.getName()).isEqualTo("car1");
        assertThat(car2.getName()).isEqualTo("car2");
    }

    @Test
    @DisplayName("주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.")
    public void goOrStop() {
        int tryCount = 5;
        String names = "test1,test2,test3";
        Cars cars = new Cars(names);
        List<Car> carList = cars.getCars();

        int result = 0;
        for (int i = 0; i < tryCount; i++) {
            ++result;
            for (Car car : carList) {
                car.go();
                car.stop();
            }
        }
        assertThat(result).isEqualTo(5);
    }
}
