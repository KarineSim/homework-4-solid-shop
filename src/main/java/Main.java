import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Liskov substitution principle
        Product[] products = {
                new Fruit("Киви", 200),
                new Vegetable("Томат", 50)
        };

        // Магические числа
        int[] count = new int[products.length];

        // DRY
        printProducts(products);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите товар и количество или введите \"end\"");

            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);

            count[productNumber] += productCount;
        }

        printBasket(products, count);

    }

    private static void printProducts(Product[] products) {
        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Product[] products, int[] count) {
        System.out.println("Товары в Вашей корзине: ");
        int totalSum = 0;
        for (int i = 0; i < products.length; i++) {
            if (count[i] != 0) {
                int sum = count[i] * products[i].getPrice();
                System.out.println((i + 1) + ". " + products[i] + " - " + count[i] + " шт., стоимость: " + sum + " руб.");
                totalSum += sum;
            }
        }
        System.out.println("Итого: " + totalSum + " руб.");
    }
}
