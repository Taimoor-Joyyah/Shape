public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(Shape obj) {
        this.name = obj.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}