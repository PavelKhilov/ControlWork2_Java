package org.example;

import java.util.Scanner;

public class Toy {

    private static int count = 0;

    public String model;
    public int weight;

    Scanner scanner = new Scanner(System.in);

    public Toy(String name, int weight) {
        this.model = name;
        this.weight = weight;
    }

    private final int id;
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    {
        id = ++count;
    }
    @Override
    public String toString() {
        return String.format("Toy: (id: %d, model: %s, weight: %d)", id, model, weight);
    }

    public void Put(Toy toy){
        System.out.println("Input new model: ");
        model = scanner.nextLine();
        toy.setModel(model);
        System.out.println("Input new weight: ");
        weight = scanner.nextInt();
        toy.setWeight(weight);
        System.out.println(toy.toString());
    }

}
