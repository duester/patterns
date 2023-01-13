package ru.duester.patterns.memento.book;

public class GameState {
    private int health;
    private int money;
    private int diamonds;

    public GameState(int health, int money, int diamonds) {
        this.health = health;
        this.money = money;
        this.diamonds = diamonds;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public int getDiamonds() {
        return diamonds;
    }
}
