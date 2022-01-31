package com.kata.gbsuftblai.Utils;

import java.util.Collections;
import java.util.stream.IntStream;

/**
 * The type Convert to string.
 */
public class ConvertToString {

    /**
     * Is divisible by three boolean.
     *
     * @param inputNumber the input number
     * @param digits      the digits
     * @return the boolean
     */
    public static boolean isDivisibleByThree(int inputNumber, int[] digits) {
        return IntStream.of(digits).sum()%3 == 0;
    }

    /**
     * Gets frequency.
     *
     * @param element the element
     * @param digits  the digits
     * @return the frequency
     */
    public static long getFrequency(int element, int[] digits) {
        return IntStream.of(digits).filter(e -> e == element).count();
    }

    /**
     * Is divisible by five boolean.
     *
     * @param inputNumber the input number
     * @return the boolean
     */
    public static boolean isDivisibleByFive(int inputNumber) {
        return inputNumber%5 == 0;
    }

    /**
     * Convert digit string.
     *
     * @param digit     the digit
     * @param frequency the frequency
     * @return the string
     */
    public static String convertDigit(int digit, long frequency) {
        String result =  String.valueOf(digit);
        result = getString(digit, result);
        return String.join("", Collections.nCopies((int) frequency, result));
    }

    private static String getString(int digit, String result) {
        switch (digit) {
            case 3 : result = "Gbsu";
                break;
            case 5 : result = "Ftb";
                break;
            case 7 : result = "Lai";
                break;
        }
        return result;
    }

    /**
     * Convert number string.
     *
     * @param inputNumber the input number
     * @return the string
     */
    public static String convertNumber(int inputNumber) {
        StringBuilder stb = new StringBuilder();
        // get number's digits
        int[] digits = String.valueOf(inputNumber).chars().map(Character::getNumericValue).toArray();
        // divisible by 3
        if(isDivisibleByThree(inputNumber, digits)) {
            stb.append(convertDigit(3, 1));
        }
        if(isDivisibleByFive(inputNumber)) {
            stb.append(convertDigit(5, 1));
        }
        //contains 7
        long freq = getFrequency(7, digits);
        stb.append(convertDigit(7, freq));
        //contains 5
        freq = getFrequency(5, digits);
        stb.append(convertDigit(5, freq));
        //contains 3
        freq = getFrequency(3, digits);
        stb.append(convertDigit(3, freq));

        return stb.length() != 0 ? stb.toString() : String.valueOf(inputNumber);
    }
}
