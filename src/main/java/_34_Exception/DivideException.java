package _34_Exception;

import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 두 개를 입력해주세요. ");
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        try {
            int divide = a / b;
            System.out.println(a + " / " + b + " = " + divide);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
