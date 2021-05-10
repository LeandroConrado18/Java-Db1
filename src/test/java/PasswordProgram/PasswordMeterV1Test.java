package PasswordProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordMeterV1Test {

    @Test
    void check_score_and_complexity() {

        // Primeiro teste
        var meter = new PasswordMeterV1();
        var expected_score = 52;
        var expected_complexity = "Good";
        meter.checkPassword("Lele123");
        assertEquals(expected_score, meter.score);
        assertEquals(expected_complexity, meter.sComplexity);

    }
    @Test
    void check_number_characters_bonus(){
        // Segundo Teste
        var meter = new PasswordMeterV1();
        meter.checkPassword("MarlosEhZika");

        var expected_countLength = 12;
        var expected_bonusLength = 48;

        assertEquals(expected_countLength, meter.countLength);
        assertEquals(expected_bonusLength, meter.bonusLength);

        // Estou estudando o programa para criar Classes e metodos melhores para ele.
        // Em breve atualizarei
    }
}