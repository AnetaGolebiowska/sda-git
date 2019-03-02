public class OperationValidator {
    public static void validate(String dzialanie) throws UnsupportedOperationException {

      if (dzialanie.trim().length() >= 1 &&
              !dzialanie.trim().matches("[+-/*]"))
          throw new UnsupportedOperationException();
    }
}