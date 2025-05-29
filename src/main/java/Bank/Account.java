package Bank;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 입금
    public void deposit(int amount) {
        // 필드명이 다르므로 명확하다. this.balance 안해도 됨
        // amount가 양수인지 검증 해주기
        if(amount > 0){
            balance += amount;
            System.out.println("계좌에 " + amount + "원 입금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("0원 이상만 입금 가능합니다.");
        }
    }

    // 출금
    public void withdraw(int amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다. 현재 잔액: " + balance + "원");
        } else if(balance < amount) {
            System.out.println("출금할 금액이 계좌 잔액보다 큽니다. 현재 잔액: " + balance);
        } else if(amount < 0) {
            System.out.println("0원 이상만 출금 가능합니다.");
        }
    }
}
