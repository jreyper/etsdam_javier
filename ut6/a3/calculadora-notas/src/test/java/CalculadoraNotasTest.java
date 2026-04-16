import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraNotasTest {

    @Test
    void testMediaSimple() {
        assertEquals(7, CalculadoraNotas.calcularMedia(new int[] { 6, 7, 8 }));
    }

    @Test
    void testMediaDecimal() {
        assertEquals(8.5, CalculadoraNotas.calcularMedia(new int[] { 10, 9, 8, 7 }));
    }

    @Test
    void testCalcularMediaExito() {
        int[] notas = {5, 10, 8, 7};
        double resultado = CalculadoraNotas.calcularMedia(notas);
        
        // La media de 5+10+8+7 = 30 / 4 = 7.5
        assertEquals(7.5, resultado, 0.001);
    }

    @Test
    void testUnSoloElemento() {
        int[] notas = {10};
        assertEquals(10.0, CalculadoraNotas.calcularMedia(notas));
    }

    @Test
    void testListaVacia() {
        int[] notas = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(notas);
        });
        assertEquals("Lista vacía", exception.getMessage());
    }

    @Test
    void testNotaFueraDeRangoSuperior() {
        int[] notas = {11};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(notas);
        });
        assertEquals("Nota fuera de rango", exception.getMessage());
    }

    @Test
    void testNotaFueraDeRangoInferior() {
        int[] notas = {-1};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(notas);
        });
        assertEquals("Nota fuera de rango", exception.getMessage());
    }
}