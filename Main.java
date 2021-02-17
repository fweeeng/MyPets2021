class Main 
{
  public static void main(String[] args) 
  {
    //name, hasHair, color, cuteness, friendliness
    //PetParent pet = new PetParent("Bob", true, "yellow", 2, 0.9);

    Dog marsh = new Dog("Marsh", true, "brown", 10, 40.0, true, 10, "Chow-chow");

    Axolotl ombre = new Axolotl("Ombre", true, "blue", 5, 0.7, true); 

    System.out.println(ombre.speak());
    System.out.println(marsh.speak());
    //String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasRegen

    //System.out.println(ombre.dailyRoutine());
    //pet.setName("Marco");
    //System.out.println(pet.toString());

    // System.out.println(pet.toString());
    // System.out.println();
    // System.out.println(marsh.toString());
    // System.out.println();
    // System.out.println(ombre.toString());
    // System.out.println();

  }
}