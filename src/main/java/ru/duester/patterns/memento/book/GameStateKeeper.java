package ru.duester.patterns.memento.book;

import java.util.Stack;

public class GameStateKeeper {
    private final Stack<GameState> states = new Stack<>();

    public void pushState(GameState state) {
        states.push(state);
    }

    public GameState popState() {
        return states.pop();
    }
}
