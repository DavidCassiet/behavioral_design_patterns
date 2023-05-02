package org.example.observer_pattern;

public class Suscriptor implements Observer{
    private final Observable libreria;

    public Suscriptor(Observable libreria) {
        this.libreria = libreria;
    }

    public void desuscribirse() {
        libreria.remover(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Notificacion: Nuevo libro disponible!");
        System.out.println(((Libreria) this.libreria).getUltimoLibro());
        System.out.println();
    }
}
