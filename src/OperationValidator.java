public class OperationValidator {
    public static void validate(String działanie) throws IllegalArgumentException {

      if (działanie.trim().length() > 1 &&
              !działanie.trim().matches("/[+-/*]/g"))
          throw new IllegalArgumentException(
                  "To nie jest znak działania matematycznego"
          );
    }
}