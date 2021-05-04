package PasswordProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordMeterV1Test {

    @Test
    void checkPassword() {

        // Primeiro teste
        var meter = new PasswordMeterV1();
        var expected_score = 52;
        var expected_complexity = "Good";
        meter.checkPassword("Lele123");
        assertEquals(expected_score, meter.score);
        assertEquals(expected_complexity, meter.sComplexity);

        // Segundo Teste
        meter.checkPassword("Marlos_Zika");
        var expected_score_2 = 44;
        var expected_complexity_2 = "Good";
        var expected_countLength = 11;
        var expected_bonusLength = 44;
        assertEquals(expected_score_2, meter.score);
        assertEquals(expected_complexity_2, meter.sComplexity);
        assertEquals(expected_countLength, meter.countLength);
        assertEquals(expected_bonusLength, meter.bonusLength);

        // Estou estudando o programa para criar Classes e metodos melhores para ele.
        // Em breve atualizarei
    }
}