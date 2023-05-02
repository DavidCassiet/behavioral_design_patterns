package org.example.visitor_pattern;

public class Fideos implements Producto {
    private static final String nombre = "Fideos";
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitarProducto(this);
    }
}
