package _34_Exception;

import java.util.Scanner;

class SignupFailedException extends Exception {
    public SignupFailedException(String msg) {
        super(msg);
        System.out.println("예외가 발생했습니다.");
    }
}

public class SignupException {
    public static void signup(String name, int age) throws SignupFailedException {
        if(age < 14) {
            throw new SignupFailedException("14세 미만 가입 불가");
        } else {
            System.out.println("회원 가입 성공! 이름: " + name + " 나이: " + age);
        }
    }

    public static void main(String[] args) {
//        String name = "홍길동";
//        int age = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("-----회원 가입-----");
        System.out.print("이름을 입력해주세요. 이름: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력해주세요. 나이: ");
        int age = sc.nextInt();


        try {
          signup(name, age);
        } catch (SignupFailedException e) {
            System.out.println("회원 가입 실패: " + e.getMessage());
        } finally {
            System.out.println("프로그램이 정상적으로 종료되었습니다.");
        }
    }
}
