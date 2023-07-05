// 1) Напишите класс-конструктор у которого принимает минимум 3 строки,
// содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки
// 2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
// 3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию
// 4) Организовать общую очередь
// 5) Вызвать Get 10 раз и записать результат в файл

package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Toy toyPut = new Toy("test",10);
        toyPut.Put(toyPut);

        Toy toy1 = new Toy("Constructor", 2);
//        System.out.println(toy1.toString());
        Toy toy2 = new Toy("Robot", 2);
//        System.out.println(toy2.toString());
        Toy toy3 = new Toy("Dolly", 6);
//        System.out.println(toy3.toString());

        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        System.out.println(toys);

        Random random = new Random();
//        random.nextInt(3);
//        System.out.println(toys.size());
//        System.out.println(random.nextInt(toys.size()));

        ArrayList<Integer> toysId = new ArrayList<>();
        ArrayList<String> toysModel = new ArrayList<>();
        ArrayList<Integer> toysWeight = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            int id;
            id = random.nextInt(toys.size());
            toysId.add(toys.get(id).getId());
            toysModel.add(toys.get(id).getModel());
            toysWeight.add(toys.get(id).getWeight());
        }
        System.out.println("Id of random toys: " + toysId);
        System.out.println("Model of random toys: " + toysModel);
        System.out.println("Weight of random toys: " + toysWeight);

    }
}