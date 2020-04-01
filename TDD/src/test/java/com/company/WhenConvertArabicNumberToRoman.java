package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRoman {

    @Test
    public void Covert_0_ToEmptyString() {
        String romanNumber = convertToRoman(0);
        assertEquals("", romanNumber);
    }

    private String convertToRoman(int i) {
        ArabicToRomanNumbersConverter converter = new ArabicToRomanNumbersConverter();
        return converter.convert(i);
    }

    @Test
    public void Covert_1_To_I() {
        String romanNumber = convertToRoman(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void Covert_2_To_II() {
        String romanNumber = convertToRoman(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void Covert_3_To_III() {
        String romanNumber = convertToRoman(3);
        assertEquals("III", romanNumber);
    }

    @Test
    public void Covert_5_To_V() {
        String romanNumber = convertToRoman(5);
        assertEquals("V", romanNumber);
    }

    @Test
    public void Covert_6_To_VI() {
        String romanNumber = convertToRoman(6);
        assertEquals("VI", romanNumber);
    }

    @Test
    public void Covert_8_To_VIII() {
        String romanNumber = convertToRoman(8);
        assertEquals("VIII", romanNumber);
    }
}
