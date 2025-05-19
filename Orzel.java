public class Orzel extends Zwierze {
    private double rozpietoscSkrzydel;

    public Orzel(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    public double getRozpietoscSkrzydel() {
        return rozpietoscSkrzydel;
    }

    public void szybuj() {
        System.out.println("Orzeł szybując obserwuje teren z góry.");
    }

    @Override
    public String wydajDzwiek() {
        return "Skrzeczy donośnie.";
    }

    @Override
    public String poruszajSie() {
        return "Lata wysoko nad górami.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i lasy.";
    }
}