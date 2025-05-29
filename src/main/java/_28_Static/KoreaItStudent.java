package _28_Static;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class KoreaItStudent {
    // KoreaItStudent 객체를 생성하지 않아도 컴퓨터가 이미 알고있다.(=클래스를 로드할 때 메모리에 할당)
    // static 변수는 getter 생성 x
    static String static_curriculum = "웹 개발";
    // 원래 멤버변수는 객체가 생성되어야 컴퓨터가 그제서야 읽기 시작한다.
    private String name;
    private int age;

    public static String getStatic() {
        return static_curriculum;
    }
}
