package com.tienda;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.tienda.CarritoService;
import com.tienda.Producto;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoServiceTest {

    CarritoService service = new CarritoService();

    @Test
    void subtotal_variosProductos() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 30, 2),
                new Producto("raton", 10, 1)
        );

        double resultado = service.calcularSubtotal(carrito);

        assertEquals(70, resultado); // 30*2 + 10*1
    }

    @Test
    void subtotal_unProducto() {
        List<Producto> carrito = List.of(
                new Producto("monitor", 100, 1)
        );

        double resultado = service.calcularSubtotal(carrito);

        assertEquals(100, resultado);
    }

    @Test
    void subtotal_carritoVacio() {
        List<Producto> carrito = List.of();

        double resultado = service.calcularSubtotal(carrito);

        assertEquals(0, resultado);
    }

    @Test
    void descuento_0() {
        double resultado = service.aplicarDescuento(100, 0);
        assertEquals(100, resultado);
    }

    @Test
    void descuento_valido() {
        double resultado = service.aplicarDescuento(100, 10);
        assertEquals(90, resultado);
    }

    @Test
    void descuento_100() {
        double resultado = service.aplicarDescuento(100, 100);
        assertEquals(0, resultado);
    }

    @Test
    void descuento_negativo() {
        double resultado = service.aplicarDescuento(100, -10);
        assertEquals(100, resultado); // comportamiento esperado (no aplicar)
    }

    @Test
    void descuento_mayor100() {
        double resultado = service.aplicarDescuento(100, 150);
        assertEquals(100, resultado); // comportamiento esperado
    }

    @Test
    void envio_menor100() {
        double resultado = service.calcularEnvio(50);
        assertEquals(5, resultado);
    }

    @Test
    void envio_igual100() {
        double resultado = service.calcularEnvio(100);
        assertEquals(0, resultado);
    }

    @Test
    void envio_mayor100() {
        double resultado = service.calcularEnvio(150);
        assertEquals(0, resultado);
    }

    @Test
    void total_sinDescuento() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 50, 1)
        );

        double resultado = service.calcularTotal(carrito, 0);

        assertEquals(55, resultado); // 50 + 5 envío
    }

    @Test
    void total_conDescuento() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 100, 1)
        );

        double resultado = service.calcularTotal(carrito, 10);

        assertEquals(90, resultado); // envío gratis
    }

    @Test
    void total_envioGratis() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 120, 1)
        );

        double resultado = service.calcularTotal(carrito, 0);

        assertEquals(120, resultado);
    }
}
