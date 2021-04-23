import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordrebehandling {

  private Menu menu = new Menu();
  private int subTotal;
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

  public LocalDateTime getSalgsTidspunkt() {
    return salgsTidspunkt;
  }

  public int totalPris() {
    int subTotal = 0;
    for (int i = 0; i < pizzaListe.size(); i++) {
      subTotal += pizzaListe.get(i).getPris(); //subtotal = subtotal + getPris
    }
    //this.subTotal = subTotal;
    return subTotal;
  }

  @Override
  public String toString() {
    return "Kvittering\n" +
        "Antal pizzaer: " + pizzaListe.size() +
        "\nPris: " + subTotal +
        "kr." +
        "\nSalgstidspunkt: " + salgsTidspunkt;
  }

  public ArrayList<Pizza> pizzaValg() {

    Scanner scan = new Scanner(System.in);

    System.out.println("Hvor mange pizzaer vil du bestille?");
    while (!scan.hasNextInt()) {
      System.out.print("Indtast gyldigt tal: ");
      scan.nextLine();
    }
    int antalPizza = scan.nextInt();


    for (int i = 0; i < antalPizza; i++) {
      System.out.println("\nAlfonso indtaster ordre her: ");

      while (!scan.hasNextInt()) {
        System.out.print("Indtast gyldigt valg, 1-30. Prøv igen: "); //udskriver den her 2 gange, hvorfor?
        scan.nextLine();
      }
      int valg = scan.nextInt(); //problem med at tilføje valget her til pizzaListe

      if (valg < 1 || valg > 30) {
        System.out.println("Indtast gyldigt valg, 1-30. Prøv igen: ");
        pizzaValg();
      } else {

        System.out.println("Du har valgt: \n" + menu.getPizza(valg));
        Pizza pizza = menu.getPizza(valg);
        pizzaListe.add(pizza);
      }
      }

    //pizzaListe udskrives til fil her

    this.subTotal = totalPris();
    System.out.println(toString());
    return null;
  }
}