package com.company;

public class Functions {

    public static void outputArray(int[] arrayParamiter){

        for(int i = 0; i < arrayParamiter.length; i++){

            System.out.println(arrayParamiter[i]);

        }

    }

    public static void intArray(){
        int[] integerArray1 = new int[10];
        int[] integerArray2 = new int[10];

        outputArray(integerArray1);
        outputArray(integerArray2);
    }

    public static void main(String[] args) {
        intArray();
    }

}
