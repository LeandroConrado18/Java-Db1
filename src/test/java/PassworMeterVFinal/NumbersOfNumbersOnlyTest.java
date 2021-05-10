package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersOfNumbersOnlyTest {

    void shouldReturnZeroWithoutNumbersOnly() {
        var result = new NumbersOfNumbersOnly("leandro");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfUpperCaseLetters() {
        var result = new NumbersOfNumbersOnly("123456");
        assertEquals(6, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumbersOfNumbersOnly("123456");
        assertEquals(-6, result.calculateBonus());
    }
}