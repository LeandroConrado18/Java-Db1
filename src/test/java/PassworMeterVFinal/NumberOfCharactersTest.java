package PassworMeterVFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfCharactersTest {

    @Test
    void shouldReturnZeroUsingEmptyPassword() {
        var result = new NumberOfCharacters("");
        assertEquals(0, result.calculateNumberOfCharacters());
    }

    @Test
    void shouldReturnTheSameNumbersOfPasswordCharacters() {
        var result = new NumberOfCharacters("abcd");
        assertEquals(4, result.calculateNumberOfCharacters());

    }
    @Test
    void shouldReturnTheExactBonus() {
        var result = new NumberOfCharacters("lele12");
        assertEquals(24, result.calculateBonus());

    }


}