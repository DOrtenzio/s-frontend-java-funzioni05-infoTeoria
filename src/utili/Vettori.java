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
    public static void seleSortDisc ( int [] a){
        int posmax=0,temp;
        for (int i=a.length-1;i>0;i--){
            for (int j=i-1;j>=0;j--){
                if (a[posmax]>a[j])
                    posmax=j;
            }
            temp=a[i];
            a[i]=a[posmax];
            a[posmax]=temp;
        }
    }
    public static int ricercaLineare ( int [] a, int elemento){
        int pos=-1;
        for (int i=0;i<a.length;i++){
            if (a[i]==elemento){
                pos=i;
                break;
            }
        }
        return pos;
    }
    public static int ricercaBinaria ( int [] a, int elemento){
        int pos=-1;
        int primo=0,ultimo=a.length-1,medio;
        while (primo<=ultimo){
            medio=(primo+ultimo)/2;    //Reistituisco il punto medio ogni volta
            if (elemento==a[medio]){
                pos=medio;
                break;
            } else if (elemento<a[medio])
                ultimo=medio-1;
            else
                primo=medio+1;
        }
        return pos;
    }
}