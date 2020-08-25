package kapittel1_1_3;

public class Oppgave6 {
    public static long fak(int n){
       /*long fakultet = n; //1
       if(n < 0){  //1
           throw new IllegalArgumentException("n < 0"); //x
       }

       int m = n; //1
       while(m > 1){ // n
           m--;  //1
           fakultet = fakultet * m;   //2
       }
       return fakultet; //1*/

       long fak = 1; //1

       for(int i = 2;i <= n; i++){ //n
           fak *= i; //1
       }

       return fak;
       
    }

    public static void main(String[] args){
        System.out.println(fak(4));
    }
}
