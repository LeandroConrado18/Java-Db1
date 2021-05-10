package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfNumbersTest {

    @Test
    void shouldReturnZeroWithoutNumbers() {
        var result = new NumberOfNumbers("lele@");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfNumbers() {
        var result = new NumberOfNumbers("lele12");
        assertEquals(2, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfNumbers("1@2lele");
        assertEquals(8, result.calculateBonus());

    }
}