import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemStart {
    Scanner input = new Scanner(System.in);
    public static ArrayList<Ordre> ordreListe = new ArrayList<>();

    public void startMenu() throws FileNotFoundException {

        String [] menuItems = new String[6];
        menuItems[0] = "1. Vis menu";
        menuItems[1] = "2. Lav order";
        menuItems[2] = "3. Vis order";
        menuItems[3] = "4. Slet order";
        menuItems[4] = "5. Vis statistik";
        menuItems[5] = "9. Luk programmet";

        BrugerDialog brugerDialog = new BrugerDialog("Menu","Vælg et punkt: ", menuItems);
        Menu menu = new Menu();
        Ordre ordre;
        Ordrebehandling ordreBehandling = new Ordrebehandling();


        int choice;
        boolean valid;
        do {
         brugerDialog.printMenu();

         choice = brugerDialog.readChoice();
                  valid = true;
           switch (choice){
                case 1:
                    menu.udskrivMenu();
                    break;
                case 2:
                    ordre = new Ordre(1, new ArrayList<>());
                    ordre.lavOrdre();
                    break;
                case 3:
                    boolean svar = ordreListe.isEmpty();
                    if (svar == true)
                        System.out.println("Du har ingen ordrer.");
                    else
                        System.out.println("Disse ordrer venter på dig: \n"
                                + ordreListe.toString().replace("[", "").replace("]", ""));
                    break;
                case 4:
                    System.out.println("Hvilke ordre vil du fjerne?"); //skal teste den her metode
                    int sletOrdre = input.nextInt();
                    input.nextLine();
                    boolean ordreFindes = false;
                    for (int i = 0; i < ordreListe.size(); i++) {
                        Ordre ordre1 = ordreListe.get(i); // gemmer ordren
                        if(ordre1.ordrerNummer == sletOrdre) {
                          ordreListe.remove(i);
                          ordreFindes = true;
                          System.out.println("Ordren er blevet slettet.");
                          break;
                        }
                    }
                    if (!ordreFindes) {
                      System.out.println("Der er ingen ordre at fjerne");
                    }

                    break;
                case 5:
                    System.out.println("Her putter vi en fil med noget statistik, hvis vi får tid"); //IKKE FÆRDIG
                    //statistik, hvis vi får tid.
                case 9:
                    System.out.println("Farvel.");
                    break;
                default:
                    valid = false;
                    System.out.println("Dit valg er ikke gyldigt, prøv igen.");
            }
        }while (!valid||!(choice==9));

    }
}
