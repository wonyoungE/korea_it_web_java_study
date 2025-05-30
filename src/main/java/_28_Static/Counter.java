package _28_Static;

public class Counter {
    public static int count = 0;

    public static void increase() {
        count++;
    }

    // static -> 클래스 수준의 메서드, static 메모리에 할당.
    // 여기서 쓰는 메서드, 변수는 static이어야 함.
    public static void main(String[] args) {
        // 같은 객체 내에 있기 때문에 Counter. 안붙여도 됨
        increase();
        increase();
        increase();
        System.out.println(count);

        // 그럼 static 안붙이면 어케되는데
        // 오류 남 => 왜냐?
        // static 변수/메서드는 클래스 수준이라 인스턴스가 생성되지 않아도 메모리에 할당
        // 그 외 나머지 변수/메서드는 인스턴스 수준이라 객체가 생성되어야 그제서야 메모리에 할당되기 때문에
        // static을 빼버리면 같은 클래스 내의 메서드라도 메서드만 불러와서 쓸 수 없다.
        // 지금 increase() 메서드를 불러오는 main() 메서드가 static임
        // 그렇기 때문에 main()은 클래스 수준이고, 얘 안에서 쓰는 애들도 다 static이어야하는거임
        // 왜냐면 수준이 맞아야하니까;
        // 그냥 일반 클래스의 static 안달린 메서드 안에서 다른 메서드 불러오는 건
        // 어차피 인스턴스 생성 시 메모리 할당되기 때문에 상관없다.
    }
}
