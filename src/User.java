import java.util.Locale;
import java.util.Random;

public class User {

  private String fullName;
  private String userID;

  public boolean validUserID(String userID){
    String lettersID = userID.substring(0,4); //4 er loft, tæller ikke med
    String numbersID = userID.substring(4,8);

    if (userID.length() > 8){
      printFalse();
      return false;
    }

    for(int i =0; i < lettersID.length(); i++){
      if (!('a' <= lettersID.charAt(i) && lettersID.charAt(i)  <= 'z')){
        printFalse();
        return false;
      }
    }
    for (int i = 0; i < numbersID.length(); i++){
      if(!('0' <= numbersID.charAt(i) && numbersID.charAt(i) <= '9')){
        printFalse();
        return false;
      }
    }
    System.out.println("correct ID");
    return true;
  }

  public void createUserID(String fullName){
    String[] names = fullName.split(" ");
    String lettersInID = names[0].substring(0,2) + names[1].substring(0,2);
    System.out.println(lettersInID);

    Random random = new Random();

    for (int i = 0; i < 4; i++){
      lettersInID += random.nextInt(0,10);
    }
    userID = lettersInID; //toString fordi letters
    System.out.println(userID);
  }

  public void createUserIDStringBuilder(String fullName){
    String[] names = fullName.split(" ");
    StringBuilder lettersInID = new StringBuilder(names[0].substring(0, 2) + names[1].substring(0, 2));
    System.out.println(lettersInID);

    Random random = new Random();

    StringBuilder stringBuilder = new StringBuilder("123"); //bruges ikke i opgaven, behøves ikke laves fordi Stringbuilder er abstract, derfor kalder man StringBuilder.append. Der er både StringBuilder og AbstractStringBuilder
    stringBuilder.append("vjhbk"); //string builder objekt indeholder bare den string?
    System.out.println(stringBuilder);

    for (int i = 0; i < 4; i++){
      lettersInID.append(random.nextInt());
    }

    userID = lettersInID.toString(); //toString fordi letters
    System.out.println(userID);
  }

  public void printFalse(){
    System.out.println("incorrect id");
  }

  public static void main(String[] args) {
    new User().createUserID("Veronica Frydkjær".toLowerCase());

  }
}
