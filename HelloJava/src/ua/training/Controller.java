package ua.training;

import java.util.Scanner;

/**
 * Created by Anton Tsarenko on 19.11.2019.
 */
public class Controller {

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setHelloWord(inputFirstWordWithScanner(sc));
        model.setJavaWord(inputSecondWordWithScanner(sc));

        sc.close();

        view.printMessageAndSentence(View.WHOLE_SENTENCE, model.makeSentence(model.getHelloWord(), model.getJavaWord()));
    }

    // The Utility methods

    public String inputFirstWordWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_FIRST_WORD);
        String temp = sc.next();
        while(! temp.equals("Hello")) {
            view.printMessage(View.WRONG_INPUT_WORD + View.INPUT_FIRST_WORD);
            temp = sc.next();
        }
        return temp;
    }

    public String inputSecondWordWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_SECOND_WORD);
        String temp = sc.next();
        while(! temp.equals("Java!")) {
            view.printMessage(View.WRONG_INPUT_WORD + View.INPUT_SECOND_WORD);
            temp = sc.next();
        }
        return temp;
    }

}