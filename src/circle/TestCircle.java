package circle;

import java.util.Arrays;
import java.util.Comparator;

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

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(4);
        circles[2] = new Circle(3.5, false, "green");
        System.out.println("Before sorting");
        for (Circle c:
             circles) {
            System.out.println(c);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After sorting");
        for (int i = 0; i < circles.length; i++) {

            System.out.println(circles[i]);
        }
    }
}
