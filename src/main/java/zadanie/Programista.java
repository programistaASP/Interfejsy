package zadanie;

public class Programista implements Jedzący{
    private int liczbaPosiłkówZjedzonych;
    private double liczbaGramowZjedzonych;

    public void jedz(Pokarm pokarm) {
        liczbaPosiłkówZjedzonych++;
        liczbaGramowZjedzonych+= pokarm.Waga;
    }

    public int ilePosilkowZjedzone() {
        return liczbaPosiłkówZjedzonych;
    }

    public double ileGramowZjedzone() {
        return liczbaGramowZjedzonych;
    }
}
