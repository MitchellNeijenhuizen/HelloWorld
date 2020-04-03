package com.java_learning;

public class Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

class AnimalTestDrive {

    public static void main(String[] args) {
        Animal dog = new Animal();

        dog.setName("Nani");

        System.out.println(dog.getName());
    }
}


