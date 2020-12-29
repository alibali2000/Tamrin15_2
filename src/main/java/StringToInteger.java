public class StringToInteger
{
    public static int convert(String input) throws Exception
    {
        String regex = "-?[0-9]*";
        if (input.matches(regex))
        {
            int integer = Integer.parseInt(input);
            if (integer>=-32768&&integer<=32768)
            {
                return integer;
            }
            else
            {
                throw new Exception("argument out of rang");
            }
        }
        else
        {
            System.out.println("Wrong input");
            return 0;
        }
    }
}
