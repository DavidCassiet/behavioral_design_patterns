package org.example.visitor_pattern;

//VISITOR
public class OfertaTresPorDos implements Visitor{
    @Override
    public void visitarProducto(Cafe cafe) {
        System.out.println("Aplicando Oferta 3x2 a cafe");
    }

    @Override
    public void visitarProducto(Fideos fideos) {
        System.out.println("Aplicando Oferta 3x2 a fideos");
    }

    @Override
    public void visitarProducto(Carne carne) {
        System.out.println("Aplicando Oferta 3x2 a carne");
    }
}
