import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2,
                soma, subtracao,
                multiplicacao,
                divisao, resto;

        System.out.println("==========[ Calculadora Foda ]==========");
        System.out.print("Digite o primeiro numero: ");
        while(!sc.hasNextInt() || sc.hasNext(null)){
            System.out.print("Digite um numero inteiro valido: ");
            sc.next();
        }
        numero1 = sc.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        while(!sc.hasNextInt()){
            System.out.print("Digite um numero inteiro valido: ");
            sc.next();
        }
        numero2 = sc.nextInt();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        resto = numero1 % numero2;

        // Output
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
        System.out.println("A divisão dos números é: " + divisao);
        System.out.println("O resto da divisão dos números é: " + resto);

        sc.close();

    }
}
