package com.mihaibotnariuc.maib.methodstask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(1,100));

        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));

        int randomInt = DataGeneratorUtil.getRandomInt(-50);
        System.out.println(randomInt);
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));

        Customer customer1 = new Customer("Mihai","Barbat",546464579);
       String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);
        customer1.setAge(90);
        System.out.println(customer1.toString());
        customer1.setName("Fat Cosanzeana");
        System.out.println(customer1.toString());

        System.out.println("Varsta lui Mihai este: " + customer1.getAge());
        System.out.println("Familia lui Mihai este: " + customer1.getName());

        Customer customer2 = new Customer("Borea","transgender",56);
        System.out.println(customer2.toString());
    }
}
