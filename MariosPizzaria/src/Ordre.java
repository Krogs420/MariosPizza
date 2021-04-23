import java.io.FileWriter;
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
    // Var det den vi kaldte fil? I så fald ændrer til fil.txt
    //FileWriter myWriter = new FileWriter("Friendlist.txt");

    public Ordre(int ordrerNummer, ArrayList<Pizza> valgtePizzaer) {
        this.ordrerNummer = ordrerNummer;
        this.valgtePizzaer = valgtePizzaer;
    }

    public void lavOrdre() {


        System.out.println("Ringer kunden ind eller kommer kunden ind fra gaden? Tryk 1 for ringende, 2 for gående");

        while (!input.hasNextInt()) {
            System.out.print("Indtast gyldigt tal (1 eller 2): ");
            input.nextLine();
        }

        int choice = input.nextInt();
        input.nextLine(); //scanner bug

        switch (choice) {
            case 1:
                ringende++;
                opretOrdre();
                //myWriter.write(ringende);
               // myWriter.write(ordreListe.toString());
               // mywriter.close();
                break;
            case 2:
                gaaende++;
                opretOrdre();
               // myWriter.write(gaaende);
                // myWriter.write(ordreListe.toString());
                //mywriter.close();
                break;
            }
    }

    public void opretOrdre() {
        ordrerNummer++;
        ArrayList<Pizza> gaaendePizzaer = ordrebehandling.pizzaValg();
        Ordre ordre2 = new Ordre(ordrerNummer, gaaendePizzaer);
        ordreListe.add(ordre2);
    }
    public void sletOrdre(){
        // er lidt i tvivl om det virker
        ordreListe.equals(input.nextInt());
    }
}


