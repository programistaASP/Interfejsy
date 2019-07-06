package equalsHascode;

import java.util.Objects;

public class Czlowiek implements Comparable {
    private String imie, nazwisko;
    int wiek;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Czlowiek czlowiek = (Czlowiek) o;
        return getWiek() == czlowiek.getWiek() &&
                getImie().equals(czlowiek.getImie()) &&
                getNazwisko().equals(czlowiek.getNazwisko());
    }


    public Czlowiek(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;


    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public int compareTo(Object o) {
        Czlowiek that = (Czlowiek) o;
        if (this.getWiek() == that.getWiek()) {
            if (this.getNazwisko().compareTo(that.getNazwisko()) == 0) {
                return this.getImie().compareTo(that.getImie());
            }
        } else if (this.getWiek() < that.getWiek()) {
            return -1;
        } else {
            return 1;
        }

        return Integer.compare(this.getWiek(), that.getWiek());
    }
}
