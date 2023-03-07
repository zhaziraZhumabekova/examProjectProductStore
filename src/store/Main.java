package store;

import store.productStore.MyException;
import store.productStore.flourProduct.Bread;
import store.productStore.flourProduct.Flour;
import store.productStore.flourProduct.Pasta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        ServiceImpl serviceim = new ServiceImpl();

        products.add(new Bread(1, "bread1", "Nur", LocalDate.of(2023, 03, 14)));
        products.add(new Bread(2, "bread2", "justName", LocalDate.of(2023, 1, 23)));
        products.add(new Bread(3, "bread3", "Toyboss", LocalDate.of(2023, 3, 1)));

        products.add(new Flour(1, "flourName", "Nur", LocalDate.of(2023, 4, 26)));
        products.add(new Flour(2, "flour", "Toyboss", LocalDate.of(2023, 3, 12)));
        products.add(new Flour(3, "flourName", "Milka", LocalDate.of(2023, 5, 26)));

//        serviceim.addNewProduct(products);
//        serviceim.sortByDiscount(products);
        try {
            serviceim.checkToManager(products);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}