package _34_Exception;

import java.util.Scanner;

public class NumberParseException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요. ");
        String input = sc.nextLine();

        try {
            System.out.println("입력한 숫자는: " + Integer.parseInt(input));
        } catch(NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력하셨습니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
