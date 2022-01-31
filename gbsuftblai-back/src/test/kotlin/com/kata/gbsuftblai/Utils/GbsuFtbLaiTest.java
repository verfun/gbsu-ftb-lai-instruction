package com.kata.gbsuftblai.Utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * The type Gbsu ftb lai test.
 */
public class GbsuFtbLaiTest {

    private ConvertToString convertToString;

    /**
     * Is divisible by three.
     *
     * @param inputNumber the input number
     * @param expected    the expected
     */
    @ParameterizedTest
    @CsvSource({
            "9,true",
            "91,false"
    })
    void isDivisibleByThree(int inputNumber, boolean expected) {
        //Given
        int[] digits = String.valueOf(inputNumber).chars().map(Character::getNumericValue).toArray();
        //When
        boolean result = ConvertToString.isDivisibleByThree(inputNumber, digits);
        //Then
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Is divisible by five.
     *
     * @param inputNumber the input number
     * @param expected    the expected
     */
    @ParameterizedTest
    @CsvSource({
            "90,true",
            "91,false"
    })
    void isDivisibleByFive(int inputNumber, boolean expected) {
        //When
        boolean result = ConvertToString.isDivisibleByFive(inputNumber);
        //Then
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Element frequency.
     *
     * @param inputNumber       the input number
     * @param digit             the digit
     * @param expectedFrequency the expected frequency
     */
    @ParameterizedTest
    @CsvSource({
            "93443873,3,3",
            "93473,1,0"
    })
    @DisplayName("Element Frequency")
    void elementFrequency(int inputNumber, int digit, long expectedFrequency) {
        //Given
        int[] digits = String.valueOf(inputNumber).chars().map(Character::getNumericValue).toArray();
        //When
        long result = ConvertToString.getFrequency(digit, digits);
        //Then
        assertThat(result).isEqualTo(expectedFrequency);
    }

    /**
     * Convert digit to string.
     *
     * @param digit          the digit
     * @param frequency      the frequency
     * @param expectedResult the expected result
     */
    @ParameterizedTest
    @CsvSource({
            "3,2,GbsuGbsu",
            "1,1,1",
            "3,0,''"
    })
    void convertDigitToString(int digit, long frequency, String expectedResult) {
        //When
        String result = ConvertToString.convertDigit(digit, frequency);
        //Then
        assertThat(result).isEqualTo(expectedResult);
    }

    /**
     * Convert number to string.
     *
     * @param inputNumber    the input number
     * @param expectedResult the expected result
     */
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,GbsuGbsu",
            "5,FtbFtb",
            "15,GbsuFtbFtb"
    })
    void convertNumberToString(int inputNumber, String expectedResult) {
        //When
        String result = ConvertToString.convertNumber(inputNumber);
        //Then
        assertThat(result).isEqualTo(expectedResult);
    }
}
