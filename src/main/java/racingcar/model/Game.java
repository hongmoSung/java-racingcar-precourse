package racingcar.model;

import java.util.List;

public class Game {

    private final Cars cars;
    private int tryCount;

    public Game(String names, String tryCount) {
        this.cars = new Cars(names);
        this.tryCount = Integer.parseInt(tryCount);
    }

    public boolean gameOver() {
        return tryCount == 0;
    }

    public List<Car> gameStart() {
        --tryCount;
        return cars.depart();
    }
}
