//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BancaryAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean active = true;
        while (active) {
            System.out.printf("Atividade Ações Bancárias!\n");
            System.out.println("Escolha a função:\n" +
                    "1 - Criar Conta\n" +
                    "2 - Realizar Depósitos \n" +
                    "3 - Realizar Saques\n" +
                    "4 - Consultar Saldo\n" +
                    "0 - Fechar Sistema");
            String option = scanner.nextLine();
            switch (option) {
                case "debug":
                    System.out.println("===DEV OPS===");
                    if (accounts.isEmpty()) {
                        System.out.println("-----------------------------");
                        System.out.println("Nenhuma conta no Sistema");
                        System.out.println("-----------------------------");
                    } else {
                        System.out.println("-----------------------------");
                        for (int i = 0; i < accounts.size(); i++) {
                            BancaryAccount acc = accounts.get(i);
                            acc.accountDetails();
                            System.out.println("-----------------------------");
                        }
                    }
                    break;
                case "0":
                    System.out.println("Sistema Encerrado...");
                    active = false;
                    break;

                case "1":
                    System.out.println("===Ações Bancárias===\n" +
                            "Digite o Nome do Titular:");
                    String accountHolder = scanner.nextLine();
                    System.out.println("Digite o número da conta");
                    String accoutNumber = scanner.nextLine();
                    double accountBalance = 0;
                    BancaryAccount newAccount = new BancaryAccount(accountHolder, accoutNumber, accountBalance);
                    accounts.add(newAccount);
                    System.out.println("Conta criada com sucesso!");
                    break;

                case "2":
                    System.out.println("===Ações Bancárias===\n" +
                            "Digite a posição da conta:");
                    System.out.println("-----------------------------");
                    for (BancaryAccount acc : accounts) {
                        System.out.println(acc.accountHolder + " - " + acc.accoutNumber);
                        System.out.println("-----------------------------");
                    }
                    String position = scanner.nextLine();
                    int positback = Integer.parseInt(position) - 1;
                    if (positback < accounts.size() && positback >= 0) {
                        System.out.println("Digite a quantia a ser depositada:");
                        String quant = scanner.nextLine();
                        Integer quantback = Integer.parseInt(quant);
                        BancaryAccount selectedAccount = accounts.get(positback);
                        selectedAccount.accountDeposit(quantback);
                    } else {
                        System.out.println("-----------------------------\n" +
                                "Posição Invalida\n" +
                                "-----------------------------");
                    }
                    break;

                case "3":
                    System.out.println("===Ações Bancárias===\n" +
                            "Digite a posição da conta:");
                    System.out.println("-----------------------------");
                    for (BancaryAccount acc : accounts) {
                        System.out.println(acc.accountHolder + " - " + acc.accoutNumber);
                        System.out.println("-----------------------------");
                    }
                    String positionDeposit = scanner.nextLine();
                    int positbackDeposit = Integer.parseInt(positionDeposit) - 1;
                    if (positbackDeposit < accounts.size() && positbackDeposit >= 0) {

                        System.out.println("Digite a quantia a ser sacada:");
                        String quantDeposit = scanner.nextLine();
                        Integer quantbackDeposit = Integer.parseInt(quantDeposit);
                        BancaryAccount selectedAccountDeposit = accounts.get(positbackDeposit);
                        selectedAccountDeposit.withdrawAccount(quantbackDeposit);
                    } else {
                        System.out.println("-----------------------------\n" +
                                "Posição Invalida\n" +
                                "-----------------------------");
                    }
                    break;

                case "4":
                    System.out.println("===Ações Bancárias===\n" +
                            "Digite a posição da conta:");
                    System.out.println("-----------------------------");
                    for (BancaryAccount acc : accounts) {
                        System.out.println(acc.accountHolder + " - " + acc.accoutNumber);
                        System.out.println("-----------------------------");
                    }
                    String positionBalance = scanner.nextLine();
                    int positbackBalance = Integer.parseInt(positionBalance) - 1;
                    if (positbackBalance < accounts.size() && positbackBalance >= 0) {
                        BancaryAccount selectedAccountBalance = accounts.get(positbackBalance);
                        System.out.println("-----------------------------");
                        selectedAccountBalance.accountDetails();
                        System.out.println("-----------------------------");
                    } else {
                        System.out.println("-----------------------------\n" +
                                "Posição Inválida\n" +
                                "-----------------------------");
                    }
                    break;
            }
        }
    }
}