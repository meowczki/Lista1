package zadanie1;


public class Main {

    public static void main(String[] args) {


        //suma dla n=2 i x=0.5
        System.out.println(maclaurin(2, 0.5));
        //błąd espia i espit dla n=6 x=0.5
        for (int i = 1; i <= 6; i++) {
            System.out.println("n=" + i);

            System.out.println("x=" + 0.5 + " epsiT=" + epsiT(i, 0.5) + "%");
            System.out.println("x=" + 0.5 + " epsiA=" + epsiA(i, 0.5) + "%");


        }
        //  //błąd espia i espit dla n=30 x=-10, x=10
        for (int i = 1; i <= 30; i++) {
            System.out.println();

            System.out.println("n=" + i);
            System.out.println("e^x dla -10 = " + Math.exp(-10));
            System.out.println("maclaurin dla -10 = " + maclaurin(i, -10));
            System.out.println("x=" + -10 + " epsiT=" + epsiT(i, -10) + "%");
            System.out.println("x=" + -10 + " epsiA=" + epsiA(i, -10) + "%");
            System.out.println();
            System.out.println("e^x dla 10 = " + Math.exp(10));
            System.out.println("maclaurin dla 10 = " + maclaurin(i, 10));
            System.out.println("x=" + 10 + " epsiT=" + epsiT(i, 10) + "%");
            System.out.println("x=" + 10 + " epsiA=" + epsiA(i, 10) + "%");

        }
        System.out.println( maclaurin2(10,0.18));


    }

    //suma maclaurina
    public static double maclaurin(int n, double x) {
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        return sum;
// rekurencyjnie
//        if(n==0){
//            return sum;
//        }else{
//            return (float) ((Math.pow(x, n) / factorial(n))+(maclaurin(n-1,x)));
//        }


    }

    //obliczanie silni, double bo int i long za mały zakres liczbowy
    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //obliczanie błedu epsit
    public static double epsiT(int n, double x) {
        return 100 * (Math.exp(x) - maclaurin(n, x)) / Math.exp(x);
    }

    //obliczanie błedu epsia
    public static double epsiA(int n, double x) {
        return 100 * (maclaurin(n, x) - maclaurin(n - 1, x)) / maclaurin(n, x);
    }


    //suma maclaurina, dane x i bład
    public static double maclaurin2(double x, double zadanyEpsi) {
        int i = 1;
        while (zadanyEpsi < epsiA(i, x)) {
    i++;
        }
        return maclaurin(i,x);
    }

}
