import java.util.Scanner;

public class InputManager {


    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak działania: *,+,-,/");
        String dzialanie = scanner.next();
        throw new NoSuchMethodError();
    }

    public static String getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby. Podaj 1 liczbe:");
        String liczba1 = scanner.next();
        System.out.println("Podaj 2 liczbe");
        String liczba2 = scanner.next();

        throw new NoSuchMethodError();
    }
}
