import java.util.*;
class HashMapDemo{
    public static void main(String[] args){
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(2);
        ar.add(5);
        ar.add(8);
        ar.add(9);
        ar.add(12);
        ar.add(15);
        System.out.print(ar);
        System.out.println();
        System.out.print("Even numbers: ");
        for(Integer data: ar){
            if(data%2==0){
                System.out.print(data + " ");
            }
        }
        
    }
}
