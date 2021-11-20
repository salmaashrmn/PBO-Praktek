public class Cylinder extends Shape{
    private double radius;
    private double height;
	
    public Cylinder (double r, double h) {
	super("Sphere");
	this.radius = r;
	this.height = h;
    }
	
    @Override
    public double area(){
	return Math.PI*radius*radius*height;
    }
	
    @Override
    public String toString() {
	return super.toString()+" of radius "+radius+", height "+height;
    }
}