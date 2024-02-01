import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numConta;
        String agencia;
        String nomeCliente;
        int saldo;

       //TODO: Conhecer e importa a classe Scanner

       Scanner sc = new Scanner(System.in);

      //Obter pelo scanner os valores digitados no terminal

       System.out.println("Olá, para iniciar a abertura de sua conta digite seu nome: ");
       nomeCliente = sc.nextLine();

       System.out.println("Qual o número de sua conta? ");
       numConta = sc.nextInt();

       System.out.println("Qual sua agencia? ");
       agencia = sc.next();

       System.out.println("Qual o valor inicial de sua conta? ");
       saldo = sc.nextInt();

       System.out.println("########################################");

       //exibir a mensagem da conta criada
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque\"");
       
       

      
    }
}
