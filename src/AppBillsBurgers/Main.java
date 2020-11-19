package AppBillsBurgers;


import java.text.DecimalFormat;

public class Main {
    public static void main(String[] arg){

        Hamburger hamburger = new Hamburger("Dani","White","Angos",30.45);
        double price = hamburger.itemizeHamburger(); // in Hamburger class "itemiz.." returning final price.
        hamburger.addHamburgerAddition1("Onion",4);
        hamburger.addHamburgerAddition2("lettuce",0.75);
        hamburger.addHamburgerAddition3("tomato",5.5);
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger());

        Healthyburger healthyburger = new Healthyburger("bacon",5.67);
        healthyburger.addHamburgerAddition1("Egg",5.43);
        healthyburger.addHamburgerAddition1("Lentils",3.43);
        System.out.println("Total price for the hamburger is: "+healthyburger.itemizeHamburger());

        Deluxeburger deluxeburger = new Deluxeburger();
        deluxeburger.itemizeHamburger();
        deluxeburger.addHamburgerAddition1("dani",5.56);
    }
}
