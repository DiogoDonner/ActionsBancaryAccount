public class BancaryAccount {
    private String accountHolder;
    private String accoutNumber;
    private double accountBalance;

    public BancaryAccount(String accountHolder, String accoutNumber, double accountBalance) {
        this.accountHolder = accountHolder;
        this.accoutNumber = accoutNumber;
        this.accountBalance = accountBalance;
    }

    void accountDetails() {
        System.out.println("Titular da conta de número " + accoutNumber + ": " + accountHolder + " - SALDO: " + accountBalance);
    }

    void accountDeposit(Integer value) {
        if (value > 0) {
            this.accountBalance += value;
            System.out.println("O valor RS " + value + " foi adicionado a sua conta - TOTAL: " + accountBalance);
        } else {
            System.out.println("Valor Invalido");
        }
    }

    void withdrawAccount(Integer value) {
        if (accountBalance > value && accountBalance > 0) {
            accountBalance -= value;
            System.out.println("O valor RS " + value + " foi sacado de sua conta - TOTAL: " + accountBalance);
        } else {
            System.out.println("-----------------------------");
            System.out.println("ERROR - Transação não é possível");
            System.out.println("-----------------------------");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accoutNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
