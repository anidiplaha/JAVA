public class SearchStringEmp{
   public static void main(String[] args) {
      String strOrig = "Anudip Foundation for Social Welfare";
      int intIndex = strOrig.indexOf("Social");
      
      if(intIndex == - 1) {
         System.out.println("Hello not found");
      } else {
         System.out.println("Found Hello at index " + intIndex);
      }
   }
}