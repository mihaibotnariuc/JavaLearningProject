package com.mihaibotnariuc.maib.classesandobjects;

import com.mihaibotnariuc.maib.classesandobjects.autoservicetask.Car;
import com.mihaibotnariuc.maib.classesandobjects.autoservicetask.Garage;
import com.mihaibotnariuc.maib.classesandobjects.autoservicetask.Person;
import com.mihaibotnariuc.maib.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage autoDocGarage;
        autoDocGarage = new Garage();
        autoDocGarage.address = "Stefan cel Mare, Ihub 66";
        autoDocGarage.surfaceM2 = 420.0f;
        autoDocGarage.capacity = 25;
        System.out.println("Obiectul autoDocGarage are urmatoarele priorpietati" + " " + autoDocGarage.address + " " + autoDocGarage.surfaceM2 + " " +  autoDocGarage.capacity);
   Garage garajIaloveni = new Garage();
        System.out.println("Obiectul garajIaloveni are urmatoarele proprietati" + garajIaloveni.address + " " + garajIaloveni.surfaceM2 + " " +garajIaloveni.capacity);

        Worker vasile = new Worker();
        vasile.name = "Vasile";
        vasile.age = 54;
        System.out.println("Obiectul nostru are numele de" + " "+ vasile.name + " "+ "si are"+ " "+  vasile.age);

        Worker ion =new Worker();
        System.out.println("Obiectul nostru are numele de" + " "+ ion.name + " "+ "si are"+ " "+  ion.age);

        Person client1 = new Person("+3735695633");
        Car audiAZZ332 = new Car("313513213","Audi", client1);
        Car mercedesIIO312 = new Car("13513133","Mercedes", new Person("+32135131222"));
        System.out.println("Masina noastra este " + audiAZZ332.mark+ " si proprietarul poate fi apelat la numarul de telefon " + audiAZZ332.owner.phoneNumber);
        System.out.println("Masina noastra este " + mercedesIIO312.mark+ " si proprietarul poate fi apelat la numarul de telefon " + mercedesIIO312.owner.phoneNumber);

    }
}
