public class SiebDesEratosthenes {
    public static void main(String[] args) {
        boolean p[] = new boolean[100];
        for (int i = 2; i < p.length; i++){
            p[i] = true;
        }

        for (int i = 2; i < p.length; i++){
            for (int j = 2; i < p.length; j++){
                int num = i * j;
                if (num < 100){
                    p[num] = false;
                } else if (num >= 100) {
                    break;
                }
            }
        }

        for (int i = 0; i < p.length; i++){
            if(p[i] == true){
                System.out.println(i + " = " + p[i]);
            }
        }
    }
}
