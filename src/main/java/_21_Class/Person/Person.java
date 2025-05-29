package _21_Class.Person;

public class Person {
    public String name;
    protected int age;
    String address;     // default
    private String id;  // Person 클래스에서만 접근 가능

    // 접근 제어자 - 정보 은닉
    // OOP에서는 private를 많이 씀 ( 4가지 원칙 중에 캡슐화가 있기 때문에)
    // public       - 어디서든 접근 가능
    // default      - 같은 패키지 내에서만 접근 가능 (명시를 따로 하지 않으면 default)
    // protected    - 같은 패키지 또는 자식 클래스에서만 접근 가능
    // private      - 해당 클래스 내부에서만 접근 가능
}
