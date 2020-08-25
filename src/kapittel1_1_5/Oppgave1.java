package kapittel1_1_5;

public class Oppgave1 {
    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

    public static void main (String[] args){
        int[] a = {};
        int maksverdi = a[maks(a)];
        System.out.println(maksverdi);
    }

    /*Programkode 1.1.5 gir korrekte resultater. Om a har lengde 1 vil verdien med index 0 skrives ut, det er da det største tallet.
    Om a er tom med lengde 0 vil det skrives ut en IndexOutOfBoundsException siden det ikke finens noe element med index = 0.    */
}
