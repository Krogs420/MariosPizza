import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordre {
    static int ordreCount = 0;

    int gaaende = 0;
    int ringende = 0;
    int ordrerNummer = 0;
    private LocalDateTime leveringsTidspunkt;
    Scanner input = new Scanner(System.in);
    //ArrayList<Ordre> ordreListe = new ArrayList<>();

    Ordrebehandling ordrebehandling = new Ordrebehandling();
    ArrayList<Pizza> valgtePizzaer = new ArrayList<>();
    // Var det den vi kaldte fil? I så fald ændrer til fil.txt
    //FileWriter myWriter = new FileWriter("Friendlist.txt");

    File displayOrdreMario = new File("Mariotext.txt");
    PrintStream marioListe = new PrintStream(new FileOutputStream("src/Mariotext.txt", true));
    ArrayList mariosOrdrer = new ArrayList();

    public Ordre(int ordrerNummer, ArrayList<Pizza> valgtePizzaer) throws FileNotFoundException {
        this.ordrerNummer = ordrerNummer;
        this.valgtePizzaer = valgtePizzaer;
    }
    public Ordre(int ordrerNummer, ArrayList<Pizza> valgtePizzaer, boolean gaaende) throws FileNotFoundException {
        this.ordrerNummer = ordrerNummer;
        this.valgtePizzaer = valgtePizzaer;
        if (gaaende = true) {
            LocalDateTime leveringsTidspunkt1 = LocalDateTime.now(); //kan ikke ændre dato/tid
            leveringsTidspunkt = leveringsTidspunkt1.plusMinutes(10); //derfor vi lægger 10 til her
        }
    }


    public void lavOrdre() throws FileNotFoundException {


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
                opretOrdre(true);
                //myWriter.write(ringende);
               // myWriter.write(ordreListe.toString());
               // mywriter.close();
                break;
            case 2:
                gaaende++;
                opretOrdre(false);
               // myWriter.write(gaaende);
                // myWriter.write(ordreListe.toString());
                //mywriter.close();
                break;
            }
    }

    public void opretOrdre(boolean ringende) throws FileNotFoundException {
        ordreCount++;
        ArrayList<Pizza> gaaendePizzaer = ordrebehandling.pizzaValg();
        Ordre ordre = new Ordre(ordreCount, gaaendePizzaer, ringende); //Ordre ordre2 = new Ordre(ordrerNummer, gaaendePizzaer);
        System.out.println("Ordrenummer: " + ordre.ordrerNummer);

        //ordreListe.add(ordre2);
        OrdreListeMario();

        SystemStart.ordreListe.add(ordre);
    }

/*    public void sletOrdre(){
        // er lidt i tvivl om det virker
        ordreListe.equals(input.nextInt());
    }*/

    public void OrdreListeMario() throws FileNotFoundException {

        marioListe.println("Ordre NR: " + (ordrerNummer -1));

        marioListe.println("\nHej Mario\nDer er kommet en nye ordre og du skal lave disse pizzaer:\n");
        for (int i = 0; i < ordrebehandling.getPizzaListe().size(); i++) {
            marioListe.println(ordrebehandling.getPizzaListe().get(i).toString().replace("[", "").replace("]", ""));

        }
        marioListe.println("\nOrdren blev modtaget: " + ordrebehandling.getSalgsTidspunkt());

        marioListe.println("\nRåb til Alfonso, når ordren er lavet\n\n");
        marioListe.println("======================================================================================================================");

    }




}


