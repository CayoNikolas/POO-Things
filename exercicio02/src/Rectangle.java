import java.lang.Math;

public class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        double area = width*height;
        return area;
    }

    public double perimeter(){
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    public double diagonal(){
        double diagonal = Math.sqrt((width*width) + (height*height));
        return diagonal;
    }
}
