package homework2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5);
        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Circle(5);
        shapes[3] = new Triangle(6, 8, 10);
        shapes[4] = new Rectangle(3, 6);

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total perimeter of all shapes: " + totalPerimeter);
    }
}