public class FinalOutput {
    void finalOut() {
        Calculator calculator = new Calculator();
        Product prod = new Product();
        String end;
        if (calculator.costPerPeople < 2) end = "бль";
        else if (calculator.costPerPeople > 2 && calculator.costPerPeople < 5) end = "бля";
        else end = "блей";
                String finalOut = "Добавленные товары:%s\nКаждый человек должен заплатить %.2f ру%s.";
                String finalOutput = String.format(finalOut, prod.name, prod.cost, end);
                System.out.println(finalOutput);
        }
    }
