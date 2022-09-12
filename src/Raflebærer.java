import java.util.Arrays;
import java.util.Random;

public class Raflebærer {
 //private = access modifier

  private int numOfDice;

  private int[] dice = new int[numOfDice];

  Raflebærer(){
    numOfDice = 5; //hvorfor bliver konstruktør ikke kaldt?
  }


  public int shake(){
    int collectedEyes=0;
    Random random = new Random((6)+1);

    for (int i=0; i < dice.length; i++){
      System.out.println("vhgj");
      dice[i] = random.nextInt();
      collectedEyes += dice[i];
      //see(dice[i]);
    }
    see(dice);
    return collectedEyes;
  }

  public void see(int[] dice){
    System.out.println(Arrays.toString(dice) + "fgHJ");
  }

  public static void main(String[] args) {
    new Raflebærer().shake();
  }

}
