import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        System.out.print("Enter the number that you need: ");
        Scanner scanner = new Scanner(System.in);

        int number;
        try {
            number = scanner.nextInt();   // convert the inserted number to integer
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Patterns.getInstance().hierarchicalPattern(number);
    }


}