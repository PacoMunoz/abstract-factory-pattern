package org.example;

public class ClassicTable implements Table {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void putThingsOver() {
        System.out.println("Estoy poniendo cosas encima de esta mesa clasica");
    }
}
