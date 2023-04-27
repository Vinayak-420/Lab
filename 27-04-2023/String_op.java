package Lab;

public class String_op 
{
	public static void main(String[] args) {
        // Create the string
        String str = "Welcome to Java World";

        // Get the character at 5th position and display it
        char ch = str.charAt(4);
        System.out.println("Character at 5th position: " + ch);

        // Compare with "Welcome" ignoring case differences and display the result
        boolean isEqual = str.substring(0, 7).equalsIgnoreCase("Welcome");
        System.out.println("Is equal to 'Welcome': " + isEqual);

        // Concatenate "- Let us learn" and display it
        String newStr = str.concat("- Let us learn");
        System.out.println("Concatenated string: " + newStr);

        // Find the position of the first occurrence of 'a' and display it
        int pos = str.indexOf('a');
        System.out.println("Position of first 'a': " + pos);

        // Replace all occurrences of 'a' with 'e' and display it
        String replacedStr = str.replace('a', 'e');
        System.out.println("String after replacement: " + replacedStr);

        // Get the substring between 4th and 10th position and display it
        String subStr = str.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + subStr);

        // Convert the string to lowercase and display it
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);
    }
}
