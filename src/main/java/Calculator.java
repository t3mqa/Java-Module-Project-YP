import java.util.Scanner;
public class Calculator {
    String allProduct = "";
    float totalPrice;
    float costPerPeople;

    void allNames(String nextProduct) {
        allProduct = allProduct + "\n" + nextProduct;
    }

    void fullPrice(float nextCost) {
        totalPrice = totalPrice + nextCost;
    }

    void calcPerPeople(int people) {
        costPerPeople = totalPrice / people;
    }

    void calc() {
        Product prod = new Product();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название товара или завершить");
            prod.name = scanner.next();
            if (prod.name.equalsIgnoreCase("завершить")) {
                break;
            } else {
                while(true) {
                System.out.println("Введите стоимость (Стоимость должна быть в формате рубли.копейки, например 10.45 или 11.40):");
                    prod.cost = scanner.nextFloat();
                    if (prod.cost > 0) {
                        System.out.println("Товар " + prod.name + " стоимостью " + prod.cost + " успешно добавлен. \nХотите добавить ещё один товар?");
break;
                    }
                }
            }
        }
    }
    }

