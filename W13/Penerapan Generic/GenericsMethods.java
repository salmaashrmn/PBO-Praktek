
public class GenericsMethods {
    //Java Generic Method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

    public static void main(String args[]){
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("hello world");
        GenericsType<Integer> g2 = new GenericsType<>();
        g2.set(15);
       
        GenericsMethods gm = new GenericsMethods();
        gm.<String>genericsMethod(g1.get());
        gm.<Integer>genericsMethod(g2.get());
    }
}