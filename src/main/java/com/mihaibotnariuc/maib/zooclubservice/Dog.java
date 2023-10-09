package com.mihaibotnariuc.maib.zooclubservice;

public class Dog extends Animal implements AnimalInterface{
    public Dog(String nameOfTheDog) {
        super(nameOfTheDog);
    }
    @Override
    public void makeSound() {
        System.out.println("Ham");
    }

    public void eat (){
            System.out.println(getName() + "is eating bones.");
        }
    }
