import javafx.util.Pair;

public class Circle {
    public Point center;
    public double radio;

    public Circle(Point center, double radio) {
        this.center = center;
        this.radio = radio;
    }

    public Pair<Point, Point> intersection(Circle other) {
        double d = center.distance(other.center);

        if (d > this.radio + other.radio) throw new ArithmeticException("The circles have no intersections");
        if (d >= this.radio + other.radio) throw new ArithmeticException("The circles have one intersection");

        double a = (radio * radio - other.radio * other.radio + d * d) / (2 * d);
        double h = Math.sqrt(radio * radio - a * a);
        Point P2 = other.center.sub(this.center).scale(a / d).add(this.center);
        double x3 = P2.x + h * (other.center.y - this.center.y) / d;
        double y3 = P2.y - h * (other.center.x - this.center.x) / d;
        double x4 = P2.x - h * (other.center.y - this.center.y) / d;
        double y4 = P2.y + h * (other.center.x - this.center.x) / d;

        return new Pair<>(new Point(x3, y3), new Point(x4, y4));
    }
}