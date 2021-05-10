package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfUppercaseLettersTest {

    @Test
    void shouldReturnZeroWithoutUpperCaseLetters() {
        var result = new NumberOfUppercaseLetters("leandro");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfUpperCaseLetters() {
        var result = new NumberOfUppercaseLetters("LeLe");
        assertEquals(2, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfUppercaseLetters("LeLe");
        assertEquals(4, result.calculateBonus());
    }
}