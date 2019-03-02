import java.util.Scanner;

public class InputManager {


    public static String getOperation() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak działania: *,+,-,/");
        String działanie = scanner.next();
        if (działanie.isEmpty())
            throw new IllegalArgumentException("Wpisz znak");

        return działanie;
    }

    public static String getNumber() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby. Podaj 1 liczbe:");
        String liczba1 = scanner.next();
        System.out.println("Podaj 2 liczbe");
        String liczba2 = scanner.next();

        if (liczba1.isEmpty() || liczba2.isEmpty())
            throw new IllegalArgumentException("Błędny znak");

        return liczba1 + " i " + liczba2;
    }
}

//comment
