import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Ordrebehandling ordrebehandling = new Ordrebehandling();
        SystemStart systemStart = new SystemStart();

        systemStart.startMenu(); //bør være den eneste vi kalder til sidst



        /*ordrebehandling.init(); //udskriver menuen
        ordrebehandling.pizzaValg();
        System.out.println(ordrebehandling);*/
    }
}