public class Shape2D extends Shape {
    private double xCoordinate;
    private double yCoordinate;

    public Shape2D(String name, double xCoordinate, double yCoordinate) {
        super(name);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Shape2D(Shape2D obj) {
        super(obj.getName());
        this.xCoordinate = obj.xCoordinate;
        this.yCoordinate = obj.yCoordinate;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
