public class TestCalc {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Square square = new Square(5);
        System.out.println(shapeCalculator.squareArea(square));

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(shapeCalculator.rectPerimeter(rectangle));

        Circle circle = new Circle(5);
        System.out.println(shapeCalculator.circleArea(circle));

        Triangle triangle = new Triangle(5,4, 6);
        System.out.println(shapeCalculator.trianglePerimeter(triangle));

    }
}
