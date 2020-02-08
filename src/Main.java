import javafx.util.Pair;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(2.0, 2.0), 2.0);
        Circle c2 = new Circle(new Point(3.0, 3.0), 3.0);

        Pair<Point, Point> solution = c1.intersection(c2);

        System.out.printf("First intersection in %s %n", solution.getKey().toString());
        System.out.printf("Second intersection in %s %n", solution.getValue().toString());

        System.out.println("---------------------------------------------");

        c1 = new Circle(new Point(2.0, 2.0), 2.0);
        c2 = new Circle(new Point(3.0, 3.0), 2.0);

        solution = c1.intersection(c2);

        System.out.printf("First intersection in %s %n", solution.getKey().toString());
        System.out.printf("Second intersection in %s %n", solution.getValue().toString());

        System.out.println("---------------------------------------------");

        c1 = new Circle(new Point(3.0, 1.0), 1.0);
        c2 = new Circle(new Point(1.0, 1.0), 1.0);

        try {
            solution = c1.intersection(c2);
            System.out.printf("First intersection in %s %n", solution.getKey().toString());
            System.out.printf("Second intersection in %s %n", solution.getValue().toString());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("---------------------------------------------");

        c1 = new Circle(new Point(5.0, 1.0), 1.0);
        c2 = new Circle(new Point(1.0, 1.0), 1.0);

        try {
            solution = c1.intersection(c2);
            System.out.printf("First intersection in %s %n", solution.getKey().toString());
            System.out.printf("Second intersection in %s %n", solution.getValue().toString());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}
