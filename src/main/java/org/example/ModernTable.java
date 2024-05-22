package org.example;

public class ModernTable implements Table {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void putThingsOver() {
        System.out.println("Estoy poniendo cosas en esta mesa moderna");
    }
}
