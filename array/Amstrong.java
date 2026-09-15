import java.util.*;
class Amstrong{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        while(num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("count: "+ count);

        int que;
        int rem;
        int sum=0;
        num = original;
        for(int i=0; num>0; i++){
            que=num/10;
            rem=num%10;
            num=que;
            int result=1;
            for(int j = 0 ; j < count ; j++) {
                result=result*rem;
            }
            sum=sum+result;
        }
        if(sum == original){
            System.out.println("this is Amstrong number");
        }else{
            System.out.println("This is not an Amstrong number");
        }
    } 
}
