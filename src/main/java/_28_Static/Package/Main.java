package _28_Static.Package;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("손원영");
        Person person2 = new Person("김민규");

        // sayHello() => 객체를 생성해야만 호출할 수 있는 인스턴스 메서드
        person1.sayHello();
        person2.sayHello();

        // 클래스 메서드(static)
        Person.showPopulation();
    }
}

// 간단하게
// static 있음 => 객체 생성 안해도 접근 가능
// static 없음 => 객체 생성해야 접근 가능
