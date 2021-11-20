public abstract class Shape {
    private String shapeName;
	
    public Shape (String shapeName) {
	this.shapeName = shapeName;
    }
	
    public abstract double area();
	
    public String toString() {
	return "Shape Name: "+shapeName;
    }
}