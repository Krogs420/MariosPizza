import java.util.ArrayList;
import java.util.Scanner;

public class Ordrer {
    int gaaende = 0;
    int ringende = 0;
    String navn;
    String bestillingsMetode;
    int ordrerNummer = 0;
    Scanner input = new Scanner(System.in);
    ArrayList<Ordrer> ordrerListe = new ArrayList<>();

    KasseApparat kasseApparat = new KasseApparat();
    ArrayList<Pizza> valgtePizzaer = new ArrayList<>();

    public Ordrer(String bestillingsMetode, String navn, int ordrerNummer, ArrayList<Pizza> valgtePizzaer) {
        this.bestillingsMetode = bestillingsMetode;
        this.navn = navn;
        this.ordrerNummer = ordrerNummer;
        this.valgtePizzaer = valgtePizzaer;
    }

    public void ordre() {

        int choice;
        choice = input.nextInt();

        System.out.println("Ringer kunden ind eller kommer kunden ind fra gaden? Tryk 1 for ringende, 2 for gående");

        switch (choice) {
            case 1:
                ordrerNummer++;
                ringende++;
                System.out.println("Hvad er dit navn?");
                navn = input.nextLine();
                System.out.println("Hvad skal du have at spise?");
                ArrayList<Pizza> telefonPizzaer =  kasseApparat.pizzaValg();
                Ordrer ordrer = new Ordrer("Ringede",navn,ordrerNummer,telefonPizzaer);
                ordrerListe.add(ordrer);
                break;
            case 2:
                ordrerNummer++;
                gaaende++;
                System.out.println("Hvad skal du have at spise?");
                ArrayList<Pizza> gaaendePizzaer =  kasseApparat.pizzaValg();
                Ordrer ordrer2 = new Ordrer("Gående",navn,ordrerNummer,gaaendePizzaer);
                ordrerListe.add(ordrer2);
                break;
        }
    }
    }


