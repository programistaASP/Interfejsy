package zadanie3;

public class Student implements Comparable {
    private String imie, nazwisko;
    private int nrAlbumu;

    public Student(String imie, String nazwisko, int nrAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrAlbumu = nrAlbumu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNrAlbumu() {
        return nrAlbumu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nrAlbumu == student.nrAlbumu &&
                imie.equals(student.imie) &&
                nazwisko.equals(student.nazwisko);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrAlbumu=" + nrAlbumu +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student that =(Student)o;
       return Integer.compare(this.getNrAlbumu(), that.nrAlbumu);
    }
}
