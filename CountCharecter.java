public class CountCharacter {
 
    public static void main(String[] args) {
        String inputString = "RKMSCC";
        char ch = 'C';
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
 
            if (inputString.charAt(i) == ch) {
                count++;
            }
        }
 
        System.out.println("The character '" + ch + "' found " + count + " times in a string '" + inputString + "'.");
    }
 
}