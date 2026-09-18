// Min/Max + Second Largest
// Find the largest, second largest, smallest, and second smallest distinct elements without sorting.
// Input:
// [10, 5, 20, 8, 20, 3]
// Output:
// Largest = 20
// Second Largest = 10
// Smallest = 3
// Second Smallest = 5

import java.util.*;
class LargeSmall{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
      
        int arr[]=new int[]{10, 5, 20, 8, 20, 3};
        int min=Integer.MAX_VALUE;
        int secondMmin=Integer.MAX_VALUE-1;
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE+1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
                secondMin = ;
            }
            if(arr[i]>max){
                max=arr[i];
                secondMax = ;
            }
        }
    }
}