import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Pizza> menuKort = new ArrayList();

    KasseApparat kasse = new KasseApparat();

    Pizza pizza1 = new Pizza(1, 57, "Vesuvio", "Tomat, Ost, Origano, Skinke                                    ");
    Pizza pizza2 = new Pizza(2, 53, "Amerikaner", "Tomat, Ost, Oksefars, Oregano                               ");
    Pizza pizza3 = new Pizza(3, 57, "Cacciatore", "Tomat, Ost, Pepperoni, Oregano                              ");
    Pizza pizza4 = new Pizza(4, 63, "Carbona", "Tomat, Ost, Kødsovs, Spagetti, Pølser, Oregano                 ");
    Pizza pizza5 = new Pizza(5, 65, "Dennis", "Tomat, Ost, Skinke, Pepperoni, Pølser, Oregano                  ");
    Pizza pizza6 = new Pizza(6, 57, "Bertil", "Tomat, Ost, Skinke, Bacon, Oregano                              ");
    Pizza pizza7 = new Pizza(7, 61, "Silvia", "Tomat, Ost, Pepperoni, Rød peber, Løg, Oliven, Oregano          ");
    Pizza pizza8 = new Pizza(8, 61, "Victoria", "Tomat, Ost, Skinke, Ananas, Champignon, Løg, Oregano          ");
    Pizza pizza9 = new Pizza(9, 61, "Toronfo", "Tomat, Ost, Skinke, Bacon, Kebab, Chili, Oregano               ");
    Pizza pizza10 = new Pizza(10, 61, "Capricciosa", "Tomat, Ost, Skinke, Champignon, Oregano                   ");
    Pizza pizza11 = new Pizza(11, 61, "Hawaii", "Tomat, Ost, Skinke, Ananas, Oregano                            ");
    Pizza pizza12 = new Pizza(12, 61, "Le Blissola", "Tomat, Ost, Skinke, Rejer, Oregano                        ");
    Pizza pizza13 = new Pizza(13, 61, "Venezia", "Tomat, Ost, Skinke, Bacon, Oregano                            ");
    Pizza pizza14 = new Pizza(14, 61, "Mafia", "Tomat, Ost, Pepperoni, Bacon, Løg, Oregano                      ");
    Pizza pizza15 = new Pizza(15, 63, "Browser", "Tomat, Ost, Kødboller, Chili, Jalapenos, Oregano              ");
    Pizza pizza16 = new Pizza(16, 67, "Luigi", "Tomat, Ost, Kylling, Pesto, Oregano                             ");
    Pizza pizza17 = new Pizza(17, 63, "Yoshi", "Tomat, Ost, Kødsovs, Løg, Oregano                               ");
    Pizza pizza18 = new Pizza(18, 57, "Mario", "Tomat, Ost, Oregano                                             ");
    Pizza pizza19 = new Pizza(19, 57, "Peach", "Tomat, Ost, Ananas, Løg, Pesto, Oregano                         ");
    Pizza pizza20 = new Pizza(20, 57, "Daisy", "Tomat, Ost, Kødstrimler, Grøn Peber, Oregano                    ");
    Pizza pizza21 = new Pizza(21, 63, "Mirage", "Tomat, Ost, Salat, Kebab, Tomat, Dressing, Oregano             ");
    Pizza pizza22 = new Pizza(22, 63, "Vertigo", "Tomat, Ost, Rucola, Kebab, Pesto, Oregano                     ");
    Pizza pizza23 = new Pizza(23, 63, "Inferno", "Tomat, Ost, Jalapeno, 2 Slags Chili, Kylling, Oregano         ");
    Pizza pizza24 = new Pizza(24, 63, "Overpass", "Tomat, Ost, Gorgonzola, Parmaskinke, Rucola, Pesto, Oregano  ");
    Pizza pizza25 = new Pizza(25, 67, "Cache", "Tomat, Ost, Kødstrimler, Champignon, Gorgonzola, Oregano        ");
    Pizza pizza26 = new Pizza(26, 67, "Vegetar", "Tomat, Ost, Paprika, Løg, Ananas, Champignon, Oliven, Oregano ");
    Pizza pizza27 = new Pizza(27, 65, "Train", "Tomat, Ost, Tomat, Kylling, Pesto, Oregano                      ");
    Pizza pizza28 = new Pizza(28, 65, "Han Solo", "Tomat, Ost, Skinke, Kebab, Bearnaise, Oregano                ");
    Pizza pizza29 = new Pizza(29, 65, "Yoda", "Tomat, Ost, Skinke, Bacon, Æg, Oregano                           ");
    Pizza pizza30 = new Pizza(30, 61, "Mando", "Tomat, Ost, Pepperoni, Løg, Dressing, Oregano                   ");

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
        menuKort.add(pizza6);
        menuKort.add(pizza7);
        menuKort.add(pizza8);
        menuKort.add(pizza9);
        menuKort.add(pizza10);
        menuKort.add(pizza11);
        menuKort.add(pizza12);
        menuKort.add(pizza13);
        menuKort.add(pizza14);
        menuKort.add(pizza15);
        menuKort.add(pizza16);
        menuKort.add(pizza17);
        menuKort.add(pizza18);
        menuKort.add(pizza19);
        menuKort.add(pizza20);
        menuKort.add(pizza21);
        menuKort.add(pizza22);
        menuKort.add(pizza23);
        menuKort.add(pizza24);
        menuKort.add(pizza25);
        menuKort.add(pizza26);
        menuKort.add(pizza27);
        menuKort.add(pizza28);
        menuKort.add(pizza29);
        menuKort.add(pizza30);
    }

    public ArrayList<Pizza> pizzaValg() {
        ArrayList<Pizza> valgtePizzaer = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run == true) {
            System.out.println("\nAlfonso indtaster ordre her: ");
            int valg = scan.nextInt();
            scan.nextLine(); //Scanner bug

            switch (valg) {


                case 1:
                    System.out.println("Du har valgt: \n" + pizza1);
                    kasse.getPizzaListe().add(pizza1);
                    valgtePizzaer.add(pizza1);
                    break;

                case 2:
                    System.out.println("Du har valgt: \n" + pizza2);
                    kasse.getPizzaListe().add(pizza2);
                    valgtePizzaer.add(pizza2);
                    break;

                case 3:
                    System.out.println("Du har valgt: \n" + pizza3);
                    kasse.getPizzaListe().add(pizza3);
                    valgtePizzaer.add(pizza3);
                    break;

                case 4:
                    System.out.println("Du har valgt: \n" + pizza4);
                    kasse.getPizzaListe().add(pizza4);
                    valgtePizzaer.add(pizza4);
                    break;

                case 5:
                    System.out.println("Du har valgt: \n" + pizza5);
                    kasse.getPizzaListe().add(pizza5);
                    valgtePizzaer.add(pizza5);
                    break;

                case 6:
                    System.out.println("Du har valgt: \n" + pizza6);
                    kasse.getPizzaListe().add(pizza6);
                    valgtePizzaer.add(pizza6);
                    break;

                case 7:
                    System.out.println("Du har valgt: \n" + pizza7);
                    kasse.getPizzaListe().add(pizza7);
                    valgtePizzaer.add(pizza7);
                    break;

                case 8:
                    System.out.println("Du har valgt: \n" + pizza8);
                    kasse.getPizzaListe().add(pizza8);
                    valgtePizzaer.add(pizza8);
                    break;

                case 9:
                    System.out.println("Du har valgt: \n" + pizza9);
                    kasse.getPizzaListe().add(pizza9);
                    valgtePizzaer.add(pizza9);
                    break;

                case 10:
                    System.out.println("Du har valgt: \n" + pizza10);
                    kasse.getPizzaListe().add(pizza10);
                    valgtePizzaer.add(pizza10);
                    break;

                case 11:
                    System.out.println("Du har valgt: \n" + pizza11);
                    kasse.getPizzaListe().add(pizza11);
                    valgtePizzaer.add(pizza11);
                    break;

                case 12:
                    System.out.println("Du har valgt: \n" + pizza12);
                    kasse.getPizzaListe().add(pizza12);
                    valgtePizzaer.add(pizza12);
                    break;

                case 13:
                    System.out.println("Du har valgt: \n" + pizza13);
                    kasse.getPizzaListe().add(pizza13);
                    valgtePizzaer.add(pizza13);
                    break;

                case 14:
                    System.out.println("Du har valgt: \n" + pizza14);
                    kasse.getPizzaListe().add(pizza14);
                    valgtePizzaer.add(pizza14);
                    break;

                case 15:
                    System.out.println("Du har valgt: \n" + pizza15);
                    kasse.getPizzaListe().add(pizza15);
                    valgtePizzaer.add(pizza15);
                    break;

                case 16:
                    System.out.println("Du har valgt: \n" + pizza16);
                    kasse.getPizzaListe().add(pizza16);
                    valgtePizzaer.add(pizza16);
                    break;

                case 17:
                    System.out.println("Du har valgt: \n" + pizza17);
                    kasse.getPizzaListe().add(pizza17);
                    valgtePizzaer.add(pizza17);
                    break;

                case 18:
                    System.out.println("Du har valgt: \n" + pizza18);
                    kasse.getPizzaListe().add(pizza18);
                    valgtePizzaer.add(pizza18);
                    break;

                case 19:
                    System.out.println("Du har valgt: \n" + pizza19);
                    kasse.getPizzaListe().add(pizza19);
                    valgtePizzaer.add(pizza19);
                    break;

                case 20:
                    System.out.println("Du har valgt: \n" + pizza20);
                    kasse.getPizzaListe().add(pizza20);
                    valgtePizzaer.add(pizza20);
                    break;

                case 21:
                    System.out.println("Du har valgt: \n" + pizza21);
                    kasse.getPizzaListe().add(pizza21);
                    valgtePizzaer.add(pizza21);
                    break;

                case 22:
                    System.out.println("Du har valgt: \n" + pizza22);
                    kasse.getPizzaListe().add(pizza22);
                    valgtePizzaer.add(pizza22);
                    break;

                case 23:
                    System.out.println("Du har valgt: \n" + pizza23);
                    kasse.getPizzaListe().add(pizza23);
                    valgtePizzaer.add(pizza23);
                    break;

                case 24:
                    System.out.println("Du har valgt: \n" + pizza24);
                    kasse.getPizzaListe().add(pizza24);
                    valgtePizzaer.add(pizza24);
                    break;

                case 25:
                    System.out.println("Du har valgt: \n" + pizza25);
                    kasse.getPizzaListe().add(pizza25);
                    valgtePizzaer.add(pizza25);
                    break;

                case 26:
                    System.out.println("Du har valgt: \n" + pizza26);
                    kasse.getPizzaListe().add(pizza26);
                    valgtePizzaer.add(pizza26);
                    break;

                case 27:
                    System.out.println("Du har valgt: \n" + pizza27);
                    kasse.getPizzaListe().add(pizza27);
                    valgtePizzaer.add(pizza27);
                    break;

                case 28:
                    System.out.println("Du har valgt: \n" + pizza28);
                    kasse.getPizzaListe().add(pizza28);
                    valgtePizzaer.add(pizza28);
                    break;

                case 29:
                    System.out.println("Du har valgt: \n" + pizza29);
                    kasse.getPizzaListe().add(pizza29);
                    valgtePizzaer.add(pizza29);
                    break;

                case 30:
                    System.out.println("Du har valgt: \n" + pizza30);
                    kasse.getPizzaListe().add(pizza30);
                    valgtePizzaer.add(pizza30);
                    break;


                case 99:
                    System.out.println("Tak for bestillingen"); // exit program
                    run = false;
                    break;

            }
            System.out.println(kasse.getPizzaListe()); // Dette er blot en test på, at der blir added til ArrayListen.
        }
        return valgtePizzaer;
    }
}