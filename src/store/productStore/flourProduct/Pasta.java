package store.productStore.flourProduct;

import store.Product;

import java.time.LocalDate;

public class Pasta extends FlourProduct{
    public Pasta(int id, String name, String companyName, LocalDate localdate) {
        super(id, name, companyName, localdate);
    }
}
