package kapttel1_1_2;

public class Oppgave2 {
    /*Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer)
    posisjonen til den minste verdien i en tabell.*/

    public static int min (int[] a){
        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }

        int m = 0;

        for(int i = 1; i < a.length; ++i){
            if(a[i] < a[m]){
                m = i;
            }
        }

        return m;
    }

    public static void main (String [] args){
        int [] a = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19,1,20};
        int minsteIndex = min(a);
        System.out.println(minsteIndex);
        System.out.println(a[minsteIndex]);
    }
}
