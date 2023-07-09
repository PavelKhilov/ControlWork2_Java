package org.example;

import java.util.Scanner;

public class InputData {

    private String model;
    private int count;
    private int weight;

    private Toy toy;

    Scanner scanner = new Scanner(System.in);

    public Toy newToy(){
        Toy toy = new Toy();
        System.out.println("Input model: ");
        model = scanner.nextLine();
        toy.setModel(model);
        System.out.println("Input count: ");
        count = scanner.nextInt();
        toy.setCount(count);
        System.out.println("Input weight: ");
        weight = scanner.nextInt();
        toy.setWeight(weight);
        System.out.println("Added new toy!\n" + toy.toString());
        return toy;
    }

    public void changeWeight(Toy toy){
        System.out.println("Input new weight: ");
        weight = scanner.nextInt();
        toy.setWeight(weight);
        System.out.println("Changed weight for toy!\n" + toy.toString());
    }
}
