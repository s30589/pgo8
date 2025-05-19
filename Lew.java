public class Lew extends Zwierze {
    private boolean miesozerny;

    public Lew(String nazwa, int wiek, boolean miesozerny) {
        super(nazwa, wiek);
        this.miesozerny = miesozerny;
    }

    public boolean isMiesozerny() {
        return miesozerny;
    }

    public void ryczy() {
        System.out.println("Lew ryczy głośno!");
    }

    @Override
    public String wydajDzwiek() {
        return "Roooar!";
    }

    @Override
    public String poruszajSie() {
        return "Biega po sawannie.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna i lasy Afryki.";
    }
}