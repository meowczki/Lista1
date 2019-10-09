package test;


public class Main {

    public static void main(String[] args) {
        System.out.println(Math.pow(-10,30));


//        for (int i = 1; i <= 30; i++) {
//            System.out.println();
//            System.out.println("n=" + i);
            System.out.println("e^x dla 10 = "+Math.exp(-10));
        System.out.println("maclaurin dla 10 = "+maclaurin(30,-10));
        System.out.println("maclaurin dla 10 = "+maclaurin(35,-10));

//            System.out.println();
//        }

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

    //obliczanie silni
    public static double factorial(long n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
