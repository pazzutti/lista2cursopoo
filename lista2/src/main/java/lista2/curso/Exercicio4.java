package lista2.curso;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            System.out.println("o jogo durou " + duracao + " horas");
        } else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("o jogo durou " + duracao + " horas");
            sc.close();
        }
    }
}
