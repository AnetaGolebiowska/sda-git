public class Operations {
    public static int giveAnswer(String działanie, int liczba1, int liczba2) {
        char znak = działanie.charAt(0);

        if (znak == '+') {
            return liczba1 + liczba2;
        } else if (znak == '-') {
            return liczba1 - liczba2;
        } else if (znak == '*') {
            return liczba1 * liczba2;
        } else if (znak == '/'){
            return liczba1 / liczba2;
        } else{
            throw new UnsupportedOperationException(
                    "To nie jest znak działania matematycznego");
        }
    }
}
