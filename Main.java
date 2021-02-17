class Main 
{
  public static void main(String[] args) 
  {
    //name, hasHair, color, cuteness, friendliness
    //PetParent pet = new PetParent("Bob", true, "yellow", 2, 0.9);

    Dog marsh = new Dog("Marsh", true, "brown", 10, 40.0, true, 10, "Chow-chow");

    Axolotl ombre = new Axolotl("Ombre", true, "blue", 5, 0.7, true); 
    
    /*
    * PetParent type using the Dog method
    * Can access constructors in PetParent
    */
    PetParent vader = new Dog("Vader", true, "brown", 4, 0.02, false, 1, "Sheepdog");
    
    PetParent clifford = new Axolotl("Clifford", true, "purple", 10, 0.01, false);

    System.out.println(vader.dailyRoutine());
    System.out.println(((Dog)vader).getLoyalty());//example of casting
    System.out.println(clifford.dailyRoutine());

    PetParent[] myPets = {marsh, vader, ombre, clifford};

    for(PetParent animals: myPets)
    {
        System.out.println(animals.getName() + " says " + animals.speak());
    }
    //*REMEMBER: CAST FIRST* (or else you lose the data)

    // System.out.println(ombre.speak());
    // System.out.println(marsh.speak());

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