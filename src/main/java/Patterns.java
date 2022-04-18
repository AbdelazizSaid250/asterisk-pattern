public class Patterns {

    private static Patterns patterns;

    private Patterns() {
    }

    public static Patterns getInstance() {
        if (patterns == null) {
            patterns = new Patterns();
        }
        return patterns;
    }

    void hierarchicalPattern(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
