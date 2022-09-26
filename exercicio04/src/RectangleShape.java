public class RectangleShape extends Shape{

    public double width;
    public double height;

    public RectangleShape(double width, double height, Color color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        double area = width*height;
        return area;
    }
    
}
