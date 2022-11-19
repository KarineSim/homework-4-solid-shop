// Open-Closed principle
public class Fruit extends Product implements Weighable {
    public Fruit(String name, int price) {
        super(name, price);
    }

    @Override
    public void weight() {
        System.out.println("Необходимо взвесить");
    }
}
