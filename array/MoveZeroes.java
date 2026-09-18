// 4. Move Zeroes
// Move all zeroes to the end while maintaining the order of non-zero elements.
// Input:
// [0, 1, 0, 3, 12]
// Output:
// [1, 3, 12, 0, 0]
import java.util.*;
class MoveZeroes{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
      
        int arr[]=new int[]{0, 1, 0, 3, 12};
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[j]==0){
                j++;
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.println("array: " + arr[k]);
        }
    }
}