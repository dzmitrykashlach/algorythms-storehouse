package knapsack;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Knapsack {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Double knapsackLimit = 11.0;
        Double actualKnapsackWeight = 0.0;
        items.add(new Item(3.0, 5.0));
        items.add(new Item(5.0, 1.0));
        items.add(new Item(4.0, 8.0));
        items.add(new Item(2.0, 9.0));
        items.add(new Item(2.0, 4.0));
        items.add(new Item(7.0, 1.0));
        items.add(new Item(5.0, 6.0));
        items.sort(Comparator.comparing(Item::getUnitCost).reversed());
        items.forEach(i -> System.out.println(i));
        System.out.println("==================================================");
        List<Item> knapsack = new ArrayList<>();
        for (Item i : items) {
            if (!((actualKnapsackWeight + i.getW()) > knapsackLimit)) {
                knapsack.add(i);
                actualKnapsackWeight = actualKnapsackWeight + i.getW();
            }
        }
        knapsack.forEach(i -> System.out.println(i));
    }
}
