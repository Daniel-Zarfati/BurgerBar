package AppBillsBurgers;

class Deluxeburger extends Hamburger {

    public Deluxeburger() {
        super("Deluxe", "White", "Sausage & Bacon", 14.54);
        super.addHamburgerAddition1("Chips",2.75);// need to add 2 addition so put it in the constructor
        super.addHamburgerAddition2("Drink",3.73);// creating the deluxe burger with the addition at the time the burger creating
     }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add addition to Deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add addition to Deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add addition to Deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add addition to Deluxe burger");
    }
}
