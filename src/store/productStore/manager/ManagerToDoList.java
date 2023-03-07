package store.productStore.manager;

public class ManagerToDoList {
    private final String login = "Zhazira";
    private final String password = "0909";

    public ManagerToDoList() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ManagerToDoList{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
