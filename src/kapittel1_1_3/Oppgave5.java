package kapittel1_1_3;

public class Oppgave5 {
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

    public static int maks (int[] a){
        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }

        int m = 0;

        for(int i = 1; i < a.length; ++i){
            if(a[i] > a[m]){
                m = i;
            }
        }

        return m;
    }
    public static int[] minmaks(int[] a){

        return new int[] {min(a), maks(a)};
    }

    public static int[] minmaks1(int[] a){
        int min = 0;
        int minverdi = a[0];
        int maks = 0;
        int maksverdi = a[0];

        int verdi = 0;

        for(int i = 1; i < a.length; i++){
            verdi = a[i];

            if(verdi > maksverdi){
                maksverdi = verdi;
                maks = i;
            }

            else if(verdi < minverdi){
                minverdi = verdi;
                min = i;
            }
        }

        return new int[] {min, maks};
    }

    public static void main (String[] args){

        int[] b = {2,5};
        int[] sortert = new int [2];
        int[] minmaks = minmaks1(b);
        for(int i = 0; i < minmaks1(b).length; i++){
            sortert[i] = minmaks[i];
        }

        String ut = "";
        for(int i = 0; i < sortert.length; i++){
            ut += sortert[i] + ", ";
        }
        System.out.println(ut);
    }

}
