package początek;

import początek.Czlowiek;
import początek.IConsume;

public class Main {
    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze();
        Czlowiek czlowiek = new Czlowiek();

        IConsume[] tablicaIConsume = new IConsume[2];
        tablicaIConsume[1] = zwierze;
        tablicaIConsume[2] = czlowiek;
    }
}
