public class Rectangle extends Shape2D{
    private double height;
    private double length;

    public Rectangle(String name, double xCoordinate, double yCoordinate, double height, double length) {
        super(name, xCoordinate, yCoordinate);
        this.height = height;
        this.length = length;
    }

    public Rectangle(Rectangle obj) {
        super(obj.getName(), obj.getXCoordinate(), obj.getYCoordinate());
        this.height = obj.height;
        this.length = obj.length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double perimeter() {
        return 2 * (height + length);
    }

    public double area() {
        return height * length;
    }
}
