class encapsulation1
{
public static void main(String[] arg)
{
Student obj = new Student();
obj.name = "Anidip"; // Compilation error. Since name is private.
String studentName = obj.name; //same as above.
}
}