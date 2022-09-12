package dream;

import java.time.LocalDate;

public class Dream implements Comparable<Dream>{
  private LocalDate date;
  private double duration;
  private Type type;
  boolean isPleasant;

  Dream(Type type, double duration, LocalDate date){ //lav altid konstruktor
    this.type=type;
    this.duration=duration;
    this.date=date;
  }

  public void isPleasant(){ //skal en metode der hedder "is" altid returnere en boolean?
    if (type == Type.VÅD && duration < 10) printPleasant();
    else if (type == Type.TØR && duration > 10) printPleasant();
    else System.out.println("not pleasant");
  }

  public void printPleasant(){
    System.out.println("is pleasant");
  }

  @Override
  public int compareTo(Dream o) {
    return date.compareTo(o.date);
  }

  @Override
  public String toString() {
    return "Date: " + date; //skal returnere string, kan ikke returnere date alene
  }

  public void setDuration(double duration){
    this.duration=duration;
  }
  public double getDuration(){
    return duration;
  }
}
