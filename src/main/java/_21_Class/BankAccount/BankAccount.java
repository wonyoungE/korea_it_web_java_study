package _21_Class.BankAccount;

public class BankAccount {
//  private Integer balance;
    private int balance;    // 잔액
    // int가 아니라 Integer로 필드를 생성했을 때 기본 생성자로 객체를 생성하면 0이 아니라 null이 초기값이 된다.
    // Integer -> null을 포함하는 정수

    BankAccount() {
        System.out.println("계좌가 개설되었습니다. 현재 잔액: " + balance + "원");
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

    // 입금과 출금을 담당하는 메서드들은 setter와 같다고 할 수 있는가?
    // 속성값을 변경한다는 관점으로 보면 그렇다. 라고 할 수 있다.
    // 다만 setter와 이러한 메서드들의 차이를 이해해야 한다.
    // 1. setter는 직접적으로 변경하고 있다. 입금 출금 메서드는 메서드 명에서 드러나듯이
    // >행위에 중점<을 둔다. => 값을 직접적으로 변경하고 있는 것이 아니라 >값을 계산해서 변경<
    // 2. setter는 검증 단계를 보통은 포함하지 않는다.
    // 하지만 메서드는 보통 검증 단계를 포함할 수 있다. (= 꼭 검증이 필요한 것은 아니다.)


    // getter()
    public int getBalance() {
        return balance;
    }
}
