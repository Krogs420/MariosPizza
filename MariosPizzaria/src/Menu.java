import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Pizza> menuKort = new ArrayList();

    KasseApparat kasse = new KasseApparat();

    Pizza pizza1 = new Pizza(1, 57, "Vesuvio", "Tomat, Ost, Origano, Skinke");
    Pizza pizza2 = new Pizza(2, 53, "Amerikaner", "Tomat, Ost, Oksefars, Origano");
    Pizza pizza3 = new Pizza(3, 57, "Cacciatore", "Tomat, Ost, Pepperoni, Origano");
    Pizza pizza4 = new Pizza(4, 63, "Carbona", "Tomat, Ost, Kødsovs, Spagetti, Pølser, Origano");
    Pizza pizza5 = new Pizza(5, 65, "Dennis", "Tomat, Ost, Skinke, Pepperoni, Pølser, Origano");

    public void udskrivMenu() {

        System.out.println("Menu:");
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
        boolean run = true;

        while(run == true) {
            System.out.println("\nAlfonso indtaster ordre her: ");
            int valg = scan.nextInt();
            scan.nextLine(); //Scanner bug

            switch (valg) {



                case 1:
                    System.out.println("Du har valgt: \n" + pizza1);
                    //kasse.getOrdrer().add(pizza1);
                    //return pizza1.getPris();
                    //break;


                case 2:
                    System.out.println("Du har valgt: \n" + pizza2);
                    break;

                case 3:
                    System.out.println("Du har valgt: \n" + pizza3);
                    break;

                case 99:
                    System.out.println("Tak for bestillingen"); // exit program
                    run = false;
                    break;

            }
        }
        return 0;
    }
}
