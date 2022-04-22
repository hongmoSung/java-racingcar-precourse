package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    @DisplayName("random 값이 4이상일 경우 전진하고, 3이하의 값이면 멈춘다.")
    public void goCondition() {
        Car car = new Car("goOrStop");
        ResultPlay play1 = car.paly(4);
        ResultPlay play2 = car.paly(3);

        assertThat(play1).isEqualTo(ResultPlay.GO);
        assertThat(play2).isEqualTo(ResultPlay.STOP);
    }

    @Test
    @DisplayName("전진하는 조건은 0에서 9사이의 random 값")
    public void randomNumberValidationTest() {
        Car car = new Car("goOrStop");
        assertThatThrownBy(() -> car.paly(10))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> car.paly(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
