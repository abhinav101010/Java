public class StringMethods {
    public static void main(String[] args) {

        // str.length() - Gives Length
        // str.charAt() - Gives char of that pos
        // str.substring() -  gets a slice of string
        // str.contains() - checks if string contains a substring
        // str.indexOf() - gets first index of a slice or char
        // str.lastIndexOf() - gets last index of a slice or char
        // str.startsWith() - check if the string starts with it
        // str.endsWith() - check if the string ends with it
        // str.equals() - checks if the string is equal to other string (== the operator doesnt work on strings)
        // str.equalsIgnoreCase() - checks if the string is equal to other string ignoring case
        // str.compareTo() - compares two strings lexicographically
        // str.replace()
        // str.replaceAll() - replaces all occurrences of a character or substring
        // str.replaceFirst() - replaces first occurrence of a character or substring
        // str.split() - splits the string into an array of substrings based on a delimiter
        // str.trim() - trims leading and trailing whitespace
        // str.strip() - strips leading and trailing whitespace
        // str.toUpperCase() - converts the string to uppercase
        // str.toLowerCase() - converts the string to lowercase
        // str.concat() - concatenates two strings
        // str.repeat() - repeats the string a specified number of times
        // str.isEmpty() - checks if the string is empty
        // str.isBlank() - checks if the string is blank
        // str.matches() - checks if the string matches a regular expression
        // str.toCharArray() - converts the string to a character array
        // String.join(str, delimiter) - joins an array of strings into a single string
        // String.format(str, args) - formats a string using a format string
        // String.valueOf(int or bool or float or other) - converts a value to a string

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