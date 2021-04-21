import java.util.ArrayList;
import java.util.Scanner;

    public class Ordrer {
        int gaaende= 0;
        int ringende= 0;
        String name;
        Scanner input = new Scanner(System.in);
        ArrayList<Ordrer> ordre = new ArrayList<>();
        Menu menu = new Menu();
        KasseApparat kasseApparat = new KasseApparat();
        public Ordrer() {
            this.ringende = ringende;
            this.name = name;
            this.menu = menu;
        }
        // det kan godt være nedestående metode skal over hos kunde + den vil have at den skal return null
        // i Menu, jeg tør ikke pille ved det før vi har snakket sammen.
        public void ordre() {
            int choice;
            boolean valid;
            System.out.println("Are the customer ringing in or walking in? Press 1 for calling, 2 for walking ");
            do {

                valid = true;
                switch (choice) {
                    case 1:
                        ringende++;
                        System.out.println("What are your name?");
                        name = input.nextLine();
                        System.out.println("Hvad skal du have at spise?");
                        menu.pizzaValg();
//                        ordre.add(menu.pizzaValg());
                        // Ideen er, at den gemmer ordrerne i en txt fil, så man kan lave statistik, samme i linje 41
                        //myWriter.Write(ordre.toString());
                        break;
                    case 2:
                        gaaende++;
                        System.out.println("Hvad skal du have at spise?");
                        menu.pizzaValg();
//                        ordre.add(menu.pizzaValg());
//                        ordre.add(gaaende);
// hvis der er nogen der har en løsning til at add hvor mange der har gået eller ringet til pizzariaet
                        //myWriter.Write(ordre.toString());
                        break;
                }
            }while (!valid);
        }
    }

}
