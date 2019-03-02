
public class NumberValidator {
    public static void validate(String liczba1) throws IllegalArgumentException {
        int liczba = Integer.parseInt(liczba1);
        if (liczba != 0){
            }
        else {
            throw new IllegalArgumentException("To nie jest liczba");
        }

    }

}
//comment