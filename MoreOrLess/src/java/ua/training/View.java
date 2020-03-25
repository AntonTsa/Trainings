package ua.training;

public class View {
    //text's constants
    public static final String WELCOME = "Welcome! Try to guess the number from 0 to 100";
    public static final String TRY_AGAIN = "Try again!";
    public static final String WRONG_TYPE = "Input INTEGER NUMBER";
    public static final String YOU_WON = "CONGRATULATIONS! THAT'S IT!";
    public static final String STATISTICS = "YOUR STATISTICS";
    public static final String ATTEMPTS = "Attempts: ";
    public static final String NUMBERS = "Numbers: ";
    public static final String NUMBER_OUT_OF_RANGE = "This number is out of rage!";
    public static final String MINIMUM = "Minimum is: ";
    public static final String MAXIMUM = "Maximum is: ";
    public static final String ENTER = "\n";
    public static final String SPACE = " ";
    public static final String MORE = "More!";
    public static final String LESS = "Less!";

    public void printMessage(String... strings){
        for (String string : strings){
            System.out.print(string);
        }
    }
}
