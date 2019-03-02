public class OperationValidator {
    public static void validate(String dzialanie) {

      if (dzialanie.trim().length() >= 1 &&
              !dzialanie.trim().matches("[+-/*]"))
          throw new UnsupportedOperationException(
                  "To nie jest znak działania matematycznego"
          );
    }
}