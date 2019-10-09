package zadanie2;

import static zadanie1.Main.factorial;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("oblicznie pierwszym sposobem "+maclaurin(i, 3));
           System.out.println("oblicznie drugim sposobem "+maclaurin2(i, 3));
            System.out.println();
        }

        System.out.println(epsiT(3,maclaurin(20,3)));
        System.out.println(epsiT(3,maclaurin2(20,3)));

    }

    public static double maclaurin(int n, double x) {
        double sum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum -= Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        for (int i = 0; i <= n / 2; i++) {
            sum += Math.pow(x, 2 * i) / factorial(2 * i);
        }
        return sum;
    }

    public static double maclaurin2(int n, double x) {
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        return 1 / sum;
    }
    //obliczanie błedu epsit
    public static double epsiT( double x,double wynik) {
        return 100 * (Math.exp(x) - wynik) / Math.exp(x);
    }
}
