public class Circle {
    double radius;
    double Pi = 3.1415;

    Circle(double r){
        radius = r;
    }
    double circleArea(){
        return Pi * radius * radius;
    }
}
