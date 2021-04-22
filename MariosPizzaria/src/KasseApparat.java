import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KasseApparat {

  private Menu menu = new Menu();
  private String navn;
  private int pris;
  private int antal;
  private int subTotal;
  private int total;
  private final LocalDateTime salgsTidspunkt = LocalDateTime.now();
  private ArrayList<Pizza> pizzaListe = new ArrayList<>();

  public void init() {
    menu.udskrivMenu();
  }

  Pizza pizza = new Pizza(1, 50, "Hawaii", "ananas mm.");

  public ArrayList<Pizza> getPizzaListe() {
    return pizzaListe;
  }

  public void lavPizza(int nummer, int pris, String navn, String ingredienser) {
    Pizza pizza = new Pizza(nummer, pris, navn, ingredienser);
    pizzaListe.add(pizza);
  }

  /*public int subTotal() {
    int subTotal = pizza.getPris() * antal;
    return subTotal();
  }*/

  public int totalPris() {
    int subTotal = 0;
    for (int i = 0; i < pizzaListe.size(); i++) {
      subTotal += pizzaListe.get(i).getPris();
    }
    return total;
  }

 /* public void udskrivKvittering() {
    System.out.println(salgsTidspunkt);
    for (int i = 0; i < pizzaListe.size(); i++) {
      System.out.println(pizzaListe.get(i));
    }
  }*/

  @Override
  public String toString() {
    return "Kvittering\n" +
        "Antal pizzaer: " + pizzaListe.size() +
        "\nPris: " + total +
        "kr." +
        "\nSalgstidspunkt: " + salgsTidspunkt;
  }

  public void pizzaValg() {

    Scanner scan = new Scanner(System.in);
    boolean run = true;

    while(run == true) {
      System.out.println("\nAlfonso indtaster ordre her: ");
      int valg = scan.nextInt();
      scan.nextLine(); //Scanner bug

      System.out.println("Du har valgt: \n" + menu.getPizza(valg));
      Pizza pizza = menu.getPizza(valg);
      pizzaListe.add(pizza);


    }
  }
}