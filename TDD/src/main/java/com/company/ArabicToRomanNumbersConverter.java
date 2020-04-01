package com.company;

public class ArabicToRomanNumbersConverter {

    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber) {
            return getDefaultMethod();
        }
        return getSimpleRomanNumber(arabicNumber);
    }

    private String getSimpleRomanNumber(int arabicNumber) {
        String romanNumber = "";
        while (arabicNumber >= 5) {
            romanNumber += "V";
            arabicNumber -= 5;
        }
        while (arabicNumber >= 1) {
            romanNumber += "I";
            arabicNumber--;
        }
        return romanNumber;
    }

    private String getDefaultMethod() {
        return "";
    }
}
