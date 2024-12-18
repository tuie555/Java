package q1;
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
    
}

    

class Rectangle extends Shape {
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
}

class Mainclass {
    public static void main(String[] args) {
        Shape whiteshape = new Shape("white", false);
        System.out.println(whiteshape.toString());
        Shape redshape = new Shape("red", true);
        System.out.println(redshape.toString());
        Circle circle = new Circle(1.0, "white", false);
        System.out.println(circle.toString());
        Circle whitecircle = new Circle(2.5, "white", false);
        System.out.println(whitecircle.toString());
        Circle bluecircle = new Circle(3.0, "blue", true);
        System.out.println(bluecircle.toString());
        Rectangle rectangle = new Rectangle(1.0,1.0, "white", false);
        System.out.println(rectangle.toString());
        Rectangle whiterectangle = new Rectangle(4.0,5.0, "white", false);
        System.out.println(whiterectangle.toString());
        Rectangle greenrectangle = new Rectangle(6.0,7.0, "green", true);
        System.out.println(greenrectangle.toString());
    }
}