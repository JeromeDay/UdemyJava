package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    System.out.println("1 + 2 = " + result);

	    int previousResult = result;

	    result = result - 1;
	    System.out.println(previousResult + " - 1 = " + result);

	    previousResult = result;

	    result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien.");
        }

        int topScore = 80;
        if (topScore >= 100){
            System.out.println("You got the top score.");
        }

        int secondTopScore = 91;
        if((topScore > secondTopScore) && (secondTopScore < 100)){
            System.out.println("Greater than the second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("One of these tests is true");
        }

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This isn't supposed to happen");


        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        double myDouble = 20;
        double mySecondDouble = 80;
        double myResult = (myDouble + mySecondDouble) * 25;
        myResult = myResult % 40;

        if(myResult <= 20)
            System.out.println("My Total was over the limit, total was : " + myResult);

    }
}
