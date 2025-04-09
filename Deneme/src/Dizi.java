import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dizi<T extends Comparable<T>> {

    public <E> List<T> Donustur(E[] dizi) {
        List<T> liste = new ArrayList<>();
        for (E eleman : dizi) {
            liste.add((T) eleman);
        }
        return liste;
    }

    public T ortancaBul(T[] dizi) {
        Arrays.sort(dizi);
        int n = dizi.length;
        if (n % 2 == 1) {
            return dizi[n / 2];
        } else {
            T ortaSol = dizi[(n / 2) - 1];
            T ortaSag = dizi[n / 2];
            if (ortaSol instanceof Integer && ortaSag instanceof Integer) {
                return (T) Integer.valueOf(((Integer) ortaSol + (Integer) ortaSag) / 2);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Dizi<Integer> diziObjesi = new Dizi<>();
        Integer[] dizi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        List<Integer> liste = diziObjesi.Donustur(dizi);
        System.out.println("Dizi olarak ArrayList: " + liste);
        System.out.println("Ortanca değer: " + diziObjesi.ortancaBul(dizi));
    }
}