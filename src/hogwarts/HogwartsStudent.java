package hogwarts;

public class HogwartsStudent implements Comparable<HogwartsStudent>{
  private String firstName;
  private String lastName;
  private House house;

  public HogwartsStudent(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
  }

  public void setHouse(House house){
    if (house == null){
      throw new IllegalArgumentException("house must be set");
    }
    this.house=house;

    System.out.println(house.toString()); //enum til string
  }

  @Override
  public int compareTo(HogwartsStudent o) {
    return lastName.compareTo(o.lastName);
  }

  //@Override
  //public int compareTo(String lastName) {
    //return this.lastName.compareTo(lastName);
  //}


  @Override
  public String toString() {
    return firstName + " " + lastName;
  }
}
