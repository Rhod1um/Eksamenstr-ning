import java.util.Random;

public class Julegave {
  private boolean isSoft, isRectangular, doesRattle;

  Julegave(){
    Random random = new Random(); //definer ikke datatype fra start indtagen med tal så (6)+1; fx
    isSoft = random.nextBoolean();
    isRectangular = random.nextBoolean();
    doesRattle = random.nextBoolean();
  }

  public void couldBeLego(){
    if (isRectangular==true && isSoft==true && doesRattle == true) {
      System.out.println("May be lego");
    } else System.out.println("Probably not lego");
  }

  public static void main(String[] args) {
    new Julegave().couldBeLego();
  }
}
