package zadanie5;

public class Main {
    public static void main(String[] args) {
        MojaLista element1 = new MojaLista(10);


        System.out.println(element1.dodaj(10));
        System.out.println(element1.zawiera(10));
        System.out.println(element1.porownanie(10));
        System.out.println(element1.rozmiar());
        System.out.println(element1.iloscElementow());

    }
}
