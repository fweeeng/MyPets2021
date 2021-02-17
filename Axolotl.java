class Axolotl extends PetParent
{
  //instance variables
  private boolean hasRegen;
  //constructors
  public Axolotl(String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasRegen)
  {
    super(name, hasHair, color, cuteness, friendliness);
    this.hasRegen = hasRegen;
  }
  public String dailyRoutine()
  {
    return super.getName() + ": eat and sleep whenever then a bath";
  }

  public String speak()
  {
    if(hasRegen == false)
    {
      return "Gurgle";
    }
    else
    {
      return "Bloop";
    }
  }

  //toString
  public String toString()
  {
    String output = super.toString();
    output += "Regenerate: " + hasRegen;
    return output;
  }//end toString


}