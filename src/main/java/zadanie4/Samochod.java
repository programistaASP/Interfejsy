package zadanie4;

public class Samochod {
    private String marka, model, kolor;

    public Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka.toString() + '\'' +
                ", model='" + model.toString() + '\'' +
                ", kolor='" + kolor.toString() + '\'' +
                '}';
    }

    public void zmienKolor(String kolor) {
        this.kolor = kolor;
    }

}
