public class TestShape 
{
    public static void main(String[] args) 
    {
        Shape shape1 = new Shape("black", false);
        System.out.println(shape1.toString() + "\n");

        Circle2 circle1 = new Circle2(12.0);
        System.out.println(circle1.toString());
        System.out.println("Area of Circle: " + circle1.getArea() +
                           "\nPerimeter of Circle:  " + circle1.getPerimeter() + "\n");

        Rectangle rectangle1 = new Rectangle("red", false, 15.0, 20.0);
        System.out.println(rectangle1.toString());
        System.out.println("Area of Rectangle: " + rectangle1.getArea() +
                           "\nPerimeter of Rectangle:  " + rectangle1.getPerimeter() + "\n");

        Square square1 = new Square();
        System.out.println(square1.toString());
        System.out.println("Area of Square: " + square1.getArea() +
                           "\nPerimeter of Square:  " + square1.getPerimeter() + "\n");

    }
}
