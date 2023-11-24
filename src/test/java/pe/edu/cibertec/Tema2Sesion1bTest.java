package pe.edu.cibertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tema2Sesion1bTest {

    @Test
    public void leapAssertTrue(){
        assertTrue(Tema2Sesion1b.isLeap(2000));
    }

    @Test
    public void passwordLessThan6CaractersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("aaaab"));
    }

    @Test
    public void passwordMoreThan10CaractersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("1234567890"));
    }

    @Test
    public void passwordContainsJustLettersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("aaaabbbbc"));
    }

    @Test
    public void  passwordContainsJustLetterAndNumbersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("aaaa1234bb"));
    }

    @Test
    public void passwordContainsSpecialCaractersAssertFalse(){
        assertFalse(Tema2Sesion1b.pciPass("aaaa_bbb12"));
    }

    @Test
    public void passwordContainsLettersNumbersAndCapitalLetterAssertTrue(){
        assertTrue(Tema2Sesion1b.pciPass("aaaaBbbb12"));
    }
}