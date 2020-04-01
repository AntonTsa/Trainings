package com.company;

public class ArabicToRomanNumbersConverter {

    public static final int[] ARABIC_DIGITS = {5, 1};
    public static final String[] ROMAN_DIGITS = {"V", "I"};

    public static String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber) {
            return getDefaultMethod();
        }
        StringBuilder romanNumber = getRoughRomanNumber(arabicNumber);

        for (int i = 3; i < romanNumber.length(); i++) {
            if (romanNumber.charAt(i - 3) == romanNumber.charAt(i - 2) &&
                    romanNumber.charAt(i - 2) == romanNumber.charAt(i - 1) &&
                    romanNumber.charAt(i - 1) == romanNumber.charAt(i)) {
                String nextRomanNumber = "";
                for(int j = 0; j < ROMAN_DIGITS.length; j++) {
                    if(ROMAN_DIGITS[j].equals(String.valueOf(romanNumber.charAt(i)))) {
                        nextRomanNumber = ROMAN_DIGITS[j - 1];
                    }
                }


                romanNumber.replace(i - 2, i + 1, nextRomanNumber);
            }
        }
        return romanNumber.toString();
    }

    private static StringBuilder getRoughRomanNumber(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < ARABIC_DIGITS.length; i++) {
            while (arabicNumber >= ARABIC_DIGITS[i]) {
                romanNumber.append(ROMAN_DIGITS[i]);
                arabicNumber -= ARABIC_DIGITS[i];
            }
        }

        return romanNumber;
    }

    private static String getDefaultMethod() {
        return "";
    }
}
