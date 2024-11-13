package src;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testBolaNaoCabe() {
        assertEquals("N", Main.verificarSeCabe(3, 2, 3, 5));
    }

    @Test
    void testBolaMesmaDimensaoCaixa() {
        assertEquals("S", Main.verificarSeCabe(5, 5, 5, 5));
    }

    @Test
    void testBolaCabe() {
        assertEquals("S", Main.verificarSeCabe(9, 15, 9, 10));
    }
}
