import java.util.Random;

public class Lottozahlen {
    public static void main(String[] args) {
        final int N = 6, RANGE = 49;
        int[] a = new int[N];
        Random zufallsgenerator = new Random();

        for (int i = 0; i < a.length; i++){
            a[i] = zufallsgenerator.nextInt(RANGE) + 1;
            while (istVorhanden(a, a[i], i)){
                a[i] = zufallsgenerator.nextInt(RANGE) + 1;
            }
        }

        out(a);
        System.out.println("-------------------------------");
        out(insert(a));
    }

    static void out(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    static boolean istVorhanden(int[] a, int x, int i){
        for (int j = 0; j < i; j++){
                if (a[j] == x){
                    return true;
                }
        }
        return false;
    }

    static int[] insert(int[] a){
        for (int j = 0; j < a.length; j++){
            for (int k = j+1; k < a.length; k++){
                if(a[j] > a[k]){
                    int h = a[k];
                    a[k] = a[j];
                    a[j] = h;
                }
            }
        }
        return a;
    }




}
