class Consumer {
    private int id;
    private String name;
    private int unitsConsumed;

    public Consumer(int id, String name, int unitsConsumed) {
        this.id = id;
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }
}

class TariffCalculator {

    public double generateBill(Consumer consumer) {
        int units = consumer.getUnitsConsumed();
        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 200) {
            billAmount = (100 * 1.5) + ((units - 100) * 2.5);
        } else if (units <= 300) {
            billAmount = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0);
        } else {
            billAmount = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + ((units - 300) * 6.0);
        }

        return billAmount;
    }
}

public class ElectricityBill {
    public static void main(String[] args) {
        
        Consumer consumer1 = new Consumer(101, "Ananya Gupta", 250);

        TariffCalculator calculator = new TariffCalculator();

        double totalBill = calculator.generateBill(consumer1);

        System.out.println("Consumer ID: " + consumer1.getId());
        System.out.println("Name: " + consumer1.getName());
        System.out.println("Units Consumed: " + consumer1.getUnitsConsumed());
        System.out.println("Total Electricity Bill: Rs." + totalBill);
    }
}