package equalsHascode;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        Czlowiek czlowiek1 = new Czlowiek("Jan", "Kowalski", 33);
        Czlowiek czlowiek2 = new Czlowiek("Janina", "Kowalska", 22);
        Czlowiek czlowiek3 = new Czlowiek("Jan", "Kowalska", 2);

        Czlowiek[] czlowieki = new Czlowiek[3];

        czlowieki[0] = czlowiek1;
        czlowieki[1] = czlowiek2;
        czlowieki[2] = czlowiek3;

        Arrays.sort(czlowieki);


        for (Czlowiek czlowiek : czlowieki) {
            System.out.println(czlowiek.toString());

        }
        Comparator<Czlowiek> poruwnywaczPoImieniu = Comparator.comparing(o ->o.getImie());
        Arrays.sort(czlowieki,poruwnywaczPoImieniu);



    }


}

