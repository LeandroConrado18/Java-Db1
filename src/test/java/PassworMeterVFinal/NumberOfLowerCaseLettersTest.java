package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLowerCaseLettersTest {

    @Test
    void shouldReturnZeroWithoutLowerCase() {
        var result = new NumberOfLowerCaseLetters("AABBCC@");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfPasswordLowerCaseLetters() {
        var result = new NumberOfLowerCaseLetters("LeLe");
        assertEquals(2, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfLowerCaseLetters("LeLe");
        assertEquals(4, result.calculateBonus());

    }
}