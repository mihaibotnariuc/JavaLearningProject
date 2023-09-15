package com.mihaibotnariuc.maib.classesandobjects;

import com.mihaibotnariuc.maib.classesandobjects.autoservicetask.Garage;
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
    }
}
