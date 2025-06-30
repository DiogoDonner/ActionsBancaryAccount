public class BancaryAccount {
    String accountHolder;
    String accoutNumber;
    double accountBalance;

    void accountDetails() {
        System.out.println("Titular da conta de número " + accoutNumber + ": " + accountHolder + " - SALDO: " + accountBalance);
    }

    void accountDeposit(Integer value) {
        accountBalance += value;
        System.out.println("O valor RS " + value + " foi adicionado a sua conta - TOTAL: " + accountBalance);
    }

    void withdrawAccount(Integer value) {
        if (accountBalance > value) {
            accountBalance -= value;
            System.out.println("O valor RS " + value + " foi sacado de sua conta - TOTAL: " + accountBalance);
        } else {
            System.out.println("ERROR - Transação não é possível");
        }
    }
}
