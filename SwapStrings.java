public class SwapStrings {
 
    public static void main(String[] args) {
 
        String firstString = "one";
        String secondString = "two";
 
        System.out.println("Before swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);
 
        firstString = firstString + secondString; 
        secondString = firstString.substring(0, (firstString.length() - secondString.length())); 
        firstString = firstString.substring(secondString.length()); 
 
        System.out.println("\nAfter swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);
 
    }
 
}