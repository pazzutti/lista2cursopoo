package lista2.curso;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Nao negativo");
            sc.close();
        }
    }
}
