public class Sphere extends Shape3D {
    private double radius;

    public Sphere(String name, double xCoordinate, double yCoordinate, double zCoordinate, double radius) {
        super(name, xCoordinate, yCoordinate, zCoordinate);
        this.radius = radius;
    }

    public Sphere(Sphere obj) {
        super(obj.getName(), obj.getXCoordinate(), obj.getYCoordinate(), obj.getZCoordinate());
        this.radius = obj.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * 3.14 * radius * radius;
    }

    public  double volume() {
        return (double) (4 / 3) * 3.14 * radius * radius * radius;
    }
}
