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
}
