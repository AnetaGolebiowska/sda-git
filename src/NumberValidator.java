
public class NumberValidator

{
    public static void validate(String liczba1) throws NoSuchMethodError

    {
        liczba1.trim();
       for(char ch: liczba1.toCharArray() )
       { if (Character.isDigit(ch));
        else{
        throw new NoSuchMethodError();}}


    }

}
//comment