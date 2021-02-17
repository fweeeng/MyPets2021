abstract class PetParent
{
  private String name;
  public boolean hasHair;
  public String color;
  public int cuteness;
  public double friendliness;

  public PetParent(String name, boolean hasHair, String color, int cuteness, double friendliness)
  {
    this.name = name;
    this.hasHair = hasHair;
    this.color = color;
    this.cuteness = cuteness;
    this.friendliness = friendliness;
  }

  public String getName()
  {
    return name;
  }//end name getter

  public void setName(String name)
  {
    this.name = name;
  }

  //brain method
  public String dailyRoutine()
  {
    return name + ": Play in the morning and eat dinner at 5:00 PM";
  }

  public abstract String speak(); //this is an abstract method. it has no body

  public String toString()
  {
    return "Name = " + name +
            "\nhasHair = " + hasHair +
            "\ncolor = " + color +
            "\ncuteness (1-10) = " + cuteness +
            "\nfriendliness (% in decimal form) = " + friendliness;
  }
}