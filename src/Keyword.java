import java.lang.reflect.Array;
import java.util.ArrayList;

public class Keyword {
  private String word;
  private String definition;
  private static ArrayList<String> keywords = new ArrayList<>();

  Keyword(String word, String definition){ //spørg, klasser der laver instanser af sig i sig selv??
    this.word=word;
    this.definition=definition;
  }

  public boolean matches(String searchWord){
    return word.equals(searchWord);
  }

  public static void seeAlso(){
    keywords.add("j");
  }
}
