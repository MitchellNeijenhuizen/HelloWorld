package com.java_learning;

class GoodDogTestDrive {

    public static void main (String[] args) {
        GoodDog[] pets;
        pets = new GoodDog[7];
        // GoodDog[] pets = new GoodDog[7];
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();
        pets[0].setSize(70);
        pets[1].setSize(8);
        System.out.println("Dog one: " + pets[0].getSize());
        System.out.println("Dog one: " + pets[1].getSize());
        pets[0].bark();
        pets[1].bark();
        int x = pets[0].getSize();
        System.out.println(x);
    }
}

