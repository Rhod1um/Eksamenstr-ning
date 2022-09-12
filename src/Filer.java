import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Filer implements Comparable<Integer>{
  private File file = new File("text.txt");
  private ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,2));
  private Integer[] num = {1,2,3,4};
  private ArrayList<Integer> numbersArraylist = new ArrayList<>(Arrays.asList(num));
  public void go(){
    try{
      PrintStream out = new PrintStream(file);
      out.println("der");
      out.println(numbers);
      out.println(Arrays.toString(num));
      out.println(numbersArraylist);

    } catch (FileNotFoundException f){
      System.err.println(f);
    }
    System.out.println(numbers);
    Collections.sort(numbers);
    System.out.println(numbers);

    System.out.println(Math.sqrt(4));
  }

  public static void main(String[] args) {
    new Filer().go();
  }

  @Override
  public int compareTo(Integer o) {
    return numbers.get(0).compareTo(o);
  }
}

