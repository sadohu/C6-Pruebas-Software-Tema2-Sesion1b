package pe.edu.cibertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tema2Sesion1bTest {

    @Test
    public void leapAssertTrue(){
        assertTrue(Tema2Sesion1b.isLeap(2000));
    }

    public void passwordLessThan6CaractersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("aaaab"));
    }

    public void passwordMoreThan10CaractersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("1234567890"));
    }

    public void passwordContainsJustLettersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("aaaabbbbc"));
    }

    public void  passwordContainsJustLetterAndNumbersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("aaaa1234bb"));
    }

    public void passwordContainsLettersNumbersAndCapitalLetterAssertTrue(){
        assertTrue(Tema2Sesion1b.pciPass("Aaaabbbb12"));
    }
}