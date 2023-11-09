interface IShape {
    double getSquare(int x, int y);
}

public class task3 {
    public static void main(String[] args) {
        IShape square = (x, y) -> x * y;
        IShape triangle = (x, y) -> 0.5 * x * y;

        int squareSide = 5;
        int triangleBase = 4;
        int triangleHeight = 3;

        double squareArea = square.getSquare(squareSide, squareSide);
        double triangleArea = triangle.getSquare(triangleBase, triangleHeight);

        System.out.println("Площадь квадрата: " + squareArea);
        System.out.println("Площадь треугольника: " + triangleArea);
    }
}
