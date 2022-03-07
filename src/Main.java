public class Main {

    public static void main(String[] args) {
        Sphere ball = new Sphere("Football", 45, 33, 10, 50);

        System.out.println(ball.volume());
        System.out.println(ball.surfaceArea());
    }
}
