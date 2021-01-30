package chapter10;

public class Banana extends Fruit {
    Banana() {
        setCalories(5);
    }

    @Override
    public void makeJuice() {
        System.out.println("Making banana juice!");
    }

    public void peel() {
        System.out.println("Peeling oranges!");
    }
}
