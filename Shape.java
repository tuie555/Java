// Base class Shape
public class Shape {
    private String color;
    private boolean filled;

    // Default constructor
    public Shape() {
        this("white", false); // Default color white and not filled
    }

    // Parameterized constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    // Get Circle shape
    public double getCircleArea(double radius)  {

        return Math.PI * radius * radius;
    }
    public double getAreaCircle(double radius)  {

        return getCircleArea(radius);
    }

    // Get Rectangle shape
    public double getRectangleArea(double radius)  {

        return Math.PI * radius * radius;
    }
    public double getAreaRectangle(double radius)  {

        return getRectangleArea(radius);
    }



    public double getCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }


    public double getRectanglePerimeter() {
        return 0;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle (){
        this(1,"red",true);
    }
    public Circle(double radius, String color, boolean  filled) {
        super (color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius =" + radius + " which is a subclass of A Shape with color of " + super.toString();
    }
    public String getArea() {
        return "Area:" + super.getCircleArea(this.radius);
    }
    public String getPerimeter() {
        return "Perimeter" + super.getCirclePerimeter(this.radius);
    }
}

    

class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle (double length, double width,String color ,boolean filled ) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
        return length * width;
    }     public double getPerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public String toString() {
        return "A Circle with radius =" + length + " which is a subclass of A Shape with color of " + super.getColor() + " and " + (super.isFilled() ? "filled" : "not filled");
    }
}

class Main {
    public static void main(String[] args) {
        Shape whiteshape = new Shape("blue", false);
        System.out.println(whiteshape.toString());
        Shape redshape = new Shape("red", true);
        System.out.println(redshape.toString());

        Circle circle = new Circle(1.0, "white", true);
        System.out.println(circle.toString());
        Circle whitecircle = new Circle(2.5, "white", true);
        System.out.println(whitecircle.toString());
        // area
        System.out.println(whitecircle.getArea());
        // perimeter
        System.out.println(whitecircle.getPerimeter());

        Circle bluecircle = new Circle(3.0, "blue", true);
        System.out.println(bluecircle.toString());

        Rectangle rectangle = new Rectangle(3.5,5.6, "green", true);
        System.out.println(rectangle.toString());
        Rectangle whiterectangle = new Rectangle(3.5,5.6, "green", true);
        System.out.println(whiterectangle.toString());
        // area
        System.out.println(rectangle.getArea());
        // perimeter
        System.out.println(rectangle.getPerimeter());

        Rectangle greenrectangle = new Rectangle(3.5,5.6, "green", true);
        System.out.println(greenrectangle.toString());
    }
}