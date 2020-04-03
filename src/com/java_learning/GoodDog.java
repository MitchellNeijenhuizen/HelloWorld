package com.java_learning;

class GoodDog {

    private int size;

    public int getSize () {
        return size;
    }

    public void setSize (int s) {
        size = s;
    }

    void bark () {
        if (size > 60) {
            System.out.println("Woof Wooof");
        }
        else if (size > 14) {
            System.out.println("Roof roof");
        }
        else {
            System.out.println("Yip yip");
        }
    }
}





