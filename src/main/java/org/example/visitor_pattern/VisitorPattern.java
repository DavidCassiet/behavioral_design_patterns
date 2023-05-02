package org.example.visitor_pattern;

import org.example.visitor_pattern.*;

import java.util.ArrayList;

public class VisitorPattern {
    public static void visitor() {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Cafe());
        productos.add(new Fideos());

        Visitor ofertaTresPorDos = new OfertaTresPorDos();
        Visitor descuentoSegundaUnidad = new DescuentoSegundaUnidad();

        for (Producto producto : productos) {
            producto.accept(ofertaTresPorDos);
        }

        Carne carne = new Carne();
        carne.setPrecio(1200);
        carne.accept(descuentoSegundaUnidad);
    }
}
