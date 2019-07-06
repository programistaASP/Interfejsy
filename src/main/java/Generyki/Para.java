package Generyki;

public class Para <T> {
    private T lewy;
    private T prawy;

    public Para(T lewy, T prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public T getLewy() {
        return lewy;
    }

    public T getPrawy() {
        return prawy;
    }

    @Override
    public String toString() {
        return "Para{" +
                "lewy=" + lewy.toString() +
                ", prawy=" + prawy.toString() +
                '}';
    }
}
