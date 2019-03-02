public class KalkulatorApp {
    public static void main(String[] args) {

        String dzialanie;
        String liczba1;
        String liczba2;

        try{
        dzialanie = InputManager.getOperation();}
        catch (NoSuchMethodError a){
            System.out.println("Nic nie napisales!");
            return;
        }

        try {
            OperationValidator.validate(dzialanie);
        } catch(UnsupportedOperationException a){
            System.out.println("Nie podales liczby!");
            return;
        }



       try{ liczba1 = InputManager.getNumber(); }
       catch(NoSuchMethodError a){
           System.out.println("Nic nie napisales!");
           return;
       }

       try {
           NumberValidator.validate(liczba1);
       }catch(NoSuchMethodError a){
           System.out.println("To nie liczba!");
           return;
       }
       int liczba1Int = StringIntoInt.StringIntoInt(liczba1);

        try{ liczba2 = InputManager.getNumber(); }
        catch(NoSuchMethodError a){
            System.out.println("Nic nie napisales!");
            return;
        }

        try {
            NumberValidator.validate(liczba2);
        }catch(NoSuchMethodError a){
            System.out.println("To nie liczba!");
            return;
        }
        int liczba2Int =StringIntoInt.StringIntoInt(liczba2);

        System.out.println("Twój wynik to:");
        System.out.print(Operations.giveAnswer(dzialanie,liczba1Int,liczba2Int)); //todo obsługa wyjatku... czy napewno?
    }
}
