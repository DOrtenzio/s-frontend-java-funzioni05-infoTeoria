package utili;
import java.util.Scanner;
public class TestVettori {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        //Creazione array
        System.out.println("Inserire il numero di elementi dell'array");
        int [] a=new int[in.nextInt()];
        //Inserimento
        for (int i=0;i<a.length;i++){
            System.out.println("Inserire elemento n°"+(i+1)+" su "+(a.length)+": ");
            a[i]=in.nextInt();
        }
        //Stampa
        System.out.println("L'array è: "+"\n"+Vettori.stampa(a));
        //Ordinamento cresente
        Vettori.seleSortAsc(a);
        System.out.println("L'array ordinato crescente è: "+"\n"+Vettori.stampa(a));
        //Ordinamento decrescente
        Vettori.seleSortDisc(a);
        System.out.println("L'array ordinato decrescente è: "+"\n"+Vettori.stampa(a));
        //Ricerca Lineare
        System.out.println("Inserire l'elemento da ricercare nell'array:");
        int el=in.nextInt();
        if (Vettori.ricercaLineare(a,el)==-1)
            System.out.println("Elemento non trovato");
        else
            System.out.println("Elemento trovato in posizione "+Vettori.ricercaLineare(a,el));
        //Ricerca Binaria
        System.out.println("Inserire l'elemento da ricercare nell'array:");
        int el2=in.nextInt();
        if (Vettori.ricercaBinaria(a,el2)==-1)
            System.out.println("Elemento non trovato");
        else
            System.out.println("Elemento trovato in posizione "+Vettori.ricercaBinaria(a,el2));

    }
}
