package ua.training;

/**
 * Created by Anton Tsarenko on 19.11.2019.
 */
public class View {
    // Text's constants
    public static final String INPUT_FIRST_WORD = "Input first word: ";
    public static final String WRONG_INPUT_WORD = "Wrong input! Repeat please! ";
    public static final String INPUT_SECOND_WORD = "Input second word: ";
    public static final String WHOLE_SENTENCE = "Whole sentence: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndSentence(String message, String sentence) {
        System.out.println(message + sentence);
    }


}
