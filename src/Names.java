import java.util.ArrayList;
import java.util.Arrays;

public class Names {
  private String firstName, middleName, lastName;
  private ArrayList<String> names;

  Names(String fullName){
    System.out.println(Arrays.toString(fullName.split(" "))); //Arrays.toString er bare til at printe
    // det pænt ud, det laver det ikke til en string
    String[] names = fullName.split(" ");
    if (names.length == 2){
      firstName = names[0];
      lastName = names[1];
    } else if (names.length == 3){
      firstName = names[0];
      middleName = names[1];
      lastName = names[2];
    } else {
      System.err.println("You have too many middle names");
      throw new RuntimeException(); //man kan kalde en generisk run time exception, men hvorfor?
      //throw new IllegalArgumentException(); ville give mere mening 
    }
  }

  public static void main(String[] args) {
    Names names = new Names("veronica bistrup beb Frydkjær");
  }
}
