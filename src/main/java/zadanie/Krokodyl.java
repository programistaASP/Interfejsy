package zadanie;

public class Krokodyl implements Jedzący {
    public void jedz(Pokarm pokarm) {
        pokarm.getNazwa();
        pokarm.getPokarm();
        pokarm.getWaga();
    }

    public int ilePosilkowZjedzone() {
        return 0;
    }

    public double ileGramowZjedzone() {
        return 0;
    }
}
