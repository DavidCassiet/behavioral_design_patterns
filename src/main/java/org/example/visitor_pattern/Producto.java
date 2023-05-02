package org.example.visitor_pattern;

public interface Producto {
    void accept(Visitor visitor);
}
