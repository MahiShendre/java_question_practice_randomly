import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int que;
        int rem;
        int num2=0;
        for(int i=0; num>0; i++){
            rem = num%10;
            num2 = num2*10+rem;
            num = num/10; //loop condition ke liye 
        }
        if(num2==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}