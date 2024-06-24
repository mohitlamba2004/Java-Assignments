
import java.util.Scanner;

// Q1:- Write a Program to print whether a number is even or odd, also take input from the user.
/* public class ass1 {
    public static void main(String[] args) {
        System.out.println("Enter a number :- ");
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = a % 2;
        if(b == 0){
               System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd ");
        }
    }
}  */

// Q2. Program to input principal, time and rate from the user and calculate simple interset

/*  public class ass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal Value :- ");
        long prp = input.nextLong();
        System.out.println("Enter For Time :- ");
        float time = input.nextFloat();
        System.out.println("Enter the Interset Rate");
        double rate =input.nextDouble();
        double For = (prp * time * rate)/100 ;

        System.out.println("Your SI is  " + For);

    }
}  */

//Q3. Write a program for printing Greeting msg with Input Name

/* public class ass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" “Hi m" + input.nextLine() + ", welcome to Bada Bussiness . We have a special 15% discount on all plans for our new customers. Would you like to get yours now? [link] Reply ‘Stop’ to unsubscribe.”");
    }
}  */

//Q4. Write a Program to Enter make a Simple Calculator :-

/* public class ass1{
    public static void main(String[] args) {
        System.out.println("$ Welcome to Simple Calculator $");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number :- ");
        double first = input.nextDouble();
        System.out.println("Enter Second Number :- ");
        double second = input.nextDouble();
        System.out.println("Choose the operator (+ , - , / , *) :- ");
        char opp = input.next().charAt(0);

        double result =0;

        if (opp == '+'){
             result = first + second;
        }
        else if (opp=='-'){
            result = first - second;
        }
        else if (opp == '*') {
            result = first*second;
        }
        else if (opp =='/') {
            if (second != 0){
                result = first/second;
            }
            else{
                System.out.println("Enter a valid number not 0");

            }

        } else {
            System.out.println("Error choose correct operator function");

        }

        System.out.println("Your result is "+ result);


    }
}  */

//Q5. Take 2 number input and print largest

/* public class ass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter both numbers :- ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        if (a>b){
            System.out.println(a + " is largest");
        }
        else if (a==b) {
            System.out.println("Both are equal numbers");
        }
        else {
            System.out.println(b + " is largest");
        }
    }
}  */

//Q6.Input currency in inr and convert it into USD :-

/* public class ass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value in INR = ");
        double INR = input.nextDouble();
        double USD = INR*0.012;
        System.out.println(INR + " in USD is = " + USD);

    }
}   */

//Q7. Calculate Fibonacci series :- (using FOR loop)
/* public class ass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n :- ");
        long n = input.nextLong();
        int fterm = 0 ; int sterm = 1;
        for (int i=1 ; i<=n; ++i){
            System.out.print(fterm + ",");
            int nextterm = fterm + sterm;
            fterm = sterm;
            sterm = nextterm;
        }

    }
}  */

//using While loop :- //Problem
/* public class ass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value upto which Fibnoco seires is required :- ");
        long n = input.nextLong();
        int fterm = 0; int sterm = 1; int i =1;
        while (i <= n){
            System.out.print(fterm + ',');
            int nexterm = fterm + sterm;
            fterm = sterm;
            sterm = nexterm;

            i++;
        }
    }
}   */

//Q8. To find out Palindrome String :-

/* public class ass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String name = input.nextLine();
        int i =0 , j = name.length()-1 , Flag = 0;
        while (i>j && Flag == 0){
            if (name.charAt(i) != name.charAt(j)) {
                Flag = 1;
                break;

            }
            i++;
            j--;

        }
        if(Flag == 0){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's not Palindrome");
        }
    }
} */
// OR

/* public class ass1{
    public static void main(String[] args) {
        System.out.println("Enter a String :- ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String rev ="";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
} */


// Palindrom for a Number :
/*
public class ass1{
    public static void main(String[] args) {
        System.out.println("Enter a number :- ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int cl = a;
        int rem = 0;
        int rev =0;
        while(a>0){
            rem = a%10;
            a = a/10;
            rev = rev*10+rem;
            System.out.println(rev);
        }

         if(rev==cl){
            System.out.println("palendrome");
        }
         else{
            System.out.println("not a palendrome");
        }

    }
}

 */



