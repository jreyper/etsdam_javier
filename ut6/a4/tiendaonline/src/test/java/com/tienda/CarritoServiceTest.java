package com.tienda;

import java.util.List;

public class CarritoServiceTest {

    
    public double calcularSubtotal(List<Producto> carrito) {
        double subtotal = 0;

        for (Producto p : carrito) {
            subtotal += p.getPrecio() * p.getCantidad();
        }

        return subtotal;
    }

    
    public double aplicarDescuento(double subtotal, double descuento) {
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("Descuento debe estar entre 0 y 100");
        }

        return subtotal - (subtotal * descuento / 100);
    }

    
    public double calcularEnvio(double subtotal) {
        if (subtotal >= 100) {
            return 0;
        } else {
            return 5;
        }
    }

    
    public double calcularTotal(List<Producto> carrito, double descuento) {
        double subtotal = calcularSubtotal(carrito);
        double subtotalConDescuento = aplicarDescuento(subtotal, descuento);
        double envio = calcularEnvio(subtotalConDescuento);

        return subtotalConDescuento + envio;
    }
}
