public class DataTypeConversionDemo {
    public static void main(String[] args) {
       
        int intValue = 100;
        long longValue = intValue; 
        float floatValue = intValue; 
        double doubleValue = floatValue; 
        
        System.out.println("Implicit conversion (widening):");
        System.out.println("int to long: " + longValue);
        System.out.println("int to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        double doubleNum = 1234.5678;
        float floatNum = (float) doubleNum; 
        long longNum = (long) doubleNum; 
        int intNum = (int) longNum; 

        System.out.println("\nExplicit conversion (narrowing):");
        System.out.println("double to float: " + floatNum);
        System.out.println("double to long: " + longNum);
        System.out.println("long to int: " + intNum);

        byte byteValue = (byte) intValue; 
        System.out.println("\nOverflow scenario (int to byte): " + byteValue);
        int largeIntValue = 300;
        byte byteValue2 = (byte) largeIntValue; 
        System.out.println("Overflow scenario (int to byte): " + byteValue2);

        short shortValue = (short) largeIntValue; 
        System.out.println("Overflow scenario (int to short): " + shortValue);

        short smallShortValue = 10;
        byte byteValue3 = (byte) smallShortValue; 
        System.out.println("Underflow scenario (short to byte): " + byteValue3);
    }
}
