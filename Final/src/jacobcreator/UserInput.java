package jacobcreator;

public class UserInput {
    private static final java.util.Scanner SCANNER = new java.util.Scanner(System.in);

    // Error printing method, since the same error is printed more than once.
    private static void error() {
        System.out.print("\u001B[31mInvalid input!\u001B[0m ");
    }

    // Prompt the user for a double.
    private static Double getDouble(String output) {
        System.out.print(output);
        String input = SCANNER.nextLine();
        if (input.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"))
            return Double.parseDouble(input);
        else {
            error();
            return getDouble(output);
        }
    }

    // Prompt the user for a string.
    public static void getShape(String output) {
        System.out.print(output);
        String input = SCANNER.nextLine();
    }
}
