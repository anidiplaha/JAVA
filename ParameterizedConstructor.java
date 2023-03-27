public class ParameterizedConstructor{
String studentName;
int studentAge;
String member;
Edureka(){
member = "YES";
}
Edureka(String name , int age){
this();
studentName = name;
studentAge = age;
}
void display(){
System.out.println(studentName + " -" + studentAge+ "-"+ "Member" + member);
}
public static void main(String args[])
{
Edureka obj = new Edureka("Manan" , 21);
obj.display();
}
}