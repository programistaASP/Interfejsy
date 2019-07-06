package zadanie;

public class Pokarm {
    public String nazwa;
    private TypPokarmu Pokarm;
    public double Waga;

    public Pokarm(String nazwa, TypPokarmu pokarm, int waga) {
        this.nazwa = nazwa;
        Pokarm = pokarm;
        Waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public TypPokarmu getPokarm() {
        return Pokarm;
    }

    public double getWaga() {
        return Waga;
    }


}
