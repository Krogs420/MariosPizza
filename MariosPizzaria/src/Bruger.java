import java.util.ArrayList;
import java.util.Scanner;

public class Bruger {
    Scanner input = new Scanner(System.in);
    public void chooseOrder(){
        // dette er bare en midlertidig menu, skal lige se hvad Jeppe og Kristian har lavet før den kan færdiggøres.
        String [] menuItems = new String[6];
        menuItems[0] = "1. Vis menu";
        menuItems[1] = "2. Lav order";
        menuItems[2] = "3. Vis order";
        menuItems[3] = "4. Slet order";
        menuItems[4] = "5. Vis statistik";
        menuItems[5] = "9. Luk programmet";
        MySwitchMenu mySwitchMenu = new MySwitchMenu("Menu","Vælg et punkt: ", menuItems);
        Menu menu = new Menu();
        //Ordrer lavOrdrer = new Ordrer();
        /*
        int choice;
        boolean valid;
        do {
         choice = input.nextInt();
         choice = mySwitchMenu.readChoice();
                  valid = true;
           switch (choice){
                case 1:
                    menu.udskrivMenu();
                    break;
                case 2:
                   lavOrdrer.ordre();
                    break;
                case 3:
                    boolean ans = lavOrdrer.ordre.isEmpty();
                    if (ans == true)
                        System.out.println("Du har ingen ordrer");
                    else
                        System.out.println(lavOrdrer.ordre);
                    break;
                case 4:
                    //boolean ans= order.isEmpty();
                    //if (ans == true)
                    // sout("You don't have any orders)
                    //else
                    //sout("Which order do you want to remove?")
                    //if (order.equals(input)){
                    //order.remove(input);
                    //}
                    break;
                case 5:
                    //statistik, hvis vi får tid.
                case 9:
                    System.out.println("Farvel");
                    break;
                default:
                    valid = false;
                    System.out.println("Dit valg er ikke gyldigt, prøv igen.");
            }
        }while (!valid||!(choice==9));
*/

    }
}
