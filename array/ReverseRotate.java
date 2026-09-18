// 3. Reverse + Rotation
// Reverse an array in-place, then rotate the original array to the right by K positions.
// Input:
// nums = [1, 2, 3, 4, 5]
// K = 2
// Output:
// Reversed: [5, 4, 3, 2, 1]
// Rotated: [4, 5, 1, 2, 3]
import java.util.*;
class ReverseRotate{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
      
        int arr[]=new int[]{1, 2, 3, 4, 5};
        int arr2[]=new int[arr];
        int i=0; 
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            //System.out.print("reverse array : "+ )
        }
        for(int k=0; k<arr.length; k++){
            System.out.println("Reverse : " + arr[k]);
        }
        int m=0; 
        int n=arr2.length-1;
        while(){
            int temp=arr2[m];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            //System.out.print("reverse array : "+ )
        }
    }
}