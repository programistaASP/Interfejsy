package zadanie4;

public class Garaz<T> {
    private T samochod1;
    private T samochod2;

    public Garaz(T miejsce1, T miejsce2) {
        this.samochod1 = miejsce1;
        this.samochod2 = miejsce2;
    }

    public T getMiejsce1() {
        return samochod1;
    }

    public void zaparkuj(T samochod) {
        if (this.samochod1 == null) {
            this.samochod1 = samochod;
        } else if (this.samochod2 == null) {
            this.samochod2 = samochod;
        } else {
            System.out.println("Wszystkie miejsca sa zajete");
        }
    }
    public void wyprowadz(T samochod){
        if (this.samochod1.equals(samochod)){
            System.out.println("Wyjechał samochód " + samochod);
            this.samochod1 = null;

        } else if (this.samochod2.equals(samochod))
        {
            this.samochod2 = null;

        }else{
            System.out.println("Samochod " + samochod + " nie ma w garazu" );
        }
    }
    @Override
    public String toString() {
        return "Garaz{" +
                "samochod1=" + samochod1.toString() +
                ", samochod2=" + samochod2.toString() +
                '}';
    }
}
