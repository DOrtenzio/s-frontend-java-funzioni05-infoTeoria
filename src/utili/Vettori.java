package utili;
public class Vettori {
    public static void seleSOrtAsc (int [] a){
        int posmin=0,temp;
        for (int i=0;i<a.length-2;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[posmin]>a[j])
                    posmin=j;
            }
            temp=a[i];
            a[i]=a[posmin];
            a[posmin]=temp;
        }
    }
}