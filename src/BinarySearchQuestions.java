import java.util.Arrays;

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

/*
class small{
    public static void main(String[] args) {
        char[] arr = {'c','f','j','l'};
        char target = 'f';
        System.out.println(fun(arr,target));
    }
    static char fun(char[] letters, char target){
        int start = 0;
        int end = letters.length -1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(target == letters[mid]){
                return letters[mid+1];
            }
            if(target < letters[mid]){
                end = mid -1;
            }
            if (target > letters[mid]) {
                start = mid +1;
            }
        }
        if(start == letters.length){
            return letters[0];
        }
        else{
            return letters[start];
        }
    }
}

 */
// Q4 :- Find first and last position of an sorted array.

/*
// My solution :- binary k andr linear search
class u4{
    public static void main(String[] args) {
        int[]a = {5,7,7,7,7,8,8,10};
        int tar = 7;
        System.out.println(Arrays.toString(fun(a,tar)));
    }
    static int[] fun(int[] a , int tar){
        int[] ans = {-1,-1};
        int ans1=0;
        int ans2=0;
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(tar == a[mid]){
                for(int start1 = 0; start1<=mid+1; start1++){
                    if(tar == a[start1]){
                        ans1 = start1;
                        break;
                    }
                }
                for(int end1 = a.length-1; end1>=mid+1; end1--){
                    if(tar == a[end1]){
                        ans2 = end1;
                        break;
                    }
                }
                return new int[]{ans1,ans2};

            }
            if(tar > a[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
}

 */
// Kunal Solution :-
class Q4{
    public static void main(String[] args) {

    }
    static int[] fun(int[] nums, int target){


    }
    static int search(int[] a , int tar , boolean findleft){
        int ans = -1;
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(tar > a[mid]){
                start = mid +1;
            }
            if(tar<a[mid]){
                end = mid -1;
            }
            else{
               if(findleft== true){
                   end = mid -1;
               }
               else {
                   start = mid +1;
               }
            }
        }
        return -1;
    }
}

