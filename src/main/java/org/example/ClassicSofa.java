package org.example;

public class ClassicSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Me estoy sentando en este sofa clasico");
    }
}
