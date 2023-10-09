package com.mihaibotnariuc.maib.zooclubservice;

public class Cat extends Animal implements AnimalInterface{
    public Cat (String name){
        super (name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meaw");
    }

    @Override
    public void eat() {
        System.out.println("A cat is eating kitKat");
    }
}
