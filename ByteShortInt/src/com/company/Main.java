package com.company;

public class Main {

    public static void main(String[] args) {
        //int hsa a width of 32
	    int myMinValue = -2_147_483_648; //_ means literal
	    int myMaxValue = 2_147_483_647;
	    int myTotal = (myMinValue/2);
	    System.out.println("myTotal = " + myTotal);

        //byte has a width of 8
	    byte myByteValue = -128;
	    byte myNewByteValue = (byte) (myByteValue/2);
	    System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //need to have an L after a long value in order for the computer to know its a long value
        //long has a width of 64
        long myMinLongValue = -9_223_372_036_854_755_808L;
        long myMaxLongValue = 9_223_372_036_854_755_807L;


        byte myByte = 12;
        int myInt = 12;
        short myShort = 12;
        long myLong = 50000 + 10 * (myByte + myInt + myShort);
        System.out.println("myLong = " + myLong);




    }
}
