package zadanie3;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(sumaCz(i));
            System.out.println();
            System.out.println(sumaCz2(1001-i));
            System.out.println();
        }

    }


    public static double sumaCz(int n) {
        if (n == 1) {
            return 1 / (Math.pow(1, 4));
        }
        return sumaCz(n - 1) + 1 / (Math.pow(n, 4));
    }


    public static double sumaCz2(int n) {
        double suma = 0;
        for (int i = 1000; i >= n; i--) {
            suma += 1 / Math.pow(i, 4);
        }
        return suma;
    }
//
//    public static double sumaCz3(int n) {
//        double suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += 1 / Math.pow(i, 4);
//        }
//        return suma;
//    }

}
