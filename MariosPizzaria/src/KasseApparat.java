import java.time.LocalDateTime;
import java.util.ArrayList;

public class KasseApparat {

  /*private String navn;
  private int pris;*/
  private int antal;
  private final LocalDateTime salgsTidspunkt = LocalDateTime.now();
  private ArrayList<Ordrer> ordrer = new ArrayList<>();
  
  public ArrayList<Ordrer> getOrdrer() {
    return ordrer;
  }
  
  public void lavPizza(int antal, Ordrer ordrer) {
    Ordrer ordrer = new Ordrer(antal, ordrer);
    ordrer.add(ordrer);
  }

  public int subTotal() { //skal ind i Ordrer at ligge + have pris-attribut + getter til pris-attribut
    int subTotal = ordrer.getPris() * antal;
    return subTotal();
  }
  
  public int totalPris() {
    int total = 0;
    for (int i = 0; i < ordrer.size(); i++) {
      total += ordrer.get(i).subTotal();
    }
    return total;
  }

  public void udskrivKvittering() {
    System.out.println(salgsTidspunkt);
    for (int i = 0; i < ordrer.size(); i++) {
      System.out.println(ordrer.get(i));

    }
  }

  @Override
  public String toString() {
    return "Kvittering\n" +
        "Antal pizzaer: " + antal +
        "\nSalgstidspunkt: " + salgsTidspunkt +
        ", solgtePizzaer=" + ordrer;
  }
}
