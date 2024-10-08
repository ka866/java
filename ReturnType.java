public class ReturnType
{
    public static void main(String[] args)
    {
        Boolean returnedvalue = checkZero();
        System.out.println(returnedvalue);
        byte returnedByte=getByteValue();
        System.out.println(returnedByte); 
        short returnedShort = getShortValue();
        System.out.println(returnedShort);
        int returnedInt = getIntValue();
        System.out.println(returnedInt);
        String returnedString = getStringValue();
        System.out.println(returnedString);
        float returnedFloat = getFloatValue();
        System.out.println(returnedFloat);
        double returnedDouble = getDoubleValue();
        System.out.println(returnedDouble);
        char returnedChar = getCharacterValue();
        System.out.println(returnedChar);
    }

    public static boolean checkZero()
    {
        int value = 0;
        if(value == 0)
        {
            return true; 
        }
        else
        {
            return false; 
        }
    }
    public static byte getByteValue()
    {
        int byteValue=0;
        return (byte) byteValue;
    }
    public static short getShortValue()
    {
        int shortValue=5000;
        return (short) shortValue;
    }
    public static int getIntValue()
    {
        int intValue=1000+100;
        return intValue;
    }
     public static String getStringValue()
    {
        String message="Welcome to my java file!";
        return message;
    }
    public static float getFloatValue()
    {
        float getFloatValue=10/3;
        return getFloatValue;
    }
    public static Double getDoubleValue()
    {
        double getDoubleValue=100000*10000.2;
        return getDoubleValue;
    }
    public static char getCharacterValue()
    {
        char getCharacterValue='S';
        return getCharacterValue;
    }

}