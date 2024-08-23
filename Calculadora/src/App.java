import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        calcularINSS(1500.00);
    }

    public static void calcular(){
        float n1;
        float n2; 
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        n1 = scan.nextFloat();
        System.out.println("Digite o segundo número");
        n2 = scan.nextFloat();

        System.out.println("A soma é: "+(n1+n2));
        System.out.println("A subtração é: "+(n1-n2));
        System.out.println("A divisão é: "+(n1/n2));
        System.out.println("O produto é: "+(n1*n2));
    }
}
