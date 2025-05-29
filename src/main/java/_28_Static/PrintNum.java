package _28_Static;

public class PrintNum {
    private static int num = 10;

    // printNum() 메서드는 static이기 때문에 클래스 수준
    // private int num = 10;이라고 되어있으면 인스턴스 수준이라
    // 객체를 생성하지 않아서 메모리에 할당이 되어있지 않은 상태
    // 그래서 멤버변수에 static을 붙여줘야 static 메서드에서도 사용할 수 있다.
    public static void printNum() {
        System.out.println(num);
    }
}
