
public class NumberValidator

{
    public static void validate(String liczba1)

    {
       for(char ch: liczba1.toCharArray() )
        if (Character.isDigit(ch));
        else{
        throw new NoSuchMethodError();}

    }

}
//comment