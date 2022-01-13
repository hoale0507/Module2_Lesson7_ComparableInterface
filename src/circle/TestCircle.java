package circle;

import java.util.Arrays;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(20, true, "green");
        System.out.println((circle));

        ComparableCircle [] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle();
        comparableCircles[1] = new ComparableCircle(20);
        comparableCircles[2] = new ComparableCircle(5);

        Arrays.sort(comparableCircles);
        for (ComparableCircle circle1: comparableCircles
             ) {
            System.out.println(circle1);
        }
    }
}
