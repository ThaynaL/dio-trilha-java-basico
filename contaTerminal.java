import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia, nome_cliente;
        double saldo;
        
        System.out.println("Por favor, digite o nome do cliente !");
        nome_cliente = ler.nextLine();
        System.out.println("Por favor, digite o número da conta !");
        numero = ler.nextInt();
        ler.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = ler.nextLine();
        System.out.println("Por favor, digite o saldo !");
        saldo = ler.nextDouble();
        
        ler.close();
        
        System.out.println("Conta criada em nome de: " + nome_cliente);
    }
}
