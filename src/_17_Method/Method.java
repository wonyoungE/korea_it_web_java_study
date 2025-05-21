package _17_Method;

public class Method {
    public static void sayHello() {
        // sayHello라는 이름을 가진 메서드
        // '안녕'을 출력
        System.out.println("안녕");
    }

    public static void main(String[] args) {
        // 메서드
        // 기능을 담당하는 부분

        // 메서드 호출
        System.out.println("메서드 호출 전");
        sayHello();
        System.out.println("메서드 호출 후");
    }
}
