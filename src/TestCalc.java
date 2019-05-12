public class TestCalc {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Square square = new Square(5);
        double squArea = square.squareArea();
        System.out.println(squArea);

        Rectangle rectangle = new Rectangle(5,10);
        double rectPeri = rectangle.rectPerimeter();
        System.out.println(rectPeri);

        Circle circle = new Circle(5);
        double circArea = circle.circleArea();
        System.out.println(circArea);

        Triangle triangle = new Triangle(5,4, 6);
        double triaPeri = triangle.trianglePerimeter();
        System.out.println(triaPeri);

    }
}
