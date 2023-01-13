package ru.duester.patterns.memento;

import ru.duester.patterns.memento.book.Game;
import ru.duester.patterns.memento.book.GameStateKeeper;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameStateKeeper stateKeeper = new GameStateKeeper();

        System.out.println(game);
        stateKeeper.pushState(game.saveState());

        game.buyIceCream();
        game.buyYacht();
        game.goToNextRound();

        System.out.println(game);
        stateKeeper.pushState(game.saveState());

        game.buyYacht();

        game.restoreState(stateKeeper.popState());
        System.out.println(game);

        game.restoreState(stateKeeper.popState());
        System.out.println(game);
    }
}
