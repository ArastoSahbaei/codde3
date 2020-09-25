package com.company.constructor;

public class Constructor {
    int x;

    public Constructor() {
        x = 5;
    }

    public static void main(String[] args) {
    Constructor object = new Constructor();
    System.out.println(object.x);
    }
}
