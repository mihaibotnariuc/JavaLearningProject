package com.mihaibotnariuc.maib.variables;

public class VariablesAndComments {
    public static void main(String[] args) {
        // Declare the variables
        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isStolen;
        boolean isBlocked;
        boolean isCharged;

        char condition;

        byte numberOfSimCards;
        byte randomAccessMemory;
        short productionYear;
        int numberOfOwners;
        long id;
        float operatingSystemVersion;
        double price;

        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        isStolen = false;
        isBlocked = true;
        isCharged = true;

        condition = 'A';
        numberOfOwners =2;
        randomAccessMemory = 4;
        productionYear = 2023;
        numberOfOwners = 0;
        id = 51231241243124L;
        operatingSystemVersion = 16.555F;
        price = 34552.5F;
        System.out.println("The phone is charged" + isCharged);
        System.out.println("The phone price is " + price);
    }
}
