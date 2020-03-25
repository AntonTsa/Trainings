package ua.training;

public class Main {

    public static void main(String[] args) {
	    //Initialization
        Controller controller = new Controller(new Model(), new View());

        controller.processUser();
    }
}
