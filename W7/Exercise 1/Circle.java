/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    
    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red"; 
    }
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
        this.color = "red";
    }
    
    public Circle(double radius, String color) { // 3rd constructor
        this.radius = radius;
        this.color = color;
    }
    
    /** Returns the radius */
    public double getRadius() {
        return this.radius;
    }
    
    /** Returns the area of this Circle instance */
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + " color=" + this.color + "]";
    }
}