package squarecircle;

import java.util.ArrayList;

public class Test {
  ArrayList<Shape> shapes = new ArrayList<>();

  public void go(){
    Circle c1 = new Circle(5);
    shapes.add(c1);
    Square s1 = new Square(6);
    shapes.add(s1);
    Circle c2 = new Circle(7);
    shapes.add(c2);

    //interface som datatype??

    for (int i=0; i < shapes.size(); i++){
      System.out.println(shapes.get(i).getArea());
    }
    for (Shape s : shapes){
      System.out.println(s.getArea()); //husk s er det objekt man trækker ud af arraylisten
    }
  }

  public static void main(String[] args) {
    new Test().go();
  }
}
