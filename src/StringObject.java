public class StringObject {
    public static void main(String[] args)
    {
        // Character array with data.
        String mystring = new String("Kanthi Aishwarya");


        // starting at index 1 for length 2.
        System.out.println("Original word is:"+mystring);
        // Display the results of the new String.
        System.out.println("Sub String is:"+mystring.substring(0,6));
    }
}
