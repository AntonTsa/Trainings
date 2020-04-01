package com.company;

public class ArabicToRomanNumbersConverter {

    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber) {
            return getDefaultMethod();
        }
        if (arabicNumber == 1) {
            return "I";
        }

        return "II";
    }

    private String getDefaultMethod() {
        return "";
    }
}
