package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Generator {

    private ArrayList<Toy> toys;

    private Toy toy;
    private int id;

    Random random = new Random();

    public Toy giveTheToy (ArrayList<Toy> toys) {
        id = random.nextInt(toys.size());
        toy = toys.get(id);
        if (toy.getCount() > 0){
            toy.toString();
            toy.setCount(toy.getCount() - 1);
            System.out.println("Congratulation! You are win the toy:" + toy.getModel());
            SaveToJson save = new SaveToJson(toy);
            save.saveToJson();
            return toy;
        } else{
            System.out.println("This model of toy " + toy.getModel() + " is empty!");
            return toy;
        }
    }
}
