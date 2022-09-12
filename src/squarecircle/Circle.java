package squarecircle;

public class Circle implements Shape {
  private int radius;

  Circle(int radius){
    this.radius=radius;
  }

  @Override
  public double getArea() {
    double area = Math.PI*radius*radius;
    return area;
  }
}
