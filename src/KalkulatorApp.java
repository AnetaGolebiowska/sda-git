public class KalkulatorApp {
    public static void main(String[] args) {
        String działanie = null;
        try {
            działanie = InputManager.getOperation();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String liczba1 = InputManager.getNumber();
        NumberValidator.validate(liczba1);

        String liczba2 = InputManager.getNumber();
        NumberValidator.validate(liczba2);

        System.out.println(Operations.giveAnswer());
    }
}
