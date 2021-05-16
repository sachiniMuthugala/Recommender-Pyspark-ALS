public class Square extends GeometricObject {

    protected double side;

    public Square(String colour, boolean filled, double side) {
        super(colour, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter(){
        return 4 * getSide();
    }

    @Override
    public String getShape(){
        return "Square";
    }
}
