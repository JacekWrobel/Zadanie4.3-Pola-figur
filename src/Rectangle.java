public class Rectangle {
    double aSide;
    double bSide;

    Rectangle (double aS, double bS){
        aSide = aS;
        bSide = bS;
    }
    double rectPerimeter(){
        return  (aSide +bSide)*2;
    }
}
