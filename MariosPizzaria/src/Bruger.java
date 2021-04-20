import java.util.ArrayList;
import java.util.Scanner;

public class Bruger {
    Scanner input = new Scanner(System.in);
    public void chooseOrder(){
        // dette er bare en midlertidig menu, skal lige se hvad Jeppe og Kristian har lavet før den kan færdiggøres.
        String [] menuItems = new String[6];
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
                    //System.out.println(menu);

                    break;
                case 2:
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
                    System.out.println("Choose order");
                    input.nextInt();
                    //Order order = new Order(input.nextInt());
                    //order.add(order);
                    break;
                case 3:
                    //boolean ans = order.isEmpty();
                    //if (ans == true)
                    // sout("You don't have any orders);
                    //else
                    //sout(order);
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
                    System.out.println("Bye");
                    break;
                default:
                    valid = false;
                    System.out.println("Your choice is not valid.");
            }
        }while (!valid||!(choice==9));
    }
}
