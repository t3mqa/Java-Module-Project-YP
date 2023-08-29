import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        System.out.println("На скольких человек необходимо разделить счёт?");
        Scanner scanner = new Scanner(System.in);
        int people = 0;
        while (true) {
             people = scanner.nextInt();
            if (people > 1) {
                break; }
                else {
                System.out.println("Введите корректное количество гостей");
            }
        }

        Calculator calculator = new Calculator();
        Product prod = new Product();
        FinalOutput fin = new FinalOutput();
        calculator.calc();
        calculator.allNames(prod.name);
        calculator.fullPrice(prod.cost);
        calculator.calcPerPeople(people);
        fin.finalOut();
    }
}