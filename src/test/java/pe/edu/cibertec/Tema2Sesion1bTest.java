package pe.edu.cibertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tema2Sesion1bTest {

    @Test
    public void leapAssertTrue(){
        Tema2Sesion1b obj = new Tema2Sesion1b();
        assertTrue(obj.isLeap(1900));
    }
}