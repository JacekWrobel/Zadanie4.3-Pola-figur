public class Triangle {
    double aSide;
    double bSide;
    double cSide;

    Triangle(double a, double b, double c){
        aSide = a;
        bSide = b;
        cSide = c;
    }
    double trianglePerimeter(){
        return aSide + bSide + cSide;
    }
}
