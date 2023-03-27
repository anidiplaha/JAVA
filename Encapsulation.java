public class Encapsulation{  
public static void main(String[] args) {  

    

 Account acc=new Account();  

acc.setAcc_no(12544567L);  

acc.setName("Anidip Laha");  

 acc.setEmail("anidiplaha74@gmail.com");  

acc.setAmount(500000f);  

  System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}