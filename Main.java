class Main {
  public static void main(String[] args) {
    Bar bar = new Bar();
    Student fred = new Student();
    fred.moneyInPocket = 20;
    Student jim = new Student();
    jim.moneyInPocket = 40;
    Student sheila = new Student();
    sheila.moneyInPocket = 60;

    buyDrink(fred,bar);
    buyDrink(fred,bar);
    buyDrink(jim,bar);
    buyDrink(sheila,bar);
    buyDrink(jim,bar);
    buyDrink(sheila,bar);
    buyDrink(sheila,bar);
    buyDrink(fred,bar);

    System.out.println("Fred has £" + fred.moneyInPocket + " and " + fred.cansOfRockstarRequiredForLecture + " cans of Rockstar.");
    System.out.println("Jim has £" + jim.moneyInPocket + " and " + jim.cansOfRockstarRequiredForLecture + " cans of Rockstar.");
    System.out.println("Sheila has £" + sheila.moneyInPocket + " and " + sheila.cansOfRockstarRequiredForLecture + " cans of Rockstar.");

    System.out.println("The bar has taken £" + bar.takings);

  }

  public static void buyDrink(Student person, Bar theBar){
    person.moneyInPocket -= 2.50;
    person.cansOfRockstarRequiredForLecture++;
    theBar.takings += 2.50;
  }

}