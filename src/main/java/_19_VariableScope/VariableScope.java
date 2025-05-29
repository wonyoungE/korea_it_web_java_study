package _19_VariableScope;

public class VariableScope {
    public static void methodA() {
        String str = "abc";
//        System.out.println(name);
    }
    public static void main(String[] args) {
        // 지역 변수
        // name 변수는 main 메서드 안에 선언이 되어있는 지역 변수이다.
        // main 메서드 바깥에서는 쓸 수 없다.
        String name = "손원영";
//        System.out.println(str);

        // i는 for문 중괄호 안에서 쓸 수 있는 지역 변수이다.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
        for (int i = 0; i < 10; i++) {
            // 그렇기 때문에 i를 또 선언해서 사용할 수 있다.
            System.out.println(i);
        }

        {
            int age = 26;
        }
//        System.out.println(age);

    }
}
