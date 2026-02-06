public class Circle {
    // Private attributes
    private double radius;
    private double originX;
    private double originY;

    // Constructor
    public Circle(double radius, double originX, double originY) {
        // Ensure the radius is positive
        if (radius > 0) this.radius = radius;

        // Set the origin of the circle
        this.originX = originX;
        this.originY = originY;
    }
    public Circle(double radius) {
        this(radius, 0, 0);
    }
    public Circle() {
        this(1, 0, 0);
    }

    //#region Getter and Setter Methods for Private Attributes
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
    }

    public double getOriginX() {
        return this.originX;
    }
    public void setOriginX(double originX) {
        if (originX > 0) this.originX = originX;
    }

    public double getOriginY() {
        return this.originY;
    }
    public void setOriginY(double originY) {
        if (originY > 0) this.originY = originY;
    }
    //#endregion
    
    //#region Utility Methods
    public double calcArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calcCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void move(double dx, double dy) {
        this.originX += dx;
        this.originY += dy;
    }

    public String toString() {
        return "Circle[x = " + this.originX + ", y = " + this.originY + ", radii = " + this.radius + "]";
    }

    public void scale(double scaleFactor) {
        this.radius *= scaleFactor;
    }

    public boolean isOverlappedWith(Circle c) {
        // Distance between centres
        double distance = Math.sqrt(Math.pow(this.originX - c.getOriginX(), 2) + Math.pow(this.originY - c.getOriginY(), 2));
        // Check if the distance between the two centres is less than the sum of the radii
        return distance < (this.radius + c.getRadius());
    }

    public boolean isEnclosedBy(Circle c) {
        // Distance between centres
        double distance = Math.sqrt(Math.pow(this.originX - c.getOriginX(), 2) + Math.pow(this.originY - c.getOriginY(), 2)) + this.radius;

        // If distance is less than c's radii, than this circle is enclosed by c
        return distance < c.getRadius();
    }
    //#endregion
}