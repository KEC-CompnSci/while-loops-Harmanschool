
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Test repeatWord method
        String repeated = repeatWord("hello", 3);  // Expected: "hello, hello, hello"
        System.out.println("Repeated Word: " + repeated);
    
        // Test createPyramid method
        String pyramid = createPyramid(3);  // Expected: "1\n22\n333"
        System.out.println("Pyramid:\n" + pyramid);
    
        // Test countTo method
        String FizzBuzz = countTo(6);  // Expected: "1 2 Fizz 4 Buzz Fizz"
        System.out.println("FizzBuzz: " + FizzBuzz);
    }
    
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
        StringBuilder result = new StringBuilder();
        
        int i = 0;
        while (i < times) {
            result.append(word);
            if (i < times - 1) {
                result.append(" "); // Use a space instead of a comma
            }
            i++;
        }
    
        return result.toString();
    }

    
    
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        StringBuilder result = new StringBuilder();
        
        int i = 1;
        while (i <= maxNumber) {
            int j = 0;
            while (j < i) {
                result.append(i);
                j++;
            }
            if (i < maxNumber) {
                result.append("\n");
            }
            i++;
        }
    
        return result.toString();
    }
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        StringBuilder result = new StringBuilder();
        
        int i = 1;
        while (i <= maxNumber) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }
            
            if (i < maxNumber) {
                result.append(" ");
            }
            
            i++;
        }
    
        return result.toString();
    }
    
  
}