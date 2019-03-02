import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class InputManager {


    public static String getOperation() throws NoSuchMethodError{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak działania: *,+,-,/");
        String dzialanie = scanner.nextLine();

        if ( dzialanie.trim().isEmpty()) {
            throw new NoSuchMethodError();
        } else return dzialanie;
    }

    public static String getNumber() throws NoSuchMethodError{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String liczba = scanner.nextLine();

        if (liczba.trim().isEmpty()) {
            throw new NoSuchMethodError();
        } else return liczba;
    }
}
//comment
