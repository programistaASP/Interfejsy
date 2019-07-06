package zadanie;

public class Main {
    public static void main(String[] args) {
        Pokarm banan = new Pokarm("Banan", TypPokarmu.OWOCE, 23);
        Pokarm kurczak = new Pokarm("Kurczak", TypPokarmu.MIESO, 4);
        Pokarm ser = new Pokarm("Ser", TypPokarmu.SERY, 2);
        Pokarm pomidor= new Pokarm("Pomidor", TypPokarmu.WARZYWA, 1);

        Programista tester = new Programista();
        tester.jedz(banan);
        

    }
}
