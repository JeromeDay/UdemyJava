package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Jerome", 500);
        System.out.println("New score is " + newScore);
        newScore = calculateScore(777);
        System.out.println("New score is " + newScore);
        calculateScore();

        double cm = calcFeetAndInchesToCentimeters(157);
        if(cm > 0){
            System.out.println(cm);
        }
        else{
            System.out.println("Invalid parameters");
        }
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetandInchesToCentimeters(double feet, double inches){
        if(feet >= 0 || (inches >= 0 && inches <= 12)){
            inches += (feet * 12);
            double cm = inches * 2.54;
            return cm;
        }
        else{
            System.out.println("Invalid parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double remainder = inches % 12;
            double feet = (inches - remainder) / 12;
            System.out.println("Feet = " + feet);
            System.out.println("Inches = " + remainder);
            inches = remainder;
            return calcFeetandInchesToCentimeters(feet, inches);
        }
        else{
            return -1;
        }
    }
}
