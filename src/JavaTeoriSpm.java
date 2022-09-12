import java.util.ArrayList;
import java.util.List;

public class JavaTeoriSpm {

  public void go(){
    List<Integer> lst = new ArrayList<>();
    lst.add(1);
    for (int i = 0; i < lst.size(); i++) {
      System.out.println(lst.get(i).getClass().getName());
      //java.lang.Integer
    }
  }

  public void run(){
    List<Integer> lst = new ArrayList<>();
    lst.add(1);
    for (Integer ii: lst) {
      System.out.println(ii.getClass().getName());
    } //java.lang.Integer
  }

  public void testWrapperClassImmutability(){
    Integer integer1 = Integer.valueOf(8);

  }

  public static void main(String[] args) {
    new JavaTeoriSpm().run();
  }
}
