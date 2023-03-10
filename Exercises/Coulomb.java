// Programa em Java para calcular a força elétrica utilizando a Lei de Coulomb
// A Lei de Coulomb é uma lei da Física usada para determinar a intensidade da 
//força de atração ou repulsão entre duas cargas elétricas.

import java.util.Scanner;

public class Coulomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double K = 9e9; // constante eletrostática
        double q1, q2, r, f; // cargas elétricas, distância e força elétrica

        // Obtém as cargas elétricas e a distância entre elas do usuário
        System.out.print("Informe a carga elétrica 1 (em Coulombs): ");
        q1 = sc.nextDouble();
        System.out.print("Informe a carga elétrica 2 (em Coulombs): ");
        q2 = sc.nextDouble();
        System.out.print("Informe a distância entre as cargas (em metros): ");
        r = sc.nextDouble();

        // Calcula a força elétrica utilizando a Lei de Coulomb
        f = K * q1 * q2 / (r * r);

        // Exibe o resultado
        System.out.println("A força elétrica entre as cargas é de " + f + " Newtons.");
    }
}