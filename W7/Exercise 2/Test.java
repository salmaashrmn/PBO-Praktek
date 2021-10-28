
public class Test {
    public static void main(String[] args){
        
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println("Luas = "+c1.getArea());
        System.out.println("Keliling = "+c1.getPerimeter());
        
        Circle c2 = new Circle(5.0);
        System.out.println(c2.toString());
        System.out.println("Luas = "+c2.getArea());
        System.out.println("Keliling = "+c2.getPerimeter());
        
        Circle c3 = new Circle(3.0,"purple",true);
        System.out.println(c3.toString());
        System.out.println("Luas = "+c3.getArea());
        System.out.println("Keliling = "+c3.getPerimeter());
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("Luas = "+r1.getArea());
        System.out.println("Keliling = "+r1.getPerimeter());
        
        Rectangle r2 = new Rectangle(2.0, 3.0);
        System.out.println(r2.toString());
        System.out.println("Luas = "+r2.getArea());
        System.out.println("Keliling = "+r2.getPerimeter());
        
        Rectangle r3 = new Rectangle(4.0, 1.0, "grey", false);
        System.out.println(r3.toString());
        System.out.println("Luas = "+r3.getArea());
        System.out.println("Keliling = "+r3.getPerimeter());
        
        Square s1 = new Square();
        System.out.println(s1.toString());
        System.out.println("Luas = "+s1.getArea());
        System.out.println("Keliling = "+s1.getPerimeter());
        
        Square s2 = new Square(8.0);
        System.out.println(s2.toString());
        System.out.println("Luas = "+s2.getArea());
        System.out.println("Keliling = "+s2.getPerimeter());
        
        Square s3 = new Square(7.0, "orange", true);
        System.out.println(s3.toString());
        System.out.println("Luas = "+s3.getArea());
        System.out.println("Keliling = "+s3.getPerimeter());
        
//        Shape s1 = new Shape();
//        Shape s2 = new Shape("yellow",false);
//        s1.setColor("pink");
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//        System.out.println(s2.getColor());
//        s1.setFilled(false);
//        System.out.println(s1.isFilled());
//        System.out.println(s1.toString());
        
    }
}
