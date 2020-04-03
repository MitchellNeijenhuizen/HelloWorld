package com.java_learning;

class Dog {

    private int height;

    public void setHeight (int ht) {
        if (ht > 9) {
            System.out.println("The value for the instance variable height = " + ht + " is valid.");
            height = ht;
            System.out.println("Instance variable 'height' has been set to " + height +".");
        }
        else {
            System.out.println("The value for the instance variable height = " + ht + " is invalid.");
        }
    }
}

public class DogTestDrive {

    public static void main (String [] arg) {
        Dog mootOne = new Dog();
        Dog mootTwo = new Dog();
        mootOne.setHeight(15);
        mootTwo.setHeight(5);
    }
}














