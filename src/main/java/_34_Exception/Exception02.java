package _34_Exception;

import com.google.gson.internal.bind.util.ISO8601Utils;

class LoginFailedException extends Exception {
    // 생성자 만드는 이유?
    // throw new 해서 생성자를 만들기 때문에.
    // 매개변수로 msg 받아서 뿌려주기
    public LoginFailedException(String msg) { // 2. 객체 생성
        super(msg);     // Exception 상속받기 때문에 상위 클래스의 생성자에 msg 넣어주기
        System.out.println("예외가 발생했습니다.");  // 3. 객체 생성되면서 문구 출력
    }
}

public class Exception02 {
    // throws -> 책임 전가
    // login() 메서드를 호출한 곳에서 예외를 처리할 거라고 책임 전가하는 것
    public static void login(String id, String pw) throws LoginFailedException {    // 4. 생성된 객체를 login() 호출한 곳에 던짐
        String correctId = "admin";
        String correctPw = "1q2w3e!";

        if(!correctId.equals(id) || !correctPw.equals(pw)) {
            // 예외 발생, 예외를 발생시키는 트리거
            // 메서드 내에서 직접 처리하는 건 아니지만 예외 처리한 것(던졌으니)
            throw new LoginFailedException("Id 또는 Pw가 틀렸습니다."); // 1. 예외가 발생되는 시점, Exception 생성자 만듦
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPw = "123qwe!";

        try {
            // 메서드 내에서 예외 터졌으나 throws로 login을 호출한 곳에 예외 던졌음
            // 여기서 처리해줘야 함
            login(inputId, inputPw);    // 5. throws로 던져서 여기서 예외 터진셈 -> catch로 예외 잡음
        } catch (LoginFailedException e) {
            // LoginFailedException -> 사용자 정의 예외, Exception을 상속받았기 때문에
            // getMessage()
            System.out.println("로그인 실패: " + e.getMessage());    // 6. 예외 객체가 갖고 있는 메시지 출력
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        // 예외가 발생했습니다.                  -> throw new 해서 객체 생성할 때 출력
        // 로그인 실패: Id 또는 Pw가 틀렸습니다.   -> catch에서 출력
        // 프로그램 정상 종료
    }
}
