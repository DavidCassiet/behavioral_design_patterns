package org.example.visitor_pattern;

//VISITOR
public class DescuentoSegundaUnidad implements Visitor{
    @Override
    public void visitarProducto(Cafe cafe) {
        System.out.println("Aplicando 50% Descuento en la segunda unidad a cafe.");
        double precioConDescuento = cafe.getPrecio() / 2;
        System.out.println("Precio: $" + precioConDescuento);
    }

    @Override
    public void visitarProducto(Fideos fideos) {
        System.out.println("Aplicando 50% Descuento en la segunda unidad a fideos.");
        double precioConDescuento = fideos.getPrecio() / 2;
        System.out.println("Precio: $" + precioConDescuento);
    }

    @Override
    public void visitarProducto(Carne carne) {
        System.out.println("Aplicando 50% Descuento en la segunda unidad a carne.");
        double precioConDescuento = carne.getPrecio() / 2;
        System.out.println("Precio: $" + precioConDescuento);
    }
}
