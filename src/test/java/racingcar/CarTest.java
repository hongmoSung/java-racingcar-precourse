package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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


}
