package q2;
// Base class Shape


public class Shape2 {
    private String color;
    private boolean filled;

    // Default constructor
    public Shape2() {
        this("white", false); // Default color white and not filled
    }

    // Parameterized constructor
    public Shape2(String color, boolean filled) {
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
    public double getRectangleArea(double length, double width)  {

        return length * width;
    }
    //public double getAreaRectangle(double radius)  {

        //return getRectangleArea(radius);
    //}



    public double getCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }


    public double getRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
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

class Circle extends Shape2 {
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
        return "Area:" + super.getCircleArea(radius);
    }
    public String getPerimeter() {
        return "Perimeter:" + super.getCirclePerimeter(radius);
    }
}

    

class Rectangle extends Shape2 {
    private double length;
    private double width;
    public Rectangle (double length, double width,String color ,boolean filled ) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    
    
    
    @Override
    public String toString() {
        return "A Circle with radius =" + length + " which is a subclass of A Shape with color of " + super.getColor() + " and " + (super.isFilled() ? "filled" : "not filled");
    }
    public String getArea() {
        return "Area:" + super.getRectangleArea(length,width);
    }
    public String getPerimeter() {
        return "Perimeter:" + super.getRectanglePerimeter(length,width);
    }
}

class Mainclass {
    public static void main(String[] args) {
        Shape2 whiteshape = new Shape2("blue", false);
        System.out.println(whiteshape.toString());
        Shape2 redshape = new Shape2("red", true);
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

        Rectangle rectangle = new Rectangle(1.0,1.0, "green", true);
        System.out.println(rectangle.toString());
        Rectangle whiterectangle = new Rectangle(4.0,5.0, "green", true);
        System.out.println(whiterectangle.toString());
        // area
        System.out.println(whiterectangle.getArea());
        // perimeter
        System.out.println(whiterectangle.getPerimeter());

        Rectangle greenrectangle = new Rectangle(6.0,7.0, "green", true);
        System.out.println(greenrectangle.toString());
    }
}