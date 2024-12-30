package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import es.santander.ascender.LIFO.Pila;

public class PilaTest {
    @Test
    void testAdd() {
        Pila pila = new Pila();


        pila.push("primera");
        pila.push("segunda");
        pila.push("tercera");

        
        assertEquals("tercera", pila.pop());
        assertEquals("segunda", pila.pop());
        assertEquals("primera", pila.pop());
        assertNull(pila.pop());

    }
}

