import java.time.LocalDateTime;
import java.util.ArrayList;

public class KasseApparat {

  /*private String navn;
  private int pris;*/
  private int antal;
  private final LocalDateTime salgsTidspunkt = LocalDateTime.now();
  private ArrayList<Pizza> pizzaListe = new ArrayList<>();

  Pizza pizza = new Pizza(1, 50, "Hawaii", "ananas mm.");
  
  /*public ArrayList<Pizza> getPizza() {
    return pizzaListe;
  }*/
  
  public void lavPizza(int nummer, int pris, String navn, String ingredienser) {
    Pizza pizza = new Pizza(nummer, pris, navn, ingredienser);
    pizzaListe.add(pizza);
  }

  public int subTotal() {
    int subTotal = pizza.getPris() * antal;
    return subTotal();
  }
  
  public int totalPris() {
    int total = 0;
    for (int i = 0; i < pizzaListe.size(); i++) {
      total += subTotal();
    }
    return total;
  }

  public void udskrivKvittering() {
    System.out.println(salgsTidspunkt);
    for (int i = 0; i < pizzaListe.size(); i++) {
      System.out.println(pizzaListe.get(i));

    }
  }

  @Override
  public String toString() {
    return "Kvittering\n" +
        "Antal pizzaer: " + antal +
        "\nSalgstidspunkt: " + salgsTidspunkt +
        ", solgtePizzaer=" + pizzaListe;
  }
}
