public class ShapeCalculator {

    double squareArea(Square square){
        return square.side * square.side;
    }
    double circleArea(Circle cirle){
        return cirle.Pi*cirle.radius*cirle.radius;
    }
    double trianglePerimeter(Triangle triangle){
        return triangle.aSide + triangle.bSide + triangle.cSide;
    }
    double rectPerimeter(Rectangle rectangle){
        return  (rectangle.aSide +rectangle.bSide)*2;
    }

}
