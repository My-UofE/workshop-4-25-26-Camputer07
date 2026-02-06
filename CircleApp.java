public class CircleApp {
    // Main enry point
    public static void main (String[] args) {
        // Test out all the methods of the circle class

        // Create three new circles
        Circle c1 = new Circle(5, 12, 6);
        Circle c2 = new Circle(7, 13, 5);
        Circle c3 = new Circle(4, 11, 7);

        // Print out the information about each circle
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Check if c1 overlaps with c3
        System.out.println("c1 overlaps c3? " + c1.isOverlappedWith(c3));

        // Check if c1 is enclosed by c2
        System.out.println("c1 is enclosed by c2? " + c1.isEnclosedBy(c2));
    }
}