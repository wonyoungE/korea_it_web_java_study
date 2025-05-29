package _28_Static;

public class Main {
    public static void main(String[] args) {
        // static으로 선언한 멤버변수는 클래스를 통해 바로 접근 가능하다.
        // 즉, 객체를 생성하지 않아도 알고있다..!! ㅁㅊ 어케알았누..
        System.out.println(KoreaItStudent.static_curriculum);
        System.out.println(KoreaItStudent.getStatic());
        // static은 클래스 수준에서 알고있는 것 => 클래스만 있으면 된다.
        // 나머지는 객체 수준에서 알고있는 것 => 객체가 생성되지 않으면 모름

        // static은 클래스 수준(인스턴스 수준x)에서 변수를 정의하거나 메서드를 선언할 때 사용
        // static으로 선언된 변수나 메서드는 클래스의 인스턴스에 속하지 않음
        // 클래스 자체에 속하게 되는 것
        // 이는 인스턴스를 생성하지 않고 접근이 가능하다는 것
        // 이런 점에서 인스턴스 변수나 메서드와 차이가 있다.
        // 특징
        // 클래스 수준의 변수 및 메서드 - static 변수와 메서드는 클래스 로드 시 메모리에 할당.
        // 공유 - 모든 인스턴스가 동일한 static 변수에 접근, 따라서 데이터를 공유하거나 상태를 저장
        // 그냥 특정 클래스의 모든 인스턴스가 같은 상태를 유지해야한다면 static 쓰면 됨
        KoreaItStudent koreaItStudent = new KoreaItStudent("손원영", 26);
        System.out.println(koreaItStudent.getStatic());

    }
}
