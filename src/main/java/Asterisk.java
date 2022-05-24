import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        System.out.print("Enter the Integer number from 1 to 1000000000: ");
        Scanner scanner = new Scanner(System.in);

        long number;
        try {
            number = scanner.nextLong();   // convert the inserted number to integer
            if (number >= 1000000000) {
                throw new RuntimeException("The number is higher than expected!!");
            } else if (number < 0) {
                throw new RuntimeException("The number is negative!!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Patterns patterns = new Patterns();
        patterns.pyramidPattern(number);

//        Patterns.getInstance().hierarchicalPattern(number);
    }


}
