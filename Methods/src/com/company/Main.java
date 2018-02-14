package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighhScorePosition(1500);
        displayHighScorePosition("Jerome", position);

        position = calculateHighhScorePosition(900);
        displayHighScorePosition("Jerome", position);

        position = calculateHighhScorePosition(100);
        displayHighScorePosition("Jerome", position);

        position = calculateHighhScorePosition(50);
        displayHighScorePosition("Jerome", position);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;

            return finalScore;
        }

        return -1;

    }

    //procedure: a method returning type void
    public static void displayHighScorePosition(String name, int hsTablePosition){
        System.out.println(name + " managed to get into position " + hsTablePosition + " on the high score table");
    }

    public static int calculateHighhScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if(score < 1000 && score >= 500){
            return 2;
        }
        else if(score < 500 && score >= 100){
            return 3;
        }
        else{
            return 4;
        }
    }

}
