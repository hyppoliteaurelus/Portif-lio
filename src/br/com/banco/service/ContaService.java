package br.com.banco.service;

import br.com.banco.model.ContaBancaria;


// SERVICE = camada de serviço
// Centraliza as operações do sistema
public class ContaService {


    // Método que executa o depósito
    // Recebe a conta e o valor
    public void realizarDeposito(ContaBancaria conta, double valor){
        conta.depositar(valor);
    }



    // Método que executa o saque
    // Retorna true ou false para o Main decidir o que mostrar
    public boolean realizarSaque(ContaBancaria conta, double valor){
        return conta.sacar(valor);
    }


    // Método específico para consultar saldo
    // Separação clara: saldo ≠ extrato
    public void consultarSaldo(ContaBancaria conta) {
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }


    // Método para exibir extrato simples
    // Aqui estamos apenas mostrando dados
    public void exibirExtrato(ContaBancaria conta){
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Conta:  " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}


