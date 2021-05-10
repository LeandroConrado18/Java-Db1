package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfRepeatCharactersTest {

    @Test
    void shouldReturnZeroWithoutRepetition() {
        var result = new NumberOfRepeatCharacters("Leandro");
        assertEquals(0, result.calculateOccurrence());
    }

    @Test
    void shouldReturnTheSameNumbersOfRepeatedChar() {
        var result = new NumberOfRepeatCharacters("lele12");
        assertEquals(4, result.calculateOccurrence());

    }

    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfRepeatCharacters("lele12");
        assertEquals(-3, result.calculateBonus());

    }
}