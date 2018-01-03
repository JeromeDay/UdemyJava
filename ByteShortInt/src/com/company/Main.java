package com.company;

public class Main {

    public static void main(String[] args) {
        //int hsa a width of 32
	    int myMinValue = -2_147_483_648; //_ means literal
	    int myMaxValue = 2_147_483_647;

        //byte has a width of 8
	    byte myMinByteValue = -128;
	    byte myMaxByteValue = 127;

        //short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        //need to have an L after a long value in order for the computer to know its a long value
        //long has a width of 64
        long myMinLongValue = -9_223_372_036_854_755_808L;
        long myMaxLongValue = 9_223_372_036_854_755_807L;


    }
}
