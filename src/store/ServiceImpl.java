package store;

import store.productStore.MyException;
import store.productStore.manager.ManagerToDoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    private final List<Product> list = new ArrayList<>();
    private final List<Product> list1 = new ArrayList<>();
    ManagerToDoList manager = new ManagerToDoList();

    @Override
    public void addNewProduct(List<Product> products) {
        System.out.println("\u001B[34m" + " OUR PRODUCTS! " + "\u001B[0m");
        products.stream().filter(a -> a.getCompanyName().equals("Nur")
                || a.getCompanyName().equals("Toyboss")
                || a.getCompanyName().equals("Milka")).filter(q -> q.getLocaldate().minusMonths(1)
                .isAfter(LocalDate.now())).forEach(System.out::println);
        list.addAll(products);
        System.out.println("\u001B[35m" + "******************************" + "\u001B[0m");
    }

    @Override
    public void sortByDiscount(List<Product> products1) {
        List<Product> list3 = products1.stream().filter(a -> a.getLocaldate().isBefore(LocalDate.now())).toList();
        System.out.println("\u001B[31m" + " EXPIRED PRODUCTS! ");
        list3.forEach(System.out::println);
        products1.removeIf(f -> f.getLocaldate().isBefore(LocalDate.now()));
        List<Product> productList = products1.stream().filter(s -> s.getCompanyName().equals("Toyboss")
                || s.getCompanyName().equals("Nur")
                || s.getCompanyName().equals("Milka")).filter(a -> !a.getLocaldate().isAfter(LocalDate.now()
                .plusDays(7))).toList();
        System.out.println("\u001B[35m" + "******************************" + "\u001B[0m");
        System.out.println("\u001B[0m" + "\u001B[32m" + " DISCOUNT PRODUCTS! ");
        productList.forEach(System.out::println);
    }

    @Override
    public void checkToManager(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your login, please");
        String login = sc.nextLine();
        System.out.println("Write your password, please");
        String password = sc.nextLine();

        if (login.equals(manager.getLogin()) ||
                password.equals(manager.getPassword())) {
            System.out.println("Welcome " + login);
            addNewProduct(products);
            sortByDiscount(products);
        } else {
            throw new MyException("Incorrect password or login! Please try again");
        }
    }
}
