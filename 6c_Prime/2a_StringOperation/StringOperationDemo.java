package Add_elements;


public class StringOperationDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("1. str1: " + str1 + ", str2: " + str2);

        // 2. Length and Character Access
        System.out.println("2. Length of str1: " + str1.length());
        System.out.println("   Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("3. str1.equals(str3): " + str1.equals(str3));
        System.out.println("   str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "Java is a powerful programming language.";
        System.out.println("4. Index of 'powerful': " + sentence.indexOf("powerful"));
        System.out.println("   Contains 'Java': " + sentence.contains("Java"));

        // 5. Substring Operations
        System.out.println("5. Substring from index 10 to 19: " + sentence.substring(10, 19));

        // 6. String Modification
        String replaced = sentence.replace("powerful", "popular");
        System.out.println("6. Modified sentence: " + replaced);

        // 7. Whitespace Handling
        String messy = "   Hello Java   ";
        System.out.println("7. Trimmed String: '" + messy.trim() + "'");

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("8. Concatenated String: " + full);

        // 9. String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("9. Splitted colors:");
        for (String color : colorArray) {
            System.out.println(" - " + color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "is ");
        System.out.println("10. StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Akshara";
        int age = 22;
        System.out.println("11. Formatted string: " + String.format("Name: %s, Age: %d", name, age));

        // 12. Email Validation
        String email = "student@example.com";
        System.out.println("12. Email contains '@': " + email.contains("@"));
        System.out.println("    Email starts with 'student': " + email.startsWith("student"));
        System.out.println("    Email ends with '.com': " + email.endsWith(".com"));
    }
}
