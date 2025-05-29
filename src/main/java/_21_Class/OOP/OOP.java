package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
        // OOP : Object Oriented Programming
        // 객체 지향 프로그래밍
        // - 현실 세계의 개념을 코드로 표현
        // - 사람, 동물, 자동차 등을 하나의 객체로 보는 것
        // - 상태(속성)과 동작(기능)을 중심으로 프로그래밍
        // - 속성 = 필드, 기능 = 메서드

        // *** OOP의 4가지 원칙 ***
        // 1) 추상화
        //    - 복잡한 내부 동작은 감추고 꼭 필요한 기능만 보여주는 것
        //    - 객체에 있는 메서드를 호출해서 사용하는 것 (메서드가 어떻게 돌아가는지 몰라도 호출만 하면 사용 가능)
        //    - ex) car.drive()
        // 2) 캡슐화
        //    - 데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높히는 것(정보 은닉)
        // 3) 상속
        // 4) 다형성

        Person person = new Person();
        System.out.println(person.name);    // name -> public, 접근 가능. 다른 패키지임에도 접근 가능
//      System.out.println(person.age);     // age -> protected, 접근 불가. 같은 패키지 또는 자식 클래스에서만 접근 가능
//      System.out.println(person.address);     // address -> default, 접근 불가. 같은 패키지 내에서만 접근 가능

    }
}
