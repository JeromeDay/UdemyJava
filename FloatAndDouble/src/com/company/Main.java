package com.company;

public class Main {

    public static void main(String[] args) {
        //width of 32 (4 bytes)
	    int myIntValue = 5 / 3;
        //width of 32 (4 bytes)
	    float myFloatValue = 5f / 3f; //float need to have an f after declaration. Otherwise need  = (float) #
        //width of 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 20;
        double convertedKilograms = numPounds * .45359237;
        System.out.println("20 pounds is " + convertedKilograms + " kilos");
    }
}
