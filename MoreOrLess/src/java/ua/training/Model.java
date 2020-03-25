package ua.training;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minNumber;
    private int maxNumber;
    private List<Integer> count;
    private int number;

    public Model() {
        this.count = new ArrayList<>();
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public List<Integer> getCount() {
        return count;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int rand(int min, int max) {
        return (int)Math.ceil(Math.random() * (max - min - 1) + min);
    }



    public int isInputNumberCorrect(int inputNumber) {
        this.count.add(inputNumber);
        return Integer.compare(inputNumber, this.number);

    }
}
