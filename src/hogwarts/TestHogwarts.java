package hogwarts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestHogwarts {
  private HogwartsStudent student1 = new HogwartsStudent("run", "weasly");
  private HogwartsStudent student2 = new HogwartsStudent("harry", "potter");
  private Scanner sc = new Scanner(System.in);
  private House house;
  private ArrayList<String> names;
  private ArrayList<HogwartsStudent> students;

  public void go(){
    boolean isRunning=true;
    while (isRunning){
      System.out.print("type house: ");
      String houseInput = sc.nextLine();

      switch (houseInput.toLowerCase()){
        case "gryffindor" -> {
          student1.setHouse(House.GRYFFINDOR);
          isRunning = false;
        }
        case "ravenclaw" -> {
          student1.setHouse(House.RAVENCLAW);
          isRunning = false;
        }
        case "slytherin" -> {
          student1.setHouse(House.SLYTHERING);
          isRunning = false;
        }
        case "hufflepuff" -> {
          student1.setHouse(House.HUFFLEPUFF);
          isRunning = false;
        }
        default -> System.out.println("wrong house");
      }
    }

    students = new ArrayList<>(Arrays.asList(student1,student2));
    System.out.println(students);
    Collections.sort(students);
    System.out.println(students);

    //names = new ArrayList<>(Arrays.asList("cynder", "ayo"));
    //System.out.println(names);
    //Collections.sort(names);
    //System.out.println(names);
  }


  public static void main(String[] args) {
    new TestHogwarts().go();
  }

  public void run(){
      switch ("ghj"){
        case "gryffindor", "ravenclaw", "slytherin", "hufflepuff" -> student1.setHouse(house);
        default -> throw new IllegalArgumentException("Not a house");
      }
  }
}
