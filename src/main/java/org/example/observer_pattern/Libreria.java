package org.example.observer_pattern;

import java.util.ArrayList;

public class Libreria implements Observable {
    private final ArrayList<Observer> suscriptores = new ArrayList<>();
    private String ultimoLibro;

    public void agregarLibro(String nombre) {
        System.out.println("Nuevo libro añadido al catalogo.");
        this.ultimoLibro = nombre;
        this.notificar();
    }

    public String getUltimoLibro() {
        return ultimoLibro;
    }

    @Override
    public void agregar(Observer observer) {
        this.suscriptores.add(observer);
    }

    @Override
    public void remover(Observer observer) {
        this.suscriptores.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer suscriptor : this.suscriptores) {
            suscriptor.actualizar();
        }
    }
}
