public class Rectangle extends GeometricObject{

    protected double length;
    protected double width;

    public Rectangle(String colour, boolean filled, double length, double width) {
        super(colour, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter(){
        return 2 * (getLength() + 2) * getWidth();
    }

    @Override
    public String getShape(){
        return "Rectangle";
    }


}
