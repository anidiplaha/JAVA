public class PalindromeString 
{
    public static void main(String[] args) 
	{
 
        String name = "madam";
	string b=name
        String reversedString = "";
 
        for (int i = name.length() - 1; i >= 0; i--) 
	{
            reversedString = reversedString + name.charAt(i);
        }
 	if (b<>reversedString)
	{	
        System.out.print("The reversed string of the '" + name + "' is: ");
        System.out.println(reversedString);
	System.out.print("The String Is Palindrome");
	}
	else
	{
	System.out.print("The String Is Not Palindrome");
	}
    }
}