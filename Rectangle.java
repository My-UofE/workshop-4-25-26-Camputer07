// A Rectangle class

import java.nio.ReadOnlyBufferException;

public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // Second constructor
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // Third constructor
  public Rectangle() {
    this(1, 1, 0, 0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the perimeter of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  // Method: scale width and height separately
  public void scale(double scaleX, double scaleY) {
    // Scale the width and height individually
    this.width *= scaleX;
    this.height *= scaleY;
  }

  // Method: scale width and height together
  public void scale(double scale) {
    // Scale the width and height by the same amount
    this.width *= scale;
    this.height *= scale;
  }

  // Method: checks if two rectangles are overlapping
  public boolean isOverlappedWith(Rectangle r) {
    // Check if the two rectangles are overlapping in the x direction
    boolean xOverlap = (Math.abs(r.originX - this.originX)) < ((this.width / 2) + (r.width / 2));
    
    // Check if the two rectangles are overlapping in the y direction
    boolean yOverlap = (Math.abs(r.originY - this.originY)) < ((this.height / 2) + (r.height / 2));

    // For the two rectangles to be overlapping, they must overlap in the x and y direction
    return xOverlap && yOverlap;
  }

  // Method: checks if two rectangles are overlapping
  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    // Use the above function to reduce code duplication
    return r1.isOverlappedWith(r2);
  }

  // Method: calculate the aspect ratio of the rectangle
  public double calcRatio(double width, double height) {
    return width / height;
  }

  // Method: determine if this rectangle is square
  public boolean isSquare() {
    // Calculate the aspect ratio of this rectangle
    double aspectRatio = calcRatio(this.width, this.height);

    // If this is within a treshold range, it is square
    return (0.999999 < aspectRatio) && (aspectRatio < 1.000001);
  }

  //#region Getter and Setter methods for private attributes
  public double getWidth() {
    return this.width;
  }
  public void setWidth(double width) {
    if (width > 0) this.width = width;
  }

  public double getHeight() {
    return this.height;
  }
  public void setHeight(double height) {
    if (height > 0) this.height = height;
  }

  public double getOriginX() {
    return this.originX;
  }
  public void setOriginX(double originX) {
    this.originX = originX;
  }

  public double getOriginY() {
    return this.originY;
  }
  public void setOriginY(double originY) {
    this.originY = originY;
  }
  //#endregion

  // Return a description of a rectangle in the form of
  // Rectangle[x=*,y=*,w=*,h=*]
  public String toString(){
    return "Rectangle[x="+originX+",y="+originY+",w="+width+",h="+height+"]";
  }
}
