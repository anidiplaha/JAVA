import Java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
class KrishnamurthyNumber {   
      
    static int fact(int number)   
    {   
        int f = 1;   
        while (number != 0) {   
            f = f * number;   
            number--;   
        }   
        return f;   
    }   
  
    static boolean checkNumber(int number)   
    {   
        int sum = 0;    //initialize sum to 0   
          
        int tempNumber = number;    //create a copy of the original number   
          
        
        while (tempNumber != 0) {   
           
            sum = sum + fact(tempNumber % 10);   
  
            
            tempNumber = tempNumber / 10;   
        }   
  
        if(sum == number)  
            return true;  
        else  
            return false;  
    }   
  
   
    public static void main(String[] args)   
    {   
        int n;  //initialize variable n  
          
       
        Scanner sc = new Scanner(System.in);  
          
        
        System.out.println("Enter any number:");  
          
         
        n = sc.nextInt();  
         
        if (checkNumber(n))   
            System.out.println(n + " is a krishnamurthy number");   
        else  
            System.out.println(n + "is not a krishnamurthy number");   
    }   
}  