public class Circle extends Shape2D {
    private double radius;

    public Circle(String name, double xCoordinate, double yCoordinate, double radius) {
        super(name, xCoordinate, yCoordinate);
        this.radius = radius;
    }

    public Circle(Circle obj) {
        super(obj.getName(), obj.getXCoordinate(), obj.getYCoordinate());
        this.radius = obj.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}
