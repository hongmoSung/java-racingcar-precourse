package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;

import java.util.List;

public class View {

    public View() {
    }

    public static String getNameString() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine().trim();
    }

    public static String getNumberOfGames() {
        System.out.println("시도할 횟수는 몇회 인가요?");
        return Console.readLine().trim();
    }

    public static void printCars(List<Car> cars) {
        System.out.println("실행결과");
        for (Car car : cars) {
            car.printCar();
        }
    }
}
