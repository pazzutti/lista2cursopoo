package lista2.curso;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("q1");
        } else if (x < 0 && y > 0) {
            System.out.println("q2");
        } else if ( x < 0 && y < 0){
            System.out.println("q3");
        } else if(x > 0 && y < 0) {
            System.out.println("q4");
        } else {
            System.out.println("origem");
        }
        sc.close();
    }
    
}
