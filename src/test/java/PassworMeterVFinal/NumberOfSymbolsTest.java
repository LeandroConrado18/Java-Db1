package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSymbolsTest {

    @Test
    void shouldReturnZeroWithoutSymbols() {
        var result = new NumberOfSymbols("Leandro");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfSymbolsr() {
        var result = new NumberOfSymbols("@!lele12");
        assertEquals(2, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfSymbols("@!lele12");
        assertEquals(12, result.calculateBonus());

    }
}