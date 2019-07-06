import zadanie4.BMW;
import zadanie4.Garaz;
import zadanie4.Porsche;
import zadanie4.Samochod;


public class Main {
    public static void main(String[] args) {
        BMW X4 = new BMW("X4", "czarne");
        Porsche macan = new Porsche("Macan", "Białe");
        X4.zmienKolor("Różowe");
        System.out.println(X4);
        Garaz<Samochod> garazDlaSamochodow = new Garaz<Samochod>(macan, X4);
        garazDlaSamochodow.zaparkuj(macan);
        System.out.println(garazDlaSamochodow);
    }
}
