import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Catrofe Bank.");
        System.out.print("Insira o numero da conta: ");
        int accountNumber = sc.nextInt();

        System.out.print("Insira seu nome completo: ");
        String accountHolder = sc.next();

        System.out.print("O senhor(a) tem depósito inicial? 0 = Não, 1 = Sim: ");
        int depositInitial = sc.nextInt();

        ContaBancaria account;
        if (depositInitial == 1){
            System.out.print("Insira o valor de deposito inicial: ");
            double balance = sc.nextDouble();
            account = new ContaBancaria(accountNumber, accountHolder, balance);
        }
        else{
            account = new ContaBancaria(accountNumber, accountHolder);
        }

        int choice;
        double newBalance;
        do {

            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Saldo");
            System.out.println("4: Sair");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    //depositar
                    System.out.print("Insira o valor: ");
                    newBalance = sc.nextDouble();
                    account.depositBalance(newBalance);
                    break;
                case 2:
                    System.out.print("Insira o valor: ");
                    newBalance = sc.nextDouble();
                    account.withdrawBalance(newBalance);
                    break;
                case 3:
                    System.out.printf("Saldo atual de: %.2f%n", account.getBalance());
                    break;
                default:
                    choice = 4;
                    break;
            }
        }
        while (choice != 4);
        sc.close();
    }
}