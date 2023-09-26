package com.mihaibotnariuc.maib.accessmodifiers;

import com.mihaibotnariuc.maib.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person mihaiPerson = new Person("mihai", "botnariuc", 1252153135);
        mihaiPerson.isRetired = false;
        if (mihaiPerson.isRetired) {
            System.out.println("Mihai e la pensie");
        } else {
            System.out.println("Mihai nu este la pensie");
        }
        Person joraPerson = new Person("Jora", "Boss", 31531351, "orhei", true);
        if (joraPerson.isRetired) {
            System.out.println("Jora e la pensie");
        } else {
            System.out.println("Jora nu e la pensie");
        }
        Person boreaPerson = new Person("Borea", "Itishnik", 12513513);
        boreaPerson.isMarried = true;
        if (boreaPerson.isMarried) {
            System.out.println("Borea e insurat");
        } else {
            System.out.println("Borea e in cautare");
        }
        Person natashaPerson = new Person("Natasha", "Ivanova", 5253513, true);
        if (natashaPerson.isMarried) {
            System.out.println("Natasha ii maritata");
        } else {
            System.out.println("Foc baieti");
        }
    }
}


