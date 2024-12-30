package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import es.santander.ascender.FIFO.Cola;

public class ColaTest {
    @Test
    void testAdd() {
        Cola cola = new Cola();


        cola.add("primera");
        cola.add("segunda");
        cola.add("tercera");

        // String siguiente = null;
        // int cuenta = 0;
        // while((siguiente = cola.get()) != null) {
        //     cuenta++;
        // }
        // assertEquals(3, cuenta);

        assertEquals("primera", cola.get());
        assertEquals("segunda", cola.get());
        assertEquals("tercera", cola.get());
        assertNull(cola.get());

    }
}
