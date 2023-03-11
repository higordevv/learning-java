import java.util.Scanner;

public class Coulomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double q1, q2, d;

        // Obtém as cargas elétricas e a distância entre elas do usuário
        q1 = getDoubleFromUser(scanner, "Informe a carga elétrica 1 (em Coulombs): ");
        q2 = getDoubleFromUser(scanner, "Informe a carga elétrica 2 (em Coulombs): ");
        d = getDoubleFromUser(scanner, "Informe a distância entre as cargas (em metros): ");

        // Calcula a força elétrica utilizando a Lei de Coulomb
        double force = calculateForce(q1, q2, d);

        // Exibe o resultado
        System.out.printf("A força elétrica entre as cargas é de %.2f N.\n", force);
    }

    private static double getDoubleFromUser(Scanner scanner, String prompt) {
        double value = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                value = scanner.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.next();
            }
        }

        return value;
    }

    private static double calculateForce(double q1, double q2, double d) {
        final double k = 9e9;
        return k * q1 * q2 / (d * d);
    }
}
