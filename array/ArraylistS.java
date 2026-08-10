import java.util.*;
class ArraylistS{
    public static void main(String[] args){
        ArrayList<String> ar=new ArrayList<String>();
        ArrayList<String> al=new ArrayList<String>();

        ar.add("cat");
        ar.add("apple");
        ar.add("dag");
        ar.add("banana");
        ar.add("sun");
        System.out.print(ar);
        System.out.println();
        for(String data: ar){
            if(data.length()>4){
                al.add(data);
            }
        }
        System.out.print(al);
        
    }
}
