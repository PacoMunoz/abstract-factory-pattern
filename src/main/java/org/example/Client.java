package org.example;

public class Client {

    // This class don't care which concrete factory they use since they work
    // with factories and products through abstract interfaces

    private final FurnitureFactory furnitureFactory;

    public Client(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Chair createChair() {
        return furnitureFactory.createChair();
    }

    public Table createTable() {
        return furnitureFactory.createTable();
    }

    public Sofa createSofa() {
        return furnitureFactory.createSofa();
    }
}
