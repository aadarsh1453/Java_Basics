// 
import java.util.*;
 public class Day1 { 

     public static void main(String[] args)     //in c++ commandline argument always take 1 first argument as file name but not in java.
     {
                         /// It required to run this program only through command line otherwise give an error because 
                         /// java not take filename location as argument like C++.
         System.out.println(args[0]);
         System.out.println(args.length);
        
     }
    
 }




 public class Day1
 {
     public static void main(String[] args)
     {
         System.out.print("Hello in Java Program.");

     }
 }




 public class Day1
 {
     public static void main(String[] args)
     {
         String str, str1;
         Scanner scanner = new Scanner(System.in);
         str = scanner.nextLine();
         str1= scanner.nextLine();


         if(str1 == str)
             System.out.println("Both string are equals");
         else System.out.println("Strings are not equals.");
     }
 }



public class Day1 {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        // Loop through each command-line argument
        for (String arg : args) {
            try {
                // Try to parse the argument as an integer
                int num = Integer.parseInt(arg);
                // If parsing succeeds, add the number to the sum
                sum += num;
            } catch (NumberFormatException e) {
                // If parsing fails, increment the invalid count
                invalidCount++;
            }
        }

        // Print the sum and the count of invalid integers
        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Count of invalid integers: " + invalidCount);
    }
}
