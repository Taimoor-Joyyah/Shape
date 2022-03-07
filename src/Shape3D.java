public class Shape3D extends Shape {
    private double xCoordinate;
    private double yCoordinate;
    private double zCoordinate;

    public Shape3D(String name, double xCoordinate, double yCoordinate, double zCoordinate) {
        super(name);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }

    public Shape3D(Shape3D obj) {
        super(obj.getName());
        this.xCoordinate = obj.xCoordinate;
        this.yCoordinate = obj.yCoordinate;
        this.zCoordinate = obj.zCoordinate;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getZCoordinate() {
        return zCoordinate;
    }

    public void setZCoordinate(double zCoordinate) {
        this.zCoordinate = zCoordinate;
    }
}
