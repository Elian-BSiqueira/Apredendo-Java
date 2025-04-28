package Exercicios;

public class MethodOverloading {
    static int soma(int x, int y) {
        return x + y;
    }

    static double soma(double x, double y){
        return x + y;
    }



    public static void main(String[] args) {
        System.out.println(soma(2, 4.4));
    }
}
