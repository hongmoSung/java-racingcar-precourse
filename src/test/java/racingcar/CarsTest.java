package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarsTest {

    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분")
    public void generate_cars_test() {
        Cars cars = new Cars("pobi,woni");
        List<Car> carList = cars.getCars();
        List<String> carNames = new ArrayList<>();

        for (Car car : carList) {
            String name = car.getName();
            carNames.add(name);
        }

        assertThat(carNames).contains("pobi", "woni");
    }

    @Test
    @DisplayName("이름은 5자 이하만 가능하다.")
    public void car_name_validation() {
        assertThatThrownBy(() -> new Cars("pobi,javaji"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
