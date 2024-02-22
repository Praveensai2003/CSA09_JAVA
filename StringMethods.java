public class StringMethodsAndConstructors {
    public static void main(String[] args) {
       
        String str1 = new String(); 
        String str2 = new String("Hello"); // Constructor with string parameter
        char[] charArray = {'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(charArray); // Constructor with char array parameter

        // String methods
        System.out.println("String length:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());
        System.out.println("Length of str3: " + str3.length());

        System.out.println("\nString concatenation:");
        String str4 = str2.concat(" World");
        System.out.println("str2.concat(\" World\"): " + str4);

        System.out.println("\nCharacter extraction:");
        char firstChar = str2.charAt(0); 
        
        System.out.println("First character of str2: " + firstChar);

        System.out.println("\nSubstring extraction:");
        String substr = str4.substring(6); 
        
        System.out.println("Substring of str4 from index 6: " + substr);

        System.out.println("\nString comparison:");
        boolean isEqual = str2.equals("Hello"); 
        
        System.out.println("Is str2 equal to \"Hello\"? " + isEqual);

        System.out.println("\nString modification:");
        String modifiedStr = str2.replace('l', 'L'); 
        
        System.out.println("str2 after replacing 'l' with 'L': " + modifiedStr);

        System.out.println("\nString splitting:");
        String[] splitArray = str4.split(" "); 
        
        System.out.print("Splitting str4: ");
        for (String s : splitArray) {
            System.out.print(s + " ");
        }
    }
}
