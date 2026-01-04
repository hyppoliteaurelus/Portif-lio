package br.com.banco.model;


// Classe que representa uma conta bancária
// MODEL = onde ficam os dados e regras básicas
public class ContaBancaria {


    // Atributos privados (encapsulamento)
    // Só a própria classe pode acessar diretamente
    private String numeroConta;
    private String titular;
    private double saldo;

    // Construtor
    // É chamado quando criamos uma conta com "new ContaBancaria(...)"
    public ContaBancaria(String numeroConta,String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // toda conta começa com saldo zero
    }


    // Método para depósito
    // Regra: só aceita valor positivo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // ou saldo = saldo + valor
        }
    }


    // Método para saque
    // Regra: valor positivo e menor ou igual ao saldo
    // Retorna true se deu certo, false se não
public boolean sacar (double valor) {
    if (valor > 0 && valor <= saldo){
        saldo -= valor;// ou saldo = saldo - valor
        return true;
    }
    return false;
}


    // Getter do saldo
    // Permite CONSULTAR o saldo sem permitir alteração direta
public double getSaldo() {
        return saldo;
}

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

}
