//Sum of DigitsGiven n , return the sum of its digits. Input: n = 1234 Output: 10
import java.util.*;
class SumofDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int sum=0;
        int que;
        int rem;
        for(int i=0; num>0;i++){
            rem=num%10;
            num=num/10;
            sum=sum+rem;
        }

        // while(num > 0){
        //     rem = num % 10;
        //     num = num / 10;
        //     sum = sum + rem;
        // }
        System.out.println("sum : " + sum);
    }
}