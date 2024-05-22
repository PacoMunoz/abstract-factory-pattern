package org.example;

public class ModernChair implements Chair{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Estoy sentado en una silla moderna.");
    }
}
