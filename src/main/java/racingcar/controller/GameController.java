package racingcar.controller;

import racingcar.model.Game;
import racingcar.view.View;

public class GameController {

    public void run() {
        String names = View.getNameString();
        String numberOfGames = View.getNumberOfGames();

        Game game = new Game(names, numberOfGames);
        while (!game.gameOver()) {
            View.printCars(game.gameStart());
        }
    }

}
