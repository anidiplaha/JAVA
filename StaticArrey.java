public class StaticArray   
{  
private static String[] array;  
static   
{  
array = new String[2];  
array[0] = "Welcome to";  
array[1] = "Javatpoint";  
}  
public static void main(String args[])   
{  
for(int i = 0; i < array.length; i++)  
{  
System.out.print(array[i] + " ");  
}  
}  
}  