public class DynamicPolymorphismExample   
{  
public static void main(String args[])   
{   
Fruits fruits = new Mango();   
fruits.color();                
}  
}   
class Fruits   
{  
public void color()   
{  
System.out.println("Parent class method is invoked.");  
}  
}  
class Mango extends Fruits  
{    
@Override  
public void color()   
{  
System.out.println("The child class method is invoked.");  
}  
}  