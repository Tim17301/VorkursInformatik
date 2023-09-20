public class SelectSort {
    public static void main(String[] args) {
        int[] a= {6, 3, 1, 4, 1, 3, 2, 4};
        out(a);
        selectionSort(a);
        out(a);
    }

    static void out(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    static void selectionSort(int[] a){
        for (int k = 0; k < a.length; k++){
            int m = posMin(a, k);
            exchange(a, k, m);
        }
    }

    static int posMin(int[] a, int k){
        int m = k;
        for (int i = k + 1; i < a.length; i++){
            if (a[i] < a[m]){
                m = i;
            }
        }
        return m;
    }


    static void exchange(int[] a, int i, int j){
        int h = a[i];
        a[i] = a[j];
        a[j] = h;
    }
}
