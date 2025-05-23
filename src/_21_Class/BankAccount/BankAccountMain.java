package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withdraw(5000);
        System.out.println("현재 잔액: " + bankAccount.getBalance());
    }
}
