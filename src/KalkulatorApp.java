public class KalkulatorApp {
    public static void main(String[] args) {
        String dzialanie = InputManager.getOperation();
        OperationValidator.validate(działanie); //todo obsługa wyjatku

        String liczba1 = InputManager.getNumber(); //todo obsługa wyjatku
        NumberValidator.validate(liczba1);

        String liczba2 = InputManager.getNumber(); //todo obsługa wyjatku
        NumberValidator.validate(liczba2);

  System.out.println(Operations.giveAnswer(dzialanie,liczba1,liczba2)); //todo obsługa wyjatku... czy napewno?
    }
}
