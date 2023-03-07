package store.productStore.milkproduct;

import java.time.LocalDate;

public class Milk extends MilkProduct{
    public Milk(int id, String name, String companyName, LocalDate localdate) {
        super(id, name, companyName, localdate);
    }
}
