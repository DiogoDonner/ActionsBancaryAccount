//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Atividade Ações Bancárias!\n");

        BancaryAccount ac1 = new BancaryAccount();
        ac1.accountHolder = "Pedro";
        ac1.accoutNumber = "1609843-4 6990";
        ac1.accountBalance = 0;

        ac1.accountDetails();
        System.out.println();
        ac1.accountDeposit(500);
        ac1.withdrawAccount(1000);
        ac1.withdrawAccount(300);
        System.out.println();
        ac1.accountDetails();

    }
}