package zadanie5;

import java.util.Arrays;

public class MojaLista<E> {

    E[] array;

    public MojaLista(int n) {
        this.array = (E[]) new Object[n];
    }

    public boolean zawiera(E element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public boolean porownanie(E element)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(element.equals(array[i]))
            {
                return true;
            }
        }
        return false;
    }
    public int rozmiar()
    {
        return array.length;
    }
    public int iloscElementow()
    {
        int zajete = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == null)
            {
                zajete++;
            }
        }
        return zajete;
    }
    public boolean dodaj(E element)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == null)
            {
                array[i] = element;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tablica obiektów: [" + Arrays.toString(array);
    }
}
