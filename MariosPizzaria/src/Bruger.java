import java.util.ArrayList;
import java.util.Scanner;

public class Bruger {
    Scanner input = new Scanner(System.in);
    public void callerOrWalker(){
        System.out.println("Are the customer ringing in or walking in?: ");
        input.nextInt();
        if (input.nextInt()==1){
            //customerRingingIn
            System.out.println("What are your name?");
            String name = input.next();
            chooseOrder();
        } else if (input.nextInt()==2) {
           chooseOrder();
        }
    }
    public void chooseOrder(){
        // dette er bare en midlertidig menu, skal lige se hvad Jeppe og Kristian har lavet før den kan færdiggøres.
        String [] menuItems = new String[4];
        menuItems[0] = "1. Show menu"; // hvis Alphonso er dement
        menuItems[1] = "2. Create order";
        menuItems[2] = "3. Display order";
        menuItems[3] = "4. Delete order";
        menuItems[4] = "5. Show Statistics";
        menuItems[5] = "9. Close program";
        // Menu myMenu = new Menu("Menu","Choose option:", menuItems);
        // ArrayList<Menu> menus = new ArrayList<>();

        int choice;
        boolean valid;
        do {
            //print menuen
            //choice = menu.readChoice();
            valid = true;
            switch (choice){
                case 1:
                    System.out.println();
                    //
                    break;
                case 2:
                    System.out.println("Choose order");
                    input.nextInt();
                    //
                    break;
                case 3:
                    //skal vise sammenlagt hvad det er blevet, men ikke sende den til Mario, så kunden kan vurdere
                    // om hvorvidt de har købt for meget eller om de skal have mere
                    break;
                case 4:
                    //remove(input)
                case 5:
                    //statistik, hvis vi får tid.
                case 9:
                    System.out.println("Bye");
                    break;

            }
        }while (!valid||!(choice==9));


    }
}
