package entities;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
    private static Scanner scanner = new Scanner(System.in);

    public static String askString(String message) {
        System.out.println(message);
        String input = scanner.nextLine();
        return input;
    }

    public static int askInt(String message) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int input = scanner.nextInt();
        return input;
    }

    public static boolean askBoolean(String message) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        boolean input = false;
        String inputInfo = scanner.nextLine();
        if (inputInfo.contains("y")) {
            input = true;
            return input;
        }
        return input;
    }

    boolean input;

    public static LocalDate askDate(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();
        LocalDate ld = LocalDate.parse(input);
        return ld;
    }

    public static float askFloat(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        float input = scanner.nextFloat();
        return input;
    }
}
