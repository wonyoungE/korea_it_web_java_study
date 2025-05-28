package _25_Casting.Animal;

public class Main {
    public static void main(String[] args) {
        // UpCasting
        // 자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것
        // 즉, 자식 클래스의 인스턴스(=객체)를 부모 클래스 타입의 변수에 저장하는 것
        // Java에서의 업캐스팅은 다형성을 구현하는 핵심 개념 **
        Dog dog = new Dog();
        dog.speak();
        dog.wagTail();

        // 업캐스팅(자식 => 부모), 형변환 명시 안해도 됨
        // Animal 타입을 참조
        // 방법 1 A a = new B();
        Animal animal = new Dog();
        // animal은 Animal 타입이지만 내부적으로는 Dog의 객체가 들어있다.
        animal.speak();     // 동적 바인딩, 호출되었을 때 자식 클래스 먼저 훑고 오버라이드된 메서드 호출
//      animal.wagTail();   // 불가능, 부모 클래스를 참조하기 때문에 자식 클래스에만 있는 메서드는 호출 불가

        // 곧 죽어도 Dog 클래스의 wagTail() 메서드를 써야겠다;;
        // 어떻게? => 다운캐스팅 ((B)a).method()

        // 다운캐스팅 방법1 (부모 => 자식) 형변환 명시 해야함
        ((Dog)animal).wagTail();    // 일시적 형변환

        // 업케스팅 방법2 부모 클래스 타입에 자식 클래스 대입
        Animal animal2 = dog;
        animal2.speak();

        // 다운캐스팅 방법2 새로운 변수에 다운캐스팅한 객체 대입
        Dog d = (Dog) animal2;
        d.wagTail();

        // 다양한 자식들을 하나의 클래스 타입으로 처리할 수 있음

        // 얘는 어차피 다 Dog 타입의 객체이므로 Dog[] 배열에 넣을 수 있음
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog[] dogs = {dog1, dog2, dog3};

        // 하나의 배열에 여러 타입의 객체를 넣고싶다면?
        // 각각 객체의 공통점을 가지고 부모 클래스를 만들고 상속받아 자식 클래스를 만들어 객체를 생성하게 되면
        // 부모 클래스로 업캐스팅해 부모 클래스 배열에 넣을 수 있다.
        Animal dog4 = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();
        Animal[] animals = {dog4, cat, tiger};

        for(Animal a : animals) {
            a.speak();
        }
        /* 실행 결과
            멍멍
            야옹
            어흥
         */


    }
}
