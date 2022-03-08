public class Cuboid extends Shape3D{
    private double height;
    private double length;
    private double width;

    public Cuboid(String name, double xCoordinate, double yCoordinate,
                  double zCoordinate, double height, double length, double width) {
        super(name, xCoordinate, yCoordinate, zCoordinate);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Cuboid(Cuboid obj) {
        super(obj.getName(), obj.getXCoordinate(), obj.getYCoordinate(), obj.getZCoordinate());
        this.height = obj.height;
        this.length = obj.length;
        this.width = obj.width;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea() {
        return 2 * ((height * length) + (length * width) + (width * height));
    }

    public  double volume() {
        return height * length * width;
    }
}
