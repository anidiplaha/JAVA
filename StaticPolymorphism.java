class StaticPolymorphism{
  public void computer() {
    System.out.println("Computer Have Two Parts");
  }
}

class Hardware extends computer{
  public void computer() {
    System.out.println("The Touchable or Physical Part of a Computer is Hardware");
  }
}

class Software extends computer {
  public void computer() {
    System.out.println("The Non Touchable or Logical Part of a Computer is Software");
  }
}