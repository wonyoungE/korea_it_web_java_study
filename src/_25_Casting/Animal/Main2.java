package _25_Casting.Animal;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        // 업캐스팅, 참조 객체가 animal1 인거지 내용은 Dog
        Animal animal1 = new Dog();

        // instanceof
        // 객체 instanceof 클래스 이름
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);    // true
        boolean result2 = animal1 instanceof Dog;   // animal1은 Dog 객체를 업캐스팅
        System.out.println(result2);    // true
        // 확인하고자 하는 객체가 해당 클래스의 인스턴스이거나
        // 자식 클래스의 인스턴스일 때 => true
        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);    // true
        boolean result4 = dog1 instanceof Animal;   // 자식 클래스의 인스턴스인 경우
        System.out.println(result4);    // true

        // 잘못된 형변환으로 인한 ClassCastException 예외를 방지할 수 있다.
        Animal animal2 = new Dog(); // 업캐스팅
        System.out.println("animal2를 검증");
        // 다운캐스팅하기 전에 animal2가 Dog의 인스턴스인지 검증 후 형변환
        if(animal2 instanceof Dog) {
            // 다운캐스팅
            Dog dog2 = (Dog) animal2;

            dog2.speak();
            dog2.wagTail();
        }

        Animal animal3 = new Animal();
        System.out.println("animal3 검증");
        if(animal3 instanceof Dog) {    // false
            Dog dog3 = (Dog) animal3;

            dog3.speak();
            dog3.wagTail();
        } else {
            System.out.println("animal3는 Dog 클래스의 인스턴스가 아님");
        }
    }
}
