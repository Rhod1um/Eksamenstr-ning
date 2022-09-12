package dream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestDream {

  public void go(){
    ArrayList<Dream> dreams = new ArrayList<>();
    Dream d1 = new Dream(Type.MARRIDT, 10, LocalDate.of(2022,1,12));
    dreams.add(d1);
    Dream d2 = new Dream(Type.VÅD, 9, LocalDate.of(2021,12,2));
    dreams.add(d2);

    System.out.println(dreams);

    Collections.sort(dreams);

    System.out.println(dreams); //hvad bruges toString til med arraylister? Arraylister tager kun objekter
    //og med objekter skal man lave en toString alligevel for at den ikke printer referencen.
    //tostring er grå - bruges ikke
  }
  public static void main(String[] args) {
    new TestDream().go();
  }
  //parametre ved du ikke hvad er endnu, argumenter sender en konkret værdi
}
