public class BinäreSuche {
    public static void main(String[] args) {
        //int[] aUnsortiert = {23, 43, 62, 2, 7, 12};
        int[] aUnsortiert = {2, 7, 12, 23, 43, 62};

        int[] aSortiert = insert(aUnsortiert);

        System.out.println(binarySearch(aSortiert, 0, aSortiert.length-1, 1));


        //out(aSortiert);
    }//main

    static int binarySearch(int[] a, int lo, int hi, int x){
        int mid;
        int midIndex;
        int counter = 0;

        midIndex = (lo+hi/2)-1;
        mid = a[midIndex];

        while (mid != x){
            if (mid > x){
                hi = midIndex;
            } else if (mid < x) {
                lo = midIndex;
            }

            if (midIndex < 2){
                midIndex = (lo+hi/2);
            } else {
                midIndex = (lo+hi/2)-1;
            }
            if (lo == hi){
                return -1;
            }
            mid = a[midIndex];
        }


        return midIndex;

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

    static void out(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}//BinäreSuche
