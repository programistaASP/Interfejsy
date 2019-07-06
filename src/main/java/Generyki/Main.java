package Generyki;

import equalsHascode.Czlowiek;

public class Main {
    public static void main(String[] args) {
        Czlowiek czlowiek = new Czlowiek("Jan", "Alfons", 23);
        Czlowiek czlowiek1 = new Czlowiek("Bogna", "Pogna", 33);
        Para<Czlowiek> paraLudzi = new Para<Czlowiek>(czlowiek, czlowiek1);
        System.out.println(paraLudzi.toString());
    }
}
