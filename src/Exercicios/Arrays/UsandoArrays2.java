package Exercicios.Arrays;

public class UsandoArrays2 {
    public static void main(String[] args) {
        int [] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, soma = 0;
        int tamanho = ages.length;
        int lowestAge = ages[0];

        for (int age : ages) {
            soma += age;
            if (age < lowestAge) {
                lowestAge = age;

            }
        }

        avg = soma / tamanho;
        System.out.println("A media das idades é " + avg);
        System.out.println("E a menor idade é " + lowestAge);


    }
}
