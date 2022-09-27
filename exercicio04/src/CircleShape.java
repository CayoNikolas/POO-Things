public class CircleShape extends Shape{
    public double radius;

    public CircleShape(double radius, Color color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area(){
        double area = (radius * radius) * 3.14;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
