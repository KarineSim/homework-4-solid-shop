// Open-Closed principle
// Interface segregation principle
// Dependency inversion principle
public class Vegetable extends Product implements Weighable, Packed {
    public Vegetable(String name, int price) {
        super(name, price);
    }

    @Override
    public void weight() {
        System.out.println("Необходимо взвесить");
    }

    @Override
    public void needToPack() {
        System.out.println("Необходимо упаковать");
    }
}
