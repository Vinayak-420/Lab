package Lab;

public class StringBufferExample 
{
	public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer str = new StringBuffer("This is StringBuffer");

        // Adding a string to existing string and displaying it
        str.append("- This is a sample program");
        System.out.println(str);

        // Inserting a string at 21st position and displaying it
        str.insert(21, "Object ");
        System.out.println(str);

        // Reversing the entire string and displaying it
        str.reverse();
        System.out.println(str);

        // Replacing the word "Buffer" with "Builder" and displaying it
        str.replace(str.indexOf("Buffer"), str.indexOf("Buffer") + "Buffer".length(), "Builder");
        System.out.println(str);
    }
}
