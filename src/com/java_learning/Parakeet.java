package com.java_learning;

public class Parakeet {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        name = inputName;
    }
}

class ParakeetTestDrive {
    public static void main(String[] args) {
        Parakeet one = new Parakeet();
        one.setName("Flip");
        System.out.println(one.getName());
    }
}

