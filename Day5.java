//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
import java.util.*;


public class Main {
    public static void main(String[] args) {

        int num1, num2;

        System.out.print("Enter two numbers: ");

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        num2 = num1 + num2 - (num1 = num2);

        System.out.print("The swap value is: "+ num1+ " " + num2);


        }
    }

  //This Comments are used for Documentation. (/**  ... */)



    public class Main
    {
        public static void main(String[] args)
        {
            int num ;
            System.out.print("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if(num%2!=0)
                System.out.print("Odd");
            else System.out.print("Even");

        }
 }



    public class Main
    {
        public static void main(String[] args)
        {
            int num, div ;
            System.out.print("Enter a number and divisor: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            div = sc.nextInt();


            System.out.println("The Quotient is: "+ num/div);

            System.out.print("The Remainder is: " + num%div);
        }

    }



public class Main
{

        public static void main(String[] args)
        {

            char ch;

            System.out.print("Enter a character: ");

                Scanner sc = new Scanner(System.in);

                ch = sc.next().charAt(0);

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    System.out.println("The character is Vowels. ");
                else
                    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                        System.out.println("The character is Vowels.");
                else
                    if(ch>=65 && ch<=90)
                        System.out.println("The Character is Consonant.");
                else
                    if(ch>=90 && ch<=122)
                        System.out.println("The Character is Consonant.");
                else System.out.println("The character is other than Alphabet.") ;

        }

}



public class Main
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if(num % 100 == 0)
             if(num % 400 ==0)
                System.out.print("The year is leap year.");
             else  System.out.print("The year is not a leap year.");
        else
            if(num % 4 ==0)
                System.out.print("The year is a leap year.");
            else System.out.print("The year is not a leap year.");
    }
}


import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int countT=0, countH=0;
        double ran;
        for(int i =1; i<=10; i++)
        {
            ran = Math.random();
            if(ran >0.5)
                countH+=1;
            else countT+=1;

        }
            if(countT == countH)
                System.out.println("The percentage of Tails and Heads are equal fifty-fifty.");
            else
                //if(countH > countT)
                    System.out.println("The percentage of Head and Tail is:"+ countH*100/10 +" and "+ countT*100/10);
               // else System.out.println("The percentage of Tails is: "+ countT*100/10);







    }

}


// Greatest number among the three numbers.

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter Three numbers: ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int temp = num1;

        if(num2 > temp)
            temp = num2;

        if(num3 > temp)
            temp = num3;

        System.out.println(STR."The Greatest number among three numbers: \{temp}");


    }

}

// this is alternate for Greatest number among three numbers.


public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter three numbers: ");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2)
            if(num2 > num3)
                System.out.print(STR."The Greatest number among the three numbers: \{num1}");
            else System.out.print(STR."The Greatest number among the three numbers: \{num3}");

        else
            if(num1 > num3)
                System.out.print(STR."The Greater number among the three number: \{num2}");
            else System.out.print(STR."The Greater number among the three number: \{num3}");
    }
}

// This is one more alternative logic for Greatest number in three numbers.



public class Main
{
    public static void main(String[] args)
    {

                System.out.print("Enter three numbers: ");

                Scanner sc = new Scanner(System.in);

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int num3 = sc.nextInt();

                if(num1 >= num2 && num2 >= num3)
                    System.out.print(STR."The Greatest number is: \{num1}");

                else
                    if(num2 >= num3 )
                        System.out.print(STR."The Greatest number is: \{num2}");
                else System.out.print(STR."The Greatest number is: \{num3}");

    }
}



