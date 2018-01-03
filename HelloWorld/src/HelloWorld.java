public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello Jerome!");

        int myFirstNumber = (10 + 7) + (2 * 10);
        int mySecondNumber =  12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int difOfThousand = 1000 - myTotal;

        System.out.println("myFirstNumber = " + myFirstNumber);
        System.out.println("mySecondNumber = " + mySecondNumber);
        System.out.println("myThirdNumber = " + myThirdNumber);
        System.out.println("myTotal = " + myTotal);
        System.out.println("difOfThousand = " + difOfThousand);

    }
}
