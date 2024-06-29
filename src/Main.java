
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/* public class Main{
    public static void main(String[] args) {
        System.out.println("hello World");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());

    }
}

 */

/* public class Main{
    public static void main(String[] args) {
        System.out.println("Write some value");
        Scanner input= new Scanner(System.in);
        System.out.println(input.nextLine());

    }
} */

// Primitive Data Types:- those data types which can't Classified much further

/* public class Main{
    public static void main(String[] args) {
        System.out.println("Write your rollno.");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());

    }
} */

/* public class Main{
    public static void main(String[] args) {
        int roll_no = 7621;
        char leter = 'r';
        float marks = 45.22f;
        double LargeNumberDecimal = 456.4543545;
        long LargeInteger = 455555435;
        boolean check = True;


    }
}
*/

//Inputs:-

//Integer Inputs:-

/* public class Main{
    public static void main(String[] args) {
        System.out.println("Enter some Input :-");
        Scanner input = new Scanner(System.in);
        int roll_no = input.nextInt();
        System.out.println("Your roll no. is " + roll_no);

    }
} */

//String Input:-

/* public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int a = 2_000_000;      commas will be added while compliling
        String name = input.nextLine();
        System.out.println(name);


    }
} */


// Float Input :-

/* public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float marks = input.nextFloat();
        System.out.println("Marks are "+ marks);


    }
} */

//Sum of Integer :-

/*  public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number :- ");
        int A = input.nextInt();
        System.out.println("Enter 2st number :- ");
        int B = input.nextInt();
        int C = A + B;

        System.out.println("The Sum is " + C);

    }
} */

// TYPE CASTING :- Converting a bigger Compatible Type to a smaller Compatible type. like Float can be casted into Int but not vice versa

 /* public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numb = (int)(input.nextFloat());
        System.out.println("Your Converted Number " + numb );
    }
}   */

// Automatic Type Casting :-

/* public class Main{
    public static void main(String[] args) {
        int a = 260;
        byte b = (byte)(a);  // what this is doing 260 % 256 = 4
        System.out.println(b);
    }
} */

/* public class Main{
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a*b/c;
        System.out.println("Expression is " + d);
    }
} */

//Type casting from Interger to Char :-

/* public class Main{
    public static void main(String[] args) {
        int number = 'a';
        System.out.println(number);              //To Find Ascaii Valure from A Character to a Integer
        int NUMBER = 'A';
        System.out.println(NUMBER);

    }
} */

// While loop :-

/* public class Main{
    public static void main(String[] args) {
        if (true) {
            System.out.println("Good");
        }

        else{
            System.out.println("Bad");
        }
    }
} */

/* public class Main{
    public static void main(String[] args) {
        int a = 6;
        if (a==9){
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong");
    }
    }
} */

/* public class Main{
    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println(count);
            count++;
        }
    }
} */


// For loop :-
/* public class Main{
    public static void main(String[] args) {
        for( int i = 34; i != 60; i++){
            System.out.println("Your values is " + i);
        }
    }
} */

// WHEN TO USE WHILE AND FOR LOOP :- WHEN YOU HOW MANY TIMES LOOP IS GOING TO RUN USE FOR LOOP AND WHEN DON'T KNOW , USE WHILE LOOP.

// Temprature Convertion Program (C to F):-

/*public class Main{
    public static void main(String[] args) {
        System.out.println("Enter Temprature in C :- ");
        Scanner input = new Scanner(System.in);
        float TempC = input.nextFloat();
        float TempF = (9/2 * TempC) + 32;
        System.out.println("Temprature in F :- " + TempF);

    }
}
*/
// Lecture 2 :-

//if else statemaents :-

/*
public class Main{
    public static void main(String[] args) {
        System.out.println("conditional Statements");
        int salary = 15000;
        if(salary > 20000){
            salary = salary+  2000;
        }
        else if (salary == 15000){
            salary = salary + 10000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println("here you go");
        System.out.println(salary);

    }
}
*/
/*
class loops{
    public static void main(String[] args) {
        System.out.println("loops");
        for(int i = 0 ; i<= 200; i++){
            System.out.println("hey i am Hello World");
        }
    }


}

 */


/*
public class Main{
    public static void main(String[] args) {
        System.out.println("numbers from 1 to 5");
        for( int a = 1; a<=5 ; a++){
            System.out.println(a);
        }
    }
}

class loop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        for(int k = 0 ; k<=i ; k++){
            System.out.println(k);
        }
    }
}
*/

//While loop:-

/*
public class Main{
    public static void main(String[] args) {
        int i = 0;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
}

*/

// do while :- it will run at least one, so use when we want to run a loop only once.

/* Syntax
do{

}
while();
 */

/*
class loop{
    public static void main(String[] args) {
        System.out.println("hey this is a loop");
        int i =0;
        do{
            System.out.println("do while loop");

            i++;
        }while(i<=7);


    }
}

class largest{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int no1 = input.nextInt();
        int no2 = input.nextInt();
        int no3 = input.nextInt();
        if(no1>no2){
             if(no1>no3){
                 System.out.println("no1 is biggest");
             }
             else{
                 System.out.println("no3 is biggest");
             }

        }
        else if(no2>no1){
            if(no2>no3){
                System.out.println("no2 is biggest");
            }
            else{
                System.out.println("no3 is biggest");
            }
        }


    }
}

 */

/*
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int max1 = Math.max(c,Math.max(a,b));
        int max2 = Math.max(d,Math.max(c,Math.max(a,b)));
        System.out.println(max1+" is maximum ");
        System.out.println(max2+" is 2nd max");

    }
}

class chara{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(2);
        System.out.println(ch);
        String word = "hello";
        System.out.println(word.charAt(0));
        if(ch >= 'a'&& ch<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
    }
}
*/

/*
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 0;
        int c = 1;

        int count = 1;
        while(count <= a){
            int temp = b;
            b = b+c;
            c = temp;
            count ++;

        }
        System.out.println(b);
    }
}

 */
// count same numbers :-
/*
class sameno{
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int count =0;
        int n = input1.nextInt();

       while(n>0){
           int rem = n%10;
           n = n/10;
           if(rem==3){
               count ++;

           }
       }
       System.out.println(count);

    }

}

 */

// for palendrom number :-
/*
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;
        while(num>0){
           int rem = num%10;
           num = num/10;
           ans = ans*10+rem;
        }
        System.out.println("number is"+ ans );
    }
        }

 */

//calculator :-

/*
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the operator ");
            char op = input.next().trim().charAt(0);

            if(op =='+'|| op == '-'|| op == '*' || op =='/'){
                System.out.println("enter two numbers ");
                int a = input.nextInt();
                int b = input.nextInt();
                if(op =='+'){
                    ans = a+b;
                }
                if(op =='-'){
                    ans = a-b;
                }
                if(op =='*'){
                    ans = a*b;
                }
                if(op =='/'&& b!=0){
                    ans = a/b;
                }
                if(op=='%'){
                    ans = a%b;
                }
            } else if (op == 'X' || op =='x') {
                break;
            }
            else{
                System.out.println("invalid operation");
            }
            System.out.println(ans);
        }

    }
}

 */

//Lecture 3:- Switch
/*
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();                 //fruit1 --> mango
                                                     //fruit2--> points towards same value
                                                            // if(fruit1==fruit2)-> it will give true
        if(fruit.equals("mango")){
            System.out.println(fruit);
        }
        if(fruit.equals("apple")){
            System.out.println("keep doctor away");
        }
    }
}
// same in switch case:-

class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fru = input.next();
        int day = input.nextInt();
        switch (fru) {
            case "mango" -> System.out.println("king");
            case "apple" -> System.out.println("doctor");
            case "orange" -> System.out.println("acid");
            default -> System.out.println("enter a valid value");
        }
        switch (day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");   //break is there but not written
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thrusday");
            case 5-> System.out.println("Friday");
        }
    }
        }

 */


/*

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();

        switch (empId){
            case 1:
                System.out.println("mohit");
                break;
            case 2:
                System.out.println("ID - 24245");
                break;
            case 3:
                System.out.println("Enter Department");
                String Dep = in.next();
                switch (Dep){
                    case "Tech":
                        System.out.println("Technical");
                        break;
                    case "Support":
                        System.out.println("Technical Support");
                       break;
                    case "Writter":
                        System.out.println("Written Content");
                        break;
                    default:
                        System.out.println("cleaning Staff");
                }
        }
    }
}


 */

//Lecture 4 :- Functions

/*

public class Main{
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);
    }
    static void sum() {                             // void means not going to return anything
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("Sum is "+ sum);
    }

    static int sum2(){
        Scanner input = new Scanner(System.in);   // int means value in sum2 will be a integer
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        return sum;
    }
}


 */
/*
public class Main{
    public static void main(String[] args) {
        String message = h();
        System.out.println(message);

    }

    static String h(){
        Scanner input = new Scanner(System.in);
        String msg = input.nextLine();
        return msg;
    }
}


 */

/*
public class Main{
    public static void main(String[] args) {
        int c = sum(20,40);
        System.out.println(c);
        String n = greet();
        System.out.println(n);

    }

    static int sum(int a,int b){
        int s = a+b;
        return s;
    }
    static String greet(){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String msg = "hey "+ name;
        return msg;
    }
}

*/
/*
public class Main{
    public static void main(String[] args) {
        String name2 = change();
        System.out.println(name2);

    }
    static String change(){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return name;
    }
}

// swapping 2 numbers :-

class you{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" " +b);
    }
}

class swap{
    public static void main(String[] args) {
        swap(20,40);

    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);

    }
}

 */

/*
public class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        System.out.println(arr);
        array(arr);
        System.out.println(arr);
    }
    static void array(int[] nums){
        nums[2] = 23;
        System.out.println(nums);
    }
}



class array{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num){
        num[2]= 9;
    }
}

*/

//Scoping :- where we can access our variables, " anything that is initialised outside a sub-block that can be used(update) inside sub- block but anything initialised inside sub-block can be used in it only not even used outside of sub-block.
/*
public class Main{
    public static void main(String[] args) {
        int a = 22;
        int b = 7;
        String name = "mohit";
        {
           // int a = 78; already initialised can be initialised again in a block
            a = 23; // but it's vale can be changed
            int c  = 78; // values inititaled in this block , will remains in this block
           name = "rohit";
        }
        // System.out.println(c); // cannoy use outside the block
        System.out.println(a);
        System.out.println(name);
    }
}
// scoping in for loop:-
class loop {
    public static void main(String[] args) {


for(int i = 0; i< 5;i++)

    {
     int num = 99;
    }
        System.out.println(num); // can't because of explaination above
}
        }


 */

// Shadowing :-
/*
public class Main{
    static int x = 90;  //This will be shadowed(hidden)for line 745 and 746 because we inititaled x again for psvm scope.

    public static void main(String[] args) {
        System.out.println(x);
        int x = 6;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}

 */

// Variable Arrguments :- when we need to use multiple argumentw(input) in a funtion

/*
public class Main{
    public static void main(String[] args) {
        fun(2,4,5,6,7,8,8);
        fun2("hit","trd","rege");
        fun();
        multiple(3,6,"mohit","rohit");
    }
    static void fun(int ...a){
        // it will keep argument in a array
        System.out.println(Arrays.toString(a));
    }
    static void fun2(String ...a){
        System.out.println(Arrays.toString(a));

    }
    static void multiple(int a, int b, String ...c){
        System.out.println(c);
    }
}

 */

// Function overloading:- 2 more fynctions having same name but contains different parameter , so at time of calling it use that funtion which is has same parameter and argument

/*

public class Main{
    public static void main(String[] args) {
        fun(23);
        fun("mohit");
        fun("rohit");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}

 */
// Question :- prime numbers

/*
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean x = prime(n);
        System.out.println(x);
    }
    static boolean prime(int num) {

    if(num<=1){
        return false;
    }
    int c = 2;
    while(c*c>num){
        if(num%c==0){
            return true;
        }
        c++;
    }
    return c*c>num;

    }

}

 */

// question 2:- amgstrong number

/*

class amg{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number for checking ");
        int num = input.nextInt();
        boolean x = check(num);
        System.out.println(x);



    }
    static boolean check(int number){
        int orr = number;
        int sum = 0;
       while(number >0){
           int rem = number % 10;
           int cube = rem * rem * rem;
           sum = sum + cube;
           number = number / 10;

       }
        System.out.println(sum);
       if(orr ==sum){
           return true;
       }
       else {
           return false;
       }
    }
}

 */

// Lecture 5 :- Arrays and ArrayList :- needed to store a collection of a similar datatypes like string , int , boolean.
/*
public class Main{
    public static void main(String[] args) {
        int rollno = 23;
        int rno2 = 2;
        // array syntax :-
        int[] rollno3 = new int[5]; //int[5] is size in array , new is used to create an object.
        //or directly :-
        int[] rollno4 = {2,3,4,5,6,7,8};

        int[] ros; // declaration of array , nothing pointing to any object
        ros = new int[5]; // initialised , now actual object is created in heap memory
        ros[0] = 45;
        ros[1] = 3;
        ros[2] = 4;


        String s = null; // null can be assigned to only non-primitives data types.

        String[] ab = new String[5];
        ab[0]= "mohit";
        ab[1] = "rohit";

        int[] arra = {1,2,3,4,5,6,7,8};
        System.out.println(arra[2]);


    }
}

 */

//1. ARRRAY OBJECTS ARE IN HEAP MEMORY
//2. HEAP OBEJCTS ARE NOT IN CONTINUOUS , LIKE IN C/C++ IT IS IN CONTINOUS BECOZ THEY HAVE POINTERS CONCEPT TO DECTECT THE ADDRESS OF THE OBEJCT.
//3. DYNAMIC MEMORY ALLOCATION , DECLRATION OF VARIABLE HAPPENS AT COMPILE TIME AND INITIALISATION IN MEMORY HAPPENS AT RUN TIME.

/*
class arr{
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] ar = new int[5];


        for(int i = 0; i<ar.length ; i++){     //for loop in arrays
              ar[i] = input.nextInt();
            System.out.println(ar[i]);

        }
        System.out.println(Arrays.toString(ar));
    }
}

 */

// for each loop in arrays:-

/*
class fo{
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 3;
        for(int num : array){
            System.out.print(num +" ");
        }
    }
}

 */

// Input of String in array:-
/*
class arrOb{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] name = new String[5];
        for(int i=0; i< name.length; i++){
            name[i] = input.next();
        }
        System.out.println(Arrays.toString(name));

        }
    }


 */

// Arrays in function :-
/*

public class Main{
    public static void main(String[] args) {
        int[] no = {1,2,5,4,5,6};

        name(no);
        System.out.println(Arrays.toString(no));
    }
    static void name(int[] num){

        num[0] = 99;


    }
}

 */

// 2D arrays :-

class multiDim{
    public static void main(String[] args) {

    }
}

