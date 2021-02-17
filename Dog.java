class Dog extends PetParent
{
  private boolean hasTail;
  private int loyalty;
  private String breed;

  //sub class
  public Dog(String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasTail, int loyalty, String breed)
  {
    super(name, hasHair, color, cuteness, friendliness);
    this.hasTail = hasTail;
    this.loyalty = loyalty;
    this.breed = breed;
  }

  public String speak()
  {
    return "Aarf";
  }

  public String toString()
  {
    String output = super.toString();
    output += "\nHas a tail? = " + hasTail +
              "\nLoyalty (1-10) = " + loyalty +
              "\nFriendliness (%) = " + friendliness;
    return output;
  }
}