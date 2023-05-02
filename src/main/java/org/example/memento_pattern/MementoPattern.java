package org.example.memento_pattern;

public class MementoPattern {
    public static void memento() {
        TextEditor originator = new TextEditor("Primer texto.");
        Command careTaker = new Command();

        careTaker.crearBackup(originator.crearSnapshot());

        originator.setTexto("Segundo texto.");
        careTaker.crearBackup(originator.crearSnapshot());

        originator.setTexto("Tercer texto.");
        careTaker.crearBackup(originator.crearSnapshot());

        originator.setTexto("Cuarto texto.");

        careTaker.deshacer();
        System.out.println(originator.getTexto());

        careTaker.deshacerHasta(0);
        System.out.println(originator.getTexto());
    }
}
