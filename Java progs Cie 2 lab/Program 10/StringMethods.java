public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World!";
        
        // #1 Length
        int length = str.length();
        System.out.println("Length of string: " + length);
        
        // #2 Concatenation
        String newStr = str.concat(" How are you?");
        System.out.println("Concatenated string: " + newStr);
        
        // #3 String to CharArray
        char[] charArray = str.toCharArray();
        System.out.print("String to char array: ");
        for(char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // #4 String charAt
        char ch = str.charAt(0);
        System.out.println("First character of string: " + ch);
        
        // #5 Java String compareTo
        int compare = str.compareTo("Hello World!");
        System.out.println("CompareTo: " + compare);
        
        // #6 String contains
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);
        
        // #7 Java String split
        String[] splitStr = str.split(" ");
        System.out.print("Split String: ");
        for(String s : splitStr) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        // #8 Java String indexOf
        int index = str.indexOf("l");
        System.out.println("Index of 'l': " + index);
        
        // #9 Java String toString
        System.out.println("toString: " + str.toString());
        
        // #10 String reverse
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reverse: " + sb.toString());
        
        // #11 String replace
        String replacedStr = str.replace("World", "Universe");
        System.out.println("Replace 'World' with 'Universe': " + replacedStr);
        
        // #12 Substring Method
        String subStr = str.substring(6);
        System.out.println("Substring: " + subStr);
    }
}