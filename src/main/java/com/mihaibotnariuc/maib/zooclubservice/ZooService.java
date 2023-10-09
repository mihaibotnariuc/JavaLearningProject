package com.mihaibotnariuc.maib.zooclubservice;

public class ZooService {
    public static void main(String[] args) {

    Animal charlyDog = new Dog("Charly");
        System.out.println(charlyDog.getName());
        charlyDog.eat();
        charlyDog.makeSound();

        Animal rexDog = new Dog("rexDog");
        System.out.println(rexDog.getName());

        Cat bonitaCat = new Cat("bonitCat");
        bonitaCat.eat();
        bonitaCat.makeSound();


    }

}
