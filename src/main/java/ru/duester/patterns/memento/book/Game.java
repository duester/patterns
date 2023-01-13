package ru.duester.patterns.memento.book;

public class Game {
    private int health = 100;
    private int money = 100;
    private int diamonds = 100;

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public int getDiamonds() {
        return diamonds;
    }

    public void goToNextRound() {
        health--;
        System.out.println("Следующий раунд. Осталось здоровья: " + health);
    }

    public void buyIceCream() {
        money--;
        System.out.println("Покупка мороженого. Осталось монет: " + money);
    }

    public void buyYacht() {
        diamonds -= 50;
        System.out.println("Покупка яхты. Осталось алмазов: " + diamonds);
    }

    public GameState saveState() {
        System.out.println("игра сохранена");
        return new GameState(health, money, diamonds);
    }

    public void restoreState(GameState state) {
        health = state.getHealth();
        money = state.getMoney();
        diamonds = state.getDiamonds();
        System.out.println("игра восстановлена");
    }

    @Override
    public String toString() {
        return "Здоровье: " + health + ", монеты: " + money + ", алмазы: " + diamonds;
    }
}
