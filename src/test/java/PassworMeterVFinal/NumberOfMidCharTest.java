package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfMidCharTest {

    @Test
    void shouldReturnZeroWithoutMidNumbersAndSymbols() {
        var result = new NumberOfMidChar("1lele2");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfMidNumbersAndSymbols() {
        var result = new NumberOfMidChar("1@2lele");
        assertEquals(2, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfMidChar("1@2lele");
        assertEquals(4, result.calculateBonus());

    }
}