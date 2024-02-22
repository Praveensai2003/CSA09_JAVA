import java.util.Scanner;

public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer data types
        System.out.print("Enter a value for byte: ");
        byte myByte = scanner.nextByte();

        System.out.print("Enter a value for short: ");
        short myShort = scanner.nextShort();

        System.out.print("Enter a value for int: ");
        int myInt = scanner.nextInt();

        System.out.print("Enter a value for long: ");
        long myLong = scanner.nextLong();

        // Floating-point data types
        System.out.print("Enter a value for float: ");
        float myFloat = scanner.nextFloat();

        System.out.print("Enter a value for double: ");
        double myDouble = scanner.nextDouble();

        // Character data type
        System.out.print("Enter a value for char: ");
        char myChar = scanner.next().charAt(0);

        // Boolean data type
        System.out.print("Enter a value for boolean (true/false): ");
        boolean myBoolean = scanner.nextBoolean();

        // Printing values
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        scanner.close();
    }
}
