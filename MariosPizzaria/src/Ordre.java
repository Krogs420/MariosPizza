import java.util.ArrayList;
import java.util.Scanner;

public class Ordre {
    int gaaende = 0;
    int ringende = 0;
    int ordrerNummer = 0;
    Scanner input = new Scanner(System.in);
    ArrayList<Ordre> ordreListe = new ArrayList<>();

    Ordrebehandling ordrebehandling = new Ordrebehandling();
    ArrayList<Pizza> valgtePizzaer = new ArrayList<>();

    public Ordre(int ordrerNummer, ArrayList<Pizza> valgtePizzaer) {
        this.ordrerNummer = ordrerNummer;
        this.valgtePizzaer = valgtePizzaer;
    }

    public void lavOrdre() {


        System.out.println("Ringer kunden ind eller kommer kunden ind fra gaden? Tryk 1 for ringende, 2 for gående");
        int choice = input.nextInt();
        input.nextLine(); //scanner bug

        switch (choice) {
            case 1:
                ringende++;
                opretOrdre();
                break;
            case 2:
                gaaende++;
                opretOrdre();
                break;
            }
    }

    public void opretOrdre() {
        ordrerNummer++;
        ArrayList<Pizza> gaaendePizzaer = ordrebehandling.pizzaValg();
        Ordre ordre2 = new Ordre(ordrerNummer, gaaendePizzaer);
        ordreListe.add(ordre2);
    }
}


