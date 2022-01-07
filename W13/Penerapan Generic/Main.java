
import java.util.*;


class MyClass<T extends Comparable<T>>{
    T vals;
    
    MyClass(T o) {
        vals = o;
    }
    
    public T getVals(){
        return vals;
    }
   
    public int compareTo(MyClass st){    
        if(vals==st.vals)    
            return 0;       
        else    
            return 1;    
    }   
}

public class Main {
    public static void main(String args[]) {
        MyClass<String> a = new MyClass<String>("salma");
        MyClass<String> b = new MyClass<String>("aulia");
        MyClass<String> c = new MyClass<String>("suherman");
        
        ArrayList<MyClass> al=new ArrayList<MyClass>();
        al.add(a);
        al.add(b);
        al.add(c);
        for(MyClass st:al){    
            System.out.println(st.getVals());    
        } 
    }
}