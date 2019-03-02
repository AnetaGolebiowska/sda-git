public class Operations {
    public static int giveAnswer() {
        String działanie = InputManager.getOperation();
        int liczba1 = 0;
        int liczba2 = 0;

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
