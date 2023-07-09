package org.example;

public class Toy {

    private static int id = 0;

    public String model;

    public int count;
    public int weight;


    public Toy(String name, int count, int weight) {
        this.model = name;
        this.count = count;
        this.weight = weight;
    }

    public Toy() {}

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0 && weight <= 100)
            this.weight = weight;
        else
            System.out.println("Incorrect value! Return again.");
    }

    {
        id = ++id;
    }
    @Override
    public String toString() {
        return String.format("Toy: (id: %d, model: %s, count: %d, weight: %d)", id, model, count, weight);
    }
}
