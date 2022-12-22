import java.util.Scanner;

public class Main {

    static int power(int baseNumber, int powNumber) {
        int result = 1;
        for (int i = 1; i <= powNumber; i++) {
            result *= baseNumber;
        }
        System.out.println("Conclusion: " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);

        int powNumber;
        do {

            System.out.print("Enter the base value: ");
            int baseNumber = mec.nextInt();
            System.out.print("Enter the exponent: ");
            powNumber = mec.nextInt();
            if (powNumber >= 0) {
                power(baseNumber, powNumber);
            }
            System.out.println("You entered incorrectly! ");
        } while (true);
    }
}