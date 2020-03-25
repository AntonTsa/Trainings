package ua.training;

import java.util.Scanner;

public class Controller {
    private final int MIN = 1;
    private final int MAX = 99;
    //Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        view.printMessage(View.WELCOME, View.ENTER);
        model.setMinNumber(MIN);
        model.setMaxNumber(MAX);
        model.setNumber(model.rand(MIN, MAX));

        do{
            inputNumber = inputInteger(scanner);
            if(isInputNumberInRange(inputNumber)){
                switch (model.isInputNumberCorrect(inputNumber)) {
                    case 0: {
                        view.printMessage(View.YOU_WON, View.ENTER,
                            View.STATISTICS, View.ENTER,
                            View.ATTEMPTS, String.valueOf(model.getCount().size()), View.ENTER,
                            View.NUMBERS, model.getCount().toString(), View.ENTER);
                        break;
                    }

                    case -1: {
                        view.printMessage(View.MORE, View.ENTER);
                        model.setMinNumber(inputNumber + 1);
                        break;
                    }
                    case 1: {
                        view.printMessage(View.LESS, View.ENTER);
                        model.setMaxNumber(inputNumber - 1);
                        scanner.close();
                        return;
                    }
                }

            }
        }while(true);
    }

    private int inputInteger(Scanner scanner) {
        while(! scanner.hasNextInt()) {
            view.printMessage(View.TRY_AGAIN, View.SPACE, View.WRONG_TYPE, View.ENTER);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private boolean isInputNumberInRange(int inputNumber) {
        if(inputNumber >= model.getMinNumber() && inputNumber <= model.getMaxNumber()) {
            return true;
        } else {
            if(inputNumber < model.getMinNumber()){
                view.printMessage(View.TRY_AGAIN, View.SPACE, View.NUMBER_OUT_OF_RANGE, View.ENTER);
                view.printMessage(View.MINIMUM, String.valueOf(model.getMinNumber()), View.ENTER);
            } else {
                view.printMessage(View.TRY_AGAIN, View.SPACE, View.NUMBER_OUT_OF_RANGE, View.ENTER);
                view.printMessage(View.MAXIMUM, String.valueOf(model.getMaxNumber()), View.ENTER );
            }
            return false;

        }
    }


}
