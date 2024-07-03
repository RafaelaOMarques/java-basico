package entities;

import java.util.Scanner;

public class ContaBanco {
    private int numeroConta;
    private double saldo;

    public ContaBanco(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = scanner.nextDouble();

        ContaBanco minhaConta = new ContaBanco(numeroConta, saldoInicial);

        System.out.println("Digite o valor para depositar na conta:");
        double valorDeposito = scanner.nextDouble();
        minhaConta.depositar(valorDeposito);

        System.out.println("Digite o valor para sacar da conta:");
        double valorSaque = scanner.nextDouble();
        minhaConta.sacar(valorSaque);

        System.out.println("Saldo atual da conta: R$" + minhaConta.verificarSaldo());

        scanner.close();
    }
}

