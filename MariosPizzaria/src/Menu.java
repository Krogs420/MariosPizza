import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Pizza> menuKort = new ArrayList();

    Pizza pizza1 = new Pizza(1, 57, "Vesuvio", "Tomat, Ost, Origano, Skinke");
    Pizza pizza2 = new Pizza(2, 53, "Amerikaner", "Tomat, Ost, Oksefars, Origano");
    Pizza pizza3 = new Pizza(3, 57, "Cacciatore", "Tomat, Ost, Pepperoni, Origano");
    Pizza pizza4 = new Pizza(4, 63, "Carbona", "Tomat, Ost, Kødsovs, Spagetti, Pølser, Origano");
    Pizza pizza5 = new Pizza(5, 65, "Dennis", "Tomat, Ost, Skinke, Pepperoni, Pølser, Origano");

    public void udskrivMenu() {


        for (int i = 0; i < menuKort.size(); i++) {
            System.out.println(menuKort.get(i));
        }
    }

    public void tilføjPizza() {
        menuKort.add(pizza1);
        menuKort.add(pizza2);
        menuKort.add(pizza3);
        menuKort.add(pizza4);
        menuKort.add(pizza5);
    }

    public int pizzaValg() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Alfonso indtaster ordre her");
        int valg = scan.nextInt();
        scan.nextLine(); //Scanner bug

        switch (valg) {

            case 1:
                System.out.println("Du har valgt: \n" + pizza1);
                return pizza1.getNummer() + pizza1.getPris(); // Skal ændres til en pizza valg!!!
        }


        return 0;
    }
}
