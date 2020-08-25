package kapttel1_1_2;

public class Oppgave3 {
    /*Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
    Hva må endres for at den skal returnere posisjonen til den siste?*/
    /*For at maks-metoden skal returnere posisjonen til den siste av den største verdien, må m = a-length-1, index i for-løkken starte på
    a.length-2 og i >= 0, og i synke med 1 hver gang løkken kjøres.*/

    public static int min (int[] a){
        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }

        int m = a.length-1;

        for(int i = a.length-2; i >= 0; --i){
            if(a[i] < a[m]){
                m = i;
            }
        }
        return m;
    }
}
