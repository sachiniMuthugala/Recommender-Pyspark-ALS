

public abstract class GeometricObject {
    protected String colour;
    protected boolean filled;

    public GeometricObject(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getShape();
}
