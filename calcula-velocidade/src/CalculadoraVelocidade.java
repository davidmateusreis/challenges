import java.util.Scanner;

public class CalculadoraVelocidade {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int quantidade = velocidades.length;

        // Soma todas as velocidades registradas e calcula a média
        for (String velocidadeString : velocidades) {
            double velocidade = Double.parseDouble(velocidadeString);
            total += velocidade;
        }

        return total / quantidade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada
        // hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int) velocidadeMedia + " Mbps");

        scanner.close();
    }
}