package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRoman {

    @Test
    public void Covert_0_ToEmptyString() {
        ArabicToRomanNumbersConverter converter = new ArabicToRomanNumbersConverter();

        String romanNumber = converter.convert(0);

        assertEquals("", romanNumber);
    }

    @Test
    public void Covert_1_To_I() {
        ArabicToRomanNumbersConverter converter = new ArabicToRomanNumbersConverter();

        String romanNumber = converter.convert(1);

        assertEquals("I", romanNumber);
    }
}
