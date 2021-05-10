package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLettersOnlyTest {

    @Test
    void shouldReturnZeroUsingEmptyPassword() {
        var result = new NumberOfLettersOnly("");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfPasswordLetters() {
        var result = new NumberOfLettersOnly("lele");
        assertEquals(4, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfLettersOnly("lele");
        assertEquals(-4, result.calculateBonus());

    }
}