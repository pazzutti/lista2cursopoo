package lista2.curso;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado;
        if (a % b == 0 || b % a == 0){
            System.out.println("sao multiplos");;
        } else {
            System.out.println("nao sao multiplos");
            sc.close();
        }
    }
}
