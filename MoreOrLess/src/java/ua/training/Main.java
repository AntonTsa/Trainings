package ua.training;

/**
 * Created by Anton on 29.11.19
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
