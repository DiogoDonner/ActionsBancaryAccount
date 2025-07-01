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

//            BancaryAccount ac1 = new BancaryAccount();
//            ac1.accountHolder = "Pedro";
//            ac1.accoutNumber = "1609843-4 6990";
//            ac1.accountBalance = 0;
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
                    for (int i = 0; i < accounts.size(); i++) {
                        BancaryAccount acc = accounts.get(i);
                        acc.accountDetails();
                        System.out.println("-----------------------------");
                    }
                    System.out.println("===DEV OPS===");
                    break;
                case "0":
                    active = false;
                    break;

                case "1":
                    System.out.println("===Ações Bancárias===\n" +
                            "Digite o Nome do Titular:");
                    String accountHolder = scanner.nextLine();
                    System.out.println("Digite o número da conta");
                    String accoutNumber = scanner.nextLine();
                    System.out.println("Digite o valor a ser depositado para a conta ");
                    double accountBalance = Double.parseDouble(scanner.nextLine());
                    BancaryAccount newAccount = new BancaryAccount(accountHolder, accoutNumber, accountBalance);
                    accounts.add(newAccount);
                    System.out.println("Conta criada com sucesso!");
                    for (BancaryAccount acc : accounts) {
                        System.out.println(acc.accountHolder + " - " + acc.accoutNumber + " SALDO: " + acc.accountBalance);
                        System.out.println("-----------------------------");
                    }
                    break;

                case "2":
                    System.out.println("===Ações Bancárias===\n" +
                            "Digite o número da conta:");
                    String codeInput = scanner.nextLine();
                   


            }

//        ac1.accountDetails();
//        System.out.println();
//        ac1.accountDeposit(500);
//        ac1.withdrawAccount(1000);
//        ac1.withdrawAccount(300);
//        System.out.println();
//        ac1.accountDetails();

        }
    }
}