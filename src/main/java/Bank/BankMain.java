package Bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(500000);
        String number;
        int amount = 0;

        while(true) {
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 종료");
            System.out.println("번호를 선택해주세요.");
            number = sc.nextLine();

            if(number.equals("1")) {
                System.out.println("입금하실 금액을 입력해주세요.");
                amount = Integer.parseInt(sc.nextLine());
                account.deposit(amount);
            } else if(number.equals("2")) {
                System.out.println("출금하실 금액을 입력해주세요.");
                amount = Integer.parseInt(sc.nextLine());
                account.withdraw(amount);
            } else if(number.equals("3")) {
                break;
            }
        }
    }
}
