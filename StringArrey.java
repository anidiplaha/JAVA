public class ArrayToString {
 
    public static void main(String[] args) {
 
        String[] stringArray = { "My", "name", "is", "Anidip", "!" };
        String string1 = convertArrayToStringUsingToString(stringArray);
        System.out.println("An array converted to string using Arrays.toString(): " + string1);
        String string2 = convertArrayToStringUsingAppend(stringArray);
        System.out.println("An array converted to string using StringBuilder.append(): " + string2);
        String string3 = convertArrayToStringUsingJoin(stringArray);
        System.out.println("An array converted to string using String.join(): " + string3);
        String string4 = convertArrayToStringUsingJoining(stringArray);
        System.out.println("An array converted to string using Collectors.joining(): " + string4);
 
    }
    public static String convertArrayToStringUsingToString(String[] stringArray) {
        return Arrays.toString(stringArray);
    }
 
    public static String convertArrayToStringUsingAppend(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
 
        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
    }
 
    public static String convertArrayToStringUsingJoin(String[] stringArray) {
        String str = String.join(" ", stringArray);
        return str;
    }
 
    public static String convertArrayToStringUsingJoining(String[] stringArray) {
        String str = Arrays.stream(stringArray).collect(Collectors.joining());
        return str;
    }
 
}