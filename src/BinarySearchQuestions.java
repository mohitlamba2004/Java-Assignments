public class BinarySearchQuestions {
    public static void main(String[] args) {
        // Question on Binary Search.
    }
}
/*
class Q1{    // Ceiling :- smallest element in an array i.e grater than or equal to target in array.
    public static void main(String[] args) {

        int[] arr = { -13,-12,-11,-10,-4,0,5,6,7,8,9,10,11,16,23};
        int target = 15;
        System.out.println(fun(arr, target));
    }
    static int fun(int[] a , int tar){
        if(tar > a[a.length-1]){
            return -1;
        }
        int start = 0;
        int end = a.length -1;
        while(start <= end){
            int midle = start + (end - start)/2;
            if(tar == a[midle]){
                return midle;
            }
            if(tar < a[midle]){
                end = midle -1;
            }
            else {
                start = midle+1;
            }
        }

       return start;
    }
}

class Q2{   // floor :- Greatest number smaller or equal to target.
    public static void main(String[] args) {
        int[] arr = { -13,-12,-11,-10,-4,0,5,6,7,8,9,10,11,16,23};
        int target = 15;
        System.out.println(fun(arr, target));
    }
    static int fun(int[] array , int tar){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int middle = start +(end - start)/2;
            if(tar > array[middle]){
                start = middle+1;
            }
            else if(tar< array[middle]){
                end = middle -1;
            }
            else {
                return middle;
            }
        }
        return end;
    }
}

 */
/*
class Q3{  //
    public static void main(String[] args) {
        int[] arr = { -13,-12,-11,-10,-4,0,5,6,7,8,9,10,11,16,23};
        int target = 15;
        System.out.println(fun(arr, target));

    }
    static int fun(int[] a , int tar) {
        if (tar > a[a.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int midle = start + (end - start) / 2;
            if (tar == a[midle]) {
                return midle;
            }
            if (tar < a[midle]) {
                end = midle - 1;
            } else {
                start = midle + 1;
            }
        }
        return start;
    }
}

 */

//Q3 :- Return Smallest letter greater than target.

class small{
    public static void main(String[] args) {
        char[] arr = {'c','f','j','l'};
        char target = 'f';
        System.out.println(fun(arr,target));
    }
    static char fun(char[] a, char tar){
        int start = 0;
        int end = a.length -1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(tar == a[mid]){
                return a[mid+1];
            }
            if(tar < a[mid]){
                end = mid -1;
            }
            if (tar > a[mid]) {
                start = mid +1;
            }
        }
        if(start == a.length){
            return a[0];
        }
        else{
            return a[start];
        }
    }
}
