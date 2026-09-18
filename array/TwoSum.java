// 5. Two Sum
// Find the indexes of two elements whose sum equals the given target.
// Input:
// nums = [2, 7, 11, 15]
// target = 9
// Output:
// [0, 1]
import java.util.*;
class TwoSum{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
      
        int arr[]=new int[]{2, 7, 11, 15};
        int target=9;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                System.out.println("Indexes are: " + i + " " + j);
                i++;
                j--;
            }
        }
        
    }
}