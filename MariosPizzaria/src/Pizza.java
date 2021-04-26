public class Pizza {
    private int nummer;
    private String navn;
    private int pris;
    private String ingredienser;


    public Pizza(int nummer, int pris, String navn, String ingredienser) {
        this.nummer = nummer;
        this.navn = navn;
        this.pris = pris;
        this.ingredienser = ingredienser;
    }

    public int getNummer() {
        return nummer;
    }

    public int getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setIngredienser(String ingredienser) {
        this.ingredienser = ingredienser;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "Nr. " + nummer +
                ", " + navn +
                ": " + ingredienser;
    }
}
