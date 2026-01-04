package br.com.banco.app;

import br.com.banco.model.ContaBancaria;
import br.com.banco.service.ContaService;

import java.util.Scanner;


// Classe principal da aplicação
public class Main {
    // Método main: ponto de entrada do programa
    public static void main(String[] args) {


        // Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);
        // Criamos a conta bancária
        // Aqui estamos instanciando o objeto
        ContaBancaria conta = new ContaBancaria("12345-6", "Cliente Teste");
        ContaService service = new ContaService();  // Criamos o serviço que executa as operações



        int opcao;

        // Loop do menu
        // Continua até o usuário escolher sair (0)

        do {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Extrato");
            System.out.println("4 - Ver o saldo");
            System.out.println("0 - Sair");


            // Lê a opção digitada
            opcao = scanner.nextInt();


            // Decide o que fazer com base na opção
            switch (opcao){
                case 1 -> {
                    System.out.print("Valor do depòsito: ");
                    double valor = scanner.nextDouble();
                    service.realizarDeposito(conta, valor);
                }
                case 2 ->{
                    System.out.print("valor do saque: ");
                    double valor = scanner.nextDouble();
                    // Se o saque falhar, mostramos mensagem
                    if (!service.realizarSaque(conta, valor)) {
                        System.out.println("Saldo insuficiente.");
                    }
                }
                case 3 -> service.exibirExtrato(conta);
                case 4 -> service.consultarSaldo(conta);

            }
        }while (opcao != 0);

        // Fecha o scanner
        scanner.close();
    }

}
