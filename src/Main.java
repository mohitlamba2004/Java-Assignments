
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
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
        no[4] = 56;
    }
    static void name(int[] num){

        num[0] = 99;


    }
}


 */


// 2D arrays :- they are like matrix of array
/*
class multiDim{
    public static void main(String[] args) {
           int[][] a = new int[3][];     //[][] are [rows][columns], columns are not mandatory.
           //or
           int[][] b = {
                   {1,2,3},
                   {4,5,6},   //Arrays of arrays
                   {7,8,9}
           };
           int[][] c = {
                   {1,2},
                   {3,5,6,7},
                   {8}
           };
        System.out.println(Arrays.toString(b[0]));

    }
}

 */

// Input of 2Darray:-\

/*

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {      //lenght of 2Darray will be no. of rows
            for (int coln = 0; coln < arr[row].length; coln++) {
                arr[row][coln] = input.nextInt();

            }
            System.out.println(Arrays.toString(arr[row]));
        }


    }
}


class fore{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
      for( int row = 0 ; row < array.length ; row++){
          for(int coln = 0 ; coln<array[row].length ; coln++){
              array[row][coln] = input.nextInt();

          }
          System.out.println(Arrays.toString(array[row]));
      }


    }
}



 */

// Arrays List :- when don;t know the size of array , take as many inputs as want in new int[?][]

/*
public class Main{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(10); // 10 is constructure
        list.add(45);
        list.add(34);
        list.add(10);
        list.add(45);
        list.add(34);
        list.add(10);
        list.add(45);
        list.add(34);
        list.add(10);
        list.add(45);
        list.add(34);
        list.add(10);
        list.add(45);
        list.add(34);
        list.add(10);

        System.out.println(list);

        //Arrays Functions/Methods :-

        list.add(34);  // adding in index

        System.out.println(list.contains(334)); // check that this value list contains or not

        list.set(0,99);  // set 0th index to 99.

        System.out.println(list);

        list.remove(2); //remove index no.2 from list arraylist

        System.out.println(list);

        System.out.println(list.get(4)); // accessing 4th index in list arraylist





    }
}

 */


// Input in Array List :-
/*
class List{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<Integer>(5);

        for(int i = 0; i< 5 ; i++){
          List.add(input.nextInt());
        }

        System.out.println(List);

        //OR Printing method

        for(int i = 0; i< 5 ; i++){
            System.out.print(List.get(i)); // get the values at i index and then print it
        }
    }
}

 */

// Multi Dimentsional Arrays in ArraysList:-
/*

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> List = new ArrayList<>(10);
        //Initialzing part:-
        for(int i = 0; i<5 ; i++){
            List.add(new ArrayList<>());

        }
        // Declearation :-
        for(int i =0; i<5 ; i++){
            for(int j =0; j<3 ; j++){
                List.get(i).add(input.nextInt());
            }
        }
        System.out.println(List);

    }
}


 */

// Q1 Swapping 2 numbers in array:-

/*
class swaps{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr , 2,3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] a, int index1, int index2){
        int Temp = a[index1];
        a[index1] = a[index2];
        a[index2] = Temp;
    }
}

 */

// Q2:- maximum no. in array:-

/*
 class Maxi{
     public static void main(String[] args) {
         int[] arr = new int[7];
         Max(arr);
         System.out.println(Arrays.toString(arr));

     }
     static void Max(int[] a){
         Scanner input = new Scanner(System.in);

         for (int i = 0; i < 7; i++) {
             a[i] = input.nextInt();
         }
         System.out.println(Arrays.toString(a));

         int max = 0;
         for(int i = 1; i<a.length; i++){
            int nex = a[i];
            int pri = a[i-1];
            if(nex>pri){
                max = nex;
            }
            else{
                max = pri;
            }

        }
         System.out.println(max);

     }
 }


 */

// Q3. Reverse the array:-

/*
class rev{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        revs(arr);


    }
    static void revs(int[] a){

        int[] b = new int[a.length];
        for(int i =1; i<= a.length; i++){
            b[a.length - i] = a[i-1];


        }
        System.out.println(Arrays.toString(b));

}

 */

//Lecture 6 :-  Linear Searching Method (notes in notebook)

/*

public class Main{
    public static void main(String[] args) {
          int[] array = {1,2,3,4,5,6,7,8,8};
          fun(array);

    }
    static int fun(int[] arr){
        Scanner inpu = new Scanner(System.in);
        System.out.println("Enter the Target :- ");
        int target = inpu.nextInt();
        if(arr.length == 0){
            System.out.println("Enter valid array/List");
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target){
                System.out.println(index+" index is the target" );
                return index;
            }
        }
        return-1;
    }
}

 */


// search in rage of array:-

/*
class rsng{
    public static void main(String[] args) {
        int[] arrr = {1,2,3,4,5,6,7};
        int k = 5;
        int ans = arr(arrr , k , 2 , 4);
        System.out.println(ans);

    }
    static int arr(int[] a , int target ,int start , int end){

        if(a.length==0){
            return-1;
        }
        for (int i = start; i<= end; i++){
            if(a[i] == target){
                return target;
            }
        }
        return -1;
    }
}

 */

// Search in Strings :-

/*
class str{
    public static void main(String[] args) {

        System.out.println(string("dsbvhuvbbvev"));

        
    }
    static boolean string(String st) {
        System.out.println("Enter the chr u want to search");
        Scanner input = new Scanner(System.in);
        char ab = input.next().charAt(0);

        if (st.length() == 0) {
            return false;
        }
        for (char ch : st.toCharArray()) {        //change string in array
            if (ch == ab) {
                return true;
            }

        }

     return false;
    }

}

// by for loop:-

class stri{
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Enter the char u want to search");
        char k = input.next().charAt(0);
        System.out.println(fun(name , k));

    }

    static boolean fun(String n , char k){

        if(n.length()==0){
            return false;
        }
        for(int i =0; i<n.length(); i++){
            if(n.charAt(i)==k){
                return true;
            }
        }
        return false;
    }

}


 */

// find minimum number in array:-

/*

public class Main{
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,-5};
        System.out.println(minn(ar));
        System.out.println("program over");
    }
    static int minn(int[] a){
        int minu = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < minu){
                minu = a[i];
            }
        }
        return minu;
    }
}

 */

// Search in 2D array:-

/*
class d2{
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3}, {4,5,6} , {2,6} , {5,7,9}
        };
        int target = 3;

        System.out.println(fun(arr , target));

    }
    static boolean fun(int[][] a , int t){
        for (int row = 0; row< a.length ; row++){
            for(int colm = 0 ; colm<a[row].length ; colm++){
                if(a[row][colm]== t){
                    return true;
                }
                if(a.length == 0){
                    return false;
                }
            }
        }
        return false;
    }
}

// return the row of target number in 2D array:-

class d22{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3}, {4,5,6} , {2,6} , {5,7,9}
        };
        int tar = 4;
        System.out.println(Arrays.toString(fun(arr , tar)));
    }
    static int[] fun(int[][] a , int target){
        for(int row = 0; row<a.length; row++){
            for(int coln = 0; coln<a[row].length ; coln++){
                if(a[row][coln] == target){
                    return a[row];      // if want to print cordinates of that target :- return new int[]{row,coln};
                }
            }
        }
        return new int[]{-1,-1};              // returning a 2d array
    }
}

 */
/*
class d222{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{-1,0,0}, {4,5,6} , {2,6} , {5,7,9}
        };
        fun(arr);

    }
    static void fun(int[][] a){
        int min = a[0][0];
        for(int row = 0; row<a.length; row++){
            for(int coln = 0; coln<a[row].length ; coln++){

                if(a[row][coln] < min ){
                    min = a[row][coln];
                }
            }
        }
        System.out.println(min);
    }
}

 */

// return how many even digits from a number in an array of numbers:-   3 hr lag gaye mkc

/*
public class Main{
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        System.out.println(result(num));
    }
    static int result(int[] num){
        int count =0;
        int Tnum = 0;
        for (int nums : num) {
            while(nums>0){
                count++;
                nums = nums/10;
            }
            if(count % 2==0){
                Tnum = Tnum+1;
            }
            count =0;
        }

        return Tnum;
    }
}


 */


// Max Wealth Question :-
/*

class ain{
    public static void main(String[] args) {
        System.out.println("Arrays :-");
        int[][] wel = new int[3][3];
        maxi(wel);


    }
    static void maxi(int[][] arr){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Arrays : - ");
        for (int row =0; row<arr.length ; row++){
            for (int coln =0; coln<arr[row].length ; coln++){
                arr[row][coln] = input.nextInt();

            }
        }
        int sum = 0;
        int[] ans = new int[3];
        for (int i =0; i< arr.length; i++){
                int[] person = arr[i];
                for (int num : person){
                    sum = sum + num;
                    ans[i] = sum;
                }
                sum=0;
            }
        System.out.println(Arrays.toString(ans));
        int max = ans[0];
        for (int j = 0; j < ans.length; j++) {
            if(ans[j] > max ){
                max = ans[j];
            }
        }
        System.out.println("the wealthiest is "+ max);
    }
}

 */

// Kunal's solutiin

/*
class kunak{
    public static void main(String[] args) {

    }
    static int maxwe(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;

            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

 */

//Lecture 7 :- Binary Serch Comapriosn in acceding order sorted array - notes in notebook


public class Main{
    public static void main(String[] args) {
          int[] array = { -13,-12,-11,-10,-4,0,5,6,7,8,9,10,11,23};
          int tar = -13;
        System.out.println(search(array , tar));
    }

    static int search(int[] arr , int target){
        int start = 0 ;
        int end = arr.length -1;
        while(start <= end){
            //int middle = (start + end)/2;     might start + end exceeds the range of storage of int. so use this formula
            int middle = start + (end - start)/2;
            if(target > arr[middle]){
                start =  middle+1;
            } else if (target < arr[middle]) {
                end = middle -1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}

// Order Agnostic Binary Search :- when u don't know that the array is sorted in accending or desending order:-

class Algo{
    public static void main(String[] args) {
        int[] array = { -13,-12,-11,-10,-4,0,5,6,7,8,9,10,11,23};  // This is in accending order.
        int tar = -11;
        System.out.println(fun(array , tar));
    }
    static int fun(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        boolean assendingOrder = arr[start] < arr[end];

        while(start <= end) {
            int midle = start + (end - start) / 2;
            if (target == arr[midle]) {
                return midle;
            }
            if (assendingOrder == true) {
                if (target > arr[midle]) {
                    start = midle + 1;
                } else if (target < arr[midle]) {
                    end = midle - 1;
                }
            }
            else {
                if (target < arr[midle]) {
                    start = midle + 1;
                } else if (target > arr[midle]) {
                    end = midle - 1;
                }
            }
        }

        return -1;
    }
}