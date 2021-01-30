package chapter10;

public class Apple extends Fruit {
    Apple() {
        setCalories(5);
    }

    @Override
    public void makeJuice() {
        System.out.println("Making apple juice!");
    }

    public void removeSeeds() {
        System.out.println("Removing seeds!");
    }
}
