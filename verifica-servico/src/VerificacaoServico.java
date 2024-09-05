import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // Verifica se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico.trim())) {
                contratado = true;
                break;
            }
        }

        // Imprime o resultado
        System.out.println(contratado ? "Sim" : "Nao");
        System.out.println("Agradecemos pela preferência senhor(a) " + nomeCliente + ".");

        scanner.close();
    }
}
