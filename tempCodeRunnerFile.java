import java.util.*;
class Arraylist2{
    public static void main(String[] args){
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(20);
        ar.add(75);
        ar.add(40);
        ar.add(90);
        ar.add(55);
        ar.add(10);
        System.out.print(ar);
        System.out.println();
        for(Integer data: ar){
            if(data>=50){
                System.out.print(data + " ");
            }
        }
        
    }
}
