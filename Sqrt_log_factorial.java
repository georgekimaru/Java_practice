import java.util.Scanner; //Import the Scanner Class

public class MathOps {

    public static void main(String[] args) {

        System.out.println("Welcome to the simple math helper.");
        System.out.println("What would you like to calculate");
        System.out.println("1. Sqrt");
        System.out.println("2. Log");
        System.out.println("3. Factorial");

        Scanner numberChoice = new Scanner(System.in); // Create a Scanner object
        try {
            int Choice = numberChoice.nextInt(); // Read user choice
            if (Choice != 1 && Choice != 2 && Choice != 3) {
                System.out.println("Enter 1,2 or 3"); // If choice is not 1,2 or 3

            } else if (Choice == 1) { // When user chooses 1 (SquareRoot)
                Scanner sqrtSC = new Scanner(System.in);
                try {
                    double sqrtNo = sqrtSC.nextDouble(); // Read number to be Sqrt'd
                    double sqrtResult = Math.sqrt(sqrtNo);

                    System.out.println(sqrtResult);

                } finally {
                    sqrtSC.close();
                }
            } else if (Choice == 2) { // When user chooses 2 (Log of Number)
                Scanner logSC = new Scanner(System.in);
                try {
                    double logNo = logSC.nextDouble(); // Read number to be log'd
                    double logResult = Math.log(logNo);
                    System.out.println(logResult);
                } finally {
                    logSC.close();
                }
            } else if (Choice == 3) { // When use chooses 3 (Factorial of Number)
                double factNo, fact = 1;
                Scanner factSC = new Scanner(System.in);
                try {
                    factNo = factSC.nextDouble();
                    for (int i = 1; i <= factNo; i++) {
                        fact = fact * i;
                    }
                    System.out.println(fact);
                } finally {
                    factSC.close();
                }
            }
        } finally {
            numberChoice.close();
        }
    }
}
