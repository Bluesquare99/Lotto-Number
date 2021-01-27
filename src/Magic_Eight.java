import java.util.Scanner;
import java.util.Random;

public class Magic_Eight {

    public static void printNumbers()
    {
        char[] intArray = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println("The ASCII values for single digits are: ");
        for(int i = 0; i < intArray.length; i++) {
            int toAscii = (int) intArray[i];
            System.out.println(toAscii);
        }
    }

    public static void printLowerCase() {
        char[] lowerCaseArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("The ASCII values for lowercase letters are: ");
        for (int i = 0; i < lowerCaseArray.length; i++) {
            int toAscii = (int) lowerCaseArray[i];
            System.out.println(toAscii);
        }
    }

    public static void printUpperCase()
    {
        char[]  upperCaseArray = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        System.out.println("The ASCII values for uppercase letters are: ");
        for (int i = 0; i < upperCaseArray.length; i++) {
            int toAscii = (int) upperCaseArray[i];
            System.out.println(toAscii);
        }
    }

    public static void main(String[] args) {

        // Right now, these methods print the equivalent ASCII values for the following
//        printNumbers();
//        printLowerCase();
//        printUpperCase();

        Random rand = new Random();
        int upperBound = 7;
        int random1 = rand.nextInt(upperBound);
        int random2 = rand.nextInt(upperBound);
        int random3 = rand.nextInt(upperBound);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.print("Would you like to continue to interactive portion? ");
        String response = scanner.nextLine();
        if(response.equals("yes")) {
            System.out.println("Well here we go!");

            // Asking users questions
            System.out.print("Do you have a red car? (Yes/No) ");
            String redCar = scanner.nextLine();
            System.out.print("What is the name of your favorite pet? ");
            String favoritePetName = scanner.nextLine();
            System.out.print("What is your favorite pet's age? ");
            Integer favoritePetAge = scanner.nextInt();
            System.out.print("What's your lucky number? ");
            Integer luckyNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Do you have a favorite quarterback? (Yes/No) ");
            String favoriteQuarterback = scanner.nextLine();
            // Declaring favoriteQuarterbackJersey for access later
            Integer favoriteQuarterbackJersey = null;
                if(favoriteQuarterback.equals("Yes")) {
                    System.out.print("What is the jersey number of your favorite quarterback? ");
                    favoriteQuarterbackJersey = scanner.nextInt();
                }
            System.out.print("What is the two-digit model year of your car? ");
            Integer carModelYear = scanner.nextInt();
            scanner.nextLine();
            System.out.print("What is the first name of the your favorite actor or actress? ");
            String favoriteActor = scanner.nextLine();
            System.out.print("Enter a random number between 1 and 50. ");
            Integer randomNumber = scanner.nextInt();

            int magicBall;
            int lotto1 = 42;
            int lotto2;
            int lotto3;
            int lotto4;
            int lotto5;

            if(favoriteQuarterbackJersey != null) {
                magicBall = favoriteQuarterbackJersey * random1;
            } else {
                magicBall = luckyNumber * random1;
            }

            lotto2 =  carModelYear + luckyNumber;
            lotto3 = randomNumber - random2;
            lotto4 = favoritePetAge + carModelYear;
            lotto5 = (int) favoriteActor.charAt(0);

            System.out.println("Lottery numbers: " + lotto1 + " " + lotto2 + " " + lotto3 + " " + lotto4 + " " + lotto5 + " Magic ball: " +
                    + magicBall);

        } else {
            System.out.println("Please return later to complete the survey");
        }
    }




}
