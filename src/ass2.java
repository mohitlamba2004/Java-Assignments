

import java.sql.SQLOutput;
import java.util.Scanner;

//Question 1:-
/*
public class ass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad = input.nextDouble();
        double area  = rad*rad*22.7;
        System.out.println("area is "+ area);
    }
}

 */

// Question2 :-
/*
class triangleArea{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = base*height /2;
        System.out.println(area);
    }
}

 */

// Question 3 :-
/*
 class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double area = (a + b) * 2;
        System.out.println(area);
    }
}

 */

//Question 4 :-

/*
class parimeterCircle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();

        double perimeter = 2*22.7*r;
        System.out.println(perimeter);
    }
}

 */

//Questiom 5:-

/*
class cyclinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double h = input.nextDouble();
        double area = 2*22.7*r*h;
        System.out.println(area);
    }
}

 */

//Question 6:-
/*
class fab{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int fterm = 0;
        int sterm =1;
        for(int i =0; i<=n; i++){
            System.out.println(fterm+",");
            int nextTerm = fterm + sterm;
            fterm = sterm;
            sterm = nextTerm;



        }

    }
}

 */

//Question 7:-
/*
public class ass2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fac=1;
        for (int i = 1; i <= num; i++) {

            fac = fac*i;



        }
        System.out.println(num+"has fac "+ fac);
    }
}
*/
// Question 8:-
/*
class number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while(true){
            int num = input.nextInt();

            if(num !=0){
                sum = sum + num;

            }
            else{
                break;
            }

        }
        System.out.println(sum);
    }
}


 */
//Question 9:-

/*
class number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while(true){
            int num = input.nextInt();
            n = n + num;
            if(num == 0 ){
                break;
            }
            else {
                continue;
            }


        }
        System.out.println("Sum is "+ n );
    }
}

*/

