package org.example.observer_pattern;

public interface Observable {
    void agregar(Observer observer);
    void remover(Observer observer);
    void notificar();
}
