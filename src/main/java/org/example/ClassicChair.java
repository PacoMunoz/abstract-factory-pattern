package org.example;

public class ClassicChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Estoy sentado en una silla clasica.");
    }
}
