import java.util.Scanner;

public class InputManager {


    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak działania: *,+,-,/");
        String dzialanie = scanner.next();
        if (dzialanie == null) {
            throw new NoSuchMethodError();
        } else return dzialanie;
    }

    public static String getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String liczba = scanner.next();

        if (liczba == null) {
            throw new NoSuchMethodError();
        } else return liczba;
    }
}
//comment
