package _21_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        // 객체 생성하는 방법
        Dog dog = new Dog();    // 껍데기에 불과하다,,

        // 생성된 해당 객체 속성 값 대입 또는 변경
        dog.name = "구슬이";   // 대입
        dog.age = 3;

        dog.name = "호두";    // 변경(수정)

        // 출력
        System.out.println(dog.name);
        System.out.println(dog.age);

        // 생성된 객체 메서드 호출
        dog.bark();
        dog.sleep();
    }
}
