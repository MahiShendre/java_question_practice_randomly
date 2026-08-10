import java.util.*;
class ArraylistS2{
    public static void main(String[] args){
        ArrayList<String> ar=new ArrayList<String>();
        ArrayList<String> al=new ArrayList<String>();

        ar.add("Cat");
        ar.add("Apple");
        ar.add("Dog");
        ar.add("Banana");   1
        ar.add("Sun");
        ar.add("Animal");
        System.out.print(ar);
        System.out.println();
        for(String data: ar){
            if(data.charAt(0)=='A'){
                al.add(data);
            }
        }
        System.out.print(al);
        
    }
}
