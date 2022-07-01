package knapsack;

import lombok.*;

@Getter
@Setter
@ToString
public class Item {
    private Double w;
    private Double p;
    private Double unitCost;

    public Item(Double w, Double p) {
        this.w = w;
        this.p = p;
        this.unitCost = p / w;
    }
}

