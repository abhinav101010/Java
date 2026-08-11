public class StringMethods {
    public static void main(String[] args) {
        // String - 1) StringBuilder 2) StringBuffer

        // Common methods in all three
        // .length() - Gives Length
        // .charAt() - Gives char of that pos
        // .substring() -  gets a slice of string
        // .subSequence() - gets a subsequence of the string
        // .indexOf() - gets first index of a slice or char
        // .lastIndexOf() - gets last index of a slice or char
        // .toString() - gets last index of a slice or char

        //  ========== String Methods ==========
        // .contains() - checks if string contains a substring
        // .startsWith() - check if the string starts with it
        // .endsWith() - check if the string ends with it
        // .equals() - checks if the string is equal to other string (== the operator doesnt work on strings)
        // .equalsIgnoreCase() - checks if the string is equal to other string ignoring case
        // .compareTo() - compares two strings lexicographically
        // .replace() - replaces all occurrences of a character or substring
        // .replaceAll() - replaces all occurrences of a character or substring
        // .replaceFirst() - replaces first occurrence of a character or substring
        // .split() - splits the string into an array of substrings based on a delimiter
        // .trim() - trims leading and trailing whitespace
        // .strip() - strips leading and trailing whitespace
        // .toUpperCase() - converts the string to uppercase
        // .toLowerCase() - converts the string to lowercase
        // .concat() - concatenates two strings
        // .repeat() - repeats the string a specified number of times
        // .isEmpty() - checks if the string is empty
        // .isBlank() - checks if the string is blank
        // .matches() - checks if the string matches a regular expression
        // .toCharArray() - converts the string to a character array

        // String.join(str, delimiter) - joins an array of strings into a single string
        // String.format(str, args) - formats a string using a format string
        // String.valueOf(int or bool or float or other) - converts a value to a string


        // ========== StringBuilder Methods ========== - StringBuilder is a mutable sequence of characters.

        // StringBuilder(String str) - constructs a StringBuilder with the specified string
        // StringBuilder(int capacity) - constructs a StringBuilder with the specified capacity
        // StringBuilder() - constructs an empty StringBuilder
        // .append() - appends a string to the end of the StringBuilder
        // .insert() - inserts a string at a specified position
        // .delete() - deletes a substring from the StringBuilder
        // .deleteCharAt() - deletes a character at a specified position
        // .replace() - replaces a substring with another string
        // .reverse() - reverses the characters in the StringBuilder
        // .toString() - converts the StringBuilder to a string
        // .setCharAt() - sets the character at a specified position
        // .setLength() - sets the length of the StringBuilder
        // .capacity() - returns the capacity of the StringBuilder
    
        System.out.println(" ======== String builder ======== ");
        StringBuilder sb = new StringBuilder("programming");
        System.out.println(sb);
        System.out.println(sb.substring(3,7));
        System.out.println(sb.insert(2, "123"));
        System.out.println(sb.delete(3, 6));
        System.out.println(sb.deleteCharAt(3));
        System.out.println(sb.reverse());
        sb.setLength(7);
        System.out.println(sb);

        // ========== StringBuffer Methods ========== - StringBuffer is a mutable sequence of characters.
        // StringBuffer(String str) - constructs a StringBuffer with the specified string
        // StringBuffer(int capacity) - constructs a StringBuffer with the specified capacity
        // StringBuffer() - constructs an empty StringBuffer
        // .append() - appends a string to the end of the StringBuffer
        // .insert() - inserts a string at a specified position
        // .delete() - deletes a substring from the StringBuffer
        // .deleteCharAt() - deletes a character at a specified position
        // .replace() - replaces a substring with another string
        // .reverse() - reverses the characters in the StringBuffer
        // .toString() - converts the StringBuffer to a string
        // .setCharAt() - sets the character at a specified position
        // .setLength() - sets the length of the StringBuffer
        // .capacity() - returns the capacity of the StringBuffer


        
        String str1 = "Hello";
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println(reversed);

        
        String str = "Hello, World!";
        
        int length = str.length();
        System.out.println("Length: " + length);
        
        String upperCase = str.toUpperCase();
        System.out.println("Upper Case: " + upperCase);
        
        String lowerCase = str.toLowerCase();
        System.out.println("Lower Case: " + lowerCase);
        
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);
        
        String replaced = str.replace("World", "Java");
        System.out.println("Replaced: " + replaced);
        
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);
        
        char charAt = str.charAt(7);
        System.out.println("Char at index 7: " + charAt);
        
        int indexOf = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOf);
        
        String[] split = str.split(",");
        System.out.println("Split: " + split[0] + " " + split[1]);
    }
}