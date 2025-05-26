package _22_Inheritance;

public class Main {
    public static void main(String[] args) {
        // 상속 - 기존 클래스(부모 클래스 또는 슈퍼 클래스)의 속성과 기능(메서드)을
        // 새로운 클래스(자식 클래스 또는 서브 클래스)가 물려받는 것
        // 왜 상속을 해야하나?
        // => 코드의 재사용성, 계층 구조 설계를 가능하게 해주는 핵심 개념
        // => 유지 보수 즉, 공통 기능이 한 곳(부모 클래스)에 있으므로, 수정할 일이 생기면 부모 클래스만 고치면 자식 클래스에도 반영
        // => 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다.(개방 폐쇄 원칙)
        // 개방 폐쇄 원칙 : 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다. 상속을 통해 기능을 확장시키는 것은 좋으나, 기존 것을 변경 xx

        // 객체 지향의 5원칙 SOLID - OOP의 4대 원칙을 지키기위한 가이드라인
        // 객체 지향 프로그래밍의 4원칙 - 추상화, 캡슐화, 상속, 다형성

        // 자식 클래스는 부모의 코드를 그대로 사용
        // 자식 클래스는 부모의 코드를 그대로 사용하거나, 필요한 기능을 추가하거나
        // 부모의 코드(메서드)를 수정 가능 => 오버라이딩(Overriding)

        Animal animal1 = new Animal();
        animal1.setAnimalName("고양이");
        animal1.setAnimalAge(3);
        animal1.move();
        // animal1.hunt(); 자식 클래스에 있는 메서드이기 때문에 불가능

        // super()까지 함
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랑이");
        System.out.println(tiger1.getAnimalName());
        tiger1.setAnimalAge(3);
        System.out.println(tiger1.getAnimalAge());
        tiger1.move();
        tiger1.hunt();
        tiger1.setStriped(true);

        Tiger tiger2 = new Tiger("백호", 3, false);

        Human human = new Human("원영", 26);
        System.out.println(human.getAnimalName());
        human.getAnimalAge();
        human.read("책 제목1");
    }
}
