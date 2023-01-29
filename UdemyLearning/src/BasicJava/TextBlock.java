package BasicJava;

public class TextBlock {
    
    public static void main(String[] args) {
        
        String bulletIt = "Print a Bulleted List:\n" +
            "\t\u2022 First Point\n" + 
            "\t\u2022 Sub Point";
        
        System.out.println(bulletIt);

        String textBlock = """
                Print Bulleted list:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, birth year is %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n", (float)age);
        
    }
}
