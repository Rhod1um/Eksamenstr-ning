package squarecircle;

public class Square implements Shape {
  private int width;

  Square(int width){
    this.width=width;
  }


  @Override
  public double getArea() {
    double area = width*width;
    return area;
  }
}
