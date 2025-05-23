package _21_Class.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);    // name : public, 접근 가능.
        System.out.println(person.age);     // age : protected, 접근 가능. 같은 패키지 또는 자식 클래스
        System.out.println(person.address); // address : default, 접근 가능. 같은 패키지
//        System.out.println(person.id);      // id : private, 접근 불가능. 같은 클래스 내에서만.


    }
}
