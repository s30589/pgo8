public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Lew afrykański", 5, true);
        Zwierze orzel = new Orzel("Orzeł przedni", 3, 2.3);
        Zwierze waz = new Waz("Pyton królewski", 2, false);

        Zwierze[] zwierzeta = { lew, orzel, waz };

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Poruszanie się: " + z.poruszajSie());
            System.out.println("Środowisko naturalne: " + z.srodowiskoNaturalne());
            System.out.println("---");
        }
    }
}