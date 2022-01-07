
class Bound<T extends Shape> {
    private T objRef;

    public Bound(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){
        this.objRef.displayClass();
    }
}

class Shape {
    public void displayClass(){
        System.out.print("A shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void displayClass(){
        super.displayClass();
        System.out.print(" that has a name rectangle");
    }
}

class Cylinder extends Shape {
    @Override
    public void displayClass(){
        super.displayClass();
        System.out.print(" that has a name cylinder");
    }
}

public class BoundedClass {
    public static void main(String a[]){
        
        Bound<Shape> s = new Bound<Shape>(new Shape());
        s.doRunTest();
        System.out.print("\n");
        
        Bound<Rectangle> r = new Bound<Rectangle>(new Rectangle());
        r.doRunTest();
        System.out.print("\n");
        
        Bound<Cylinder> c = new Bound<Cylinder>(new Cylinder());
        c.doRunTest();
        System.out.print("\n");
    }
}
