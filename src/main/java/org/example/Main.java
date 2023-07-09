// 1) В программе должен быть минимум один класс со следующими свойствами:
//id игрушки,
//текстовое название,
//количество
//частота выпадения игрушки (вес в % от 100)
// 2) Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
// 3) Возможность организовать розыгрыш игрушек.

package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InputData input1 = new InputData();
        Toy toy1 = input1.newToy();

        input1.changeWeight(toy1);

        InputData input2 = new InputData();
        Toy toy2 = input2.newToy();
        InputData input3 = new InputData();
        Toy toy3 = input3.newToy();

        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        System.out.println(toys);

        Generator generator = new Generator();
        generator.giveTheToy(toys);

        System.out.println(toys);
    }
}