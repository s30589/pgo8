public class Waz extends Zwierze {
    private boolean jadowity;

    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    public boolean isJadowity() {
        return jadowity;
    }

    public void syczy() {
        System.out.println("Wąż syczy cicho, ale groźnie.");
    }

    @Override
    public String wydajDzwiek() {
        return "Ssssss!";
    }

    @Override
    public String poruszajSie() {
        return "Pełza cicho po ziemi.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungle, pustynie lub lasy tropikalne.";
    }
}