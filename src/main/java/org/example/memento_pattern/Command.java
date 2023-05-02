package org.example.memento_pattern;

import java.util.ArrayList;

//CARETAKER
public class Command {
    private final ArrayList<Snapshot> backup = new ArrayList<>();

    public void crearBackup(Snapshot backup) {
        this.backup.add(backup);
    }

    public void deshacer() {
        if (!backup.isEmpty()) {
            int index = backup.size() - 1;
            backup.get(index).restore();
        }
    }

    public void deshacerHasta(int index) {
        if (!backup.isEmpty()) {
            if (index < backup.size()) {
                backup.get(index).restore();
            } else {
                System.out.println("Numero de memento incorrecto.");
            }
        }
    }
}
