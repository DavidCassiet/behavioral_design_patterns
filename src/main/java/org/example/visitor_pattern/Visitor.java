package org.example.visitor_pattern;

public interface Visitor {
    void visitarProducto(Cafe cafe);
    void visitarProducto(Fideos fideos);
    void visitarProducto(Carne carne);
}
