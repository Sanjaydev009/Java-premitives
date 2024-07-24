package com.trainingmug.java;

public class TypeCasting {
    public static void main(String[] args) {

        byte age;
        age = 23;
        int ageValue;
        ageValue = age;
        System.out.println("Age :" + ageValue);

        float value;
        value = 123455.23f;

        int intValue;
        intValue = (int)value;
        System.out.println("Value :" + intValue);

        ageValue = 130;
        age = (byte)ageValue;
        System.out.println("Age :" + age);

    }
}
