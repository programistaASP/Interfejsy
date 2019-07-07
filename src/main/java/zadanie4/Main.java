package zadanie4;

public class Main {
    public static void main(String[] args) {
        BMW X4 = new BMW("X4", "czarne");
        Porsche macan = new Porsche("Macan", "Białe");
        X4.zmienKolor("Różowe");
        System.out.println(X4);
        Garaz<Samochod> garazDlaSamochodow = new Garaz<Samochod>(macan, X4);
        garazDlaSamochodow.wyprowadz(X4);
        garazDlaSamochodow.wyprowadz(macan);
        System.out.println(garazDlaSamochodow);
    }
}
