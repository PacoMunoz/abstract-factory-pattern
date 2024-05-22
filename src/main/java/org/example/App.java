package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    private static Client client;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        final var value = scanner.nextInt();

        configClient(value);

        final var sofa = client.createSofa();
        final var table = client.createTable();
        final var chair = client.createChair();

        sofa.sitOn();
        table.putThingsOver();
        chair.sitOn();

    }

    private static void configClient(int value) {
        if (value == 1) {
            client = new Client(new ModernFurnitureFactory());
        } else {
            client = new Client(new ClassicFurnitureFactory());
        }
    }
}
