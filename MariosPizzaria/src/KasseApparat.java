import java.time.LocalDateTime;
import java.util.ArrayList;

public class KasseApparat {

  private String navn;
  private int pris;
  private int antal;
  private int subTotal;
  private int total;
  private final LocalDateTime salgsTidspunkt = LocalDateTime.now();
  private ArrayList<Pizza> pizzaListe = new ArrayList<>();


  Pizza pizza = new Pizza(1, 50, "Hawaii", "ananas mm.");

  public ArrayList<Pizza> getPizzaListe() {
    return pizzaListe;
  }

  public void lavPizza(int nummer, int pris, String navn, String ingredienser) {
    Pizza pizza = new Pizza(nummer, pris, navn, ingredienser);
    pizzaListe.add(pizza);
  }

  /*public int subTotal() {
    int subTotal = pizza.getPris();
    return subTotal();
  }*/

  public int totalPris() {
    int subTotal = 0;
    for (int i = 0; i < pizzaListe.size(); i++) { //vil gerne ind i ArrayListen og hente prisen for hver pizza i det i et loop
      subTotal += pizzaListe.get(i).getPris(); //pizzaListe.getPris(i)
    }
    return total;
  }

  /*public void udskrivKvittering() {
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
        " kr." +
        "\nSalgstidspunkt: " + salgsTidspunkt;

  }
}
