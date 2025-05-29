package _21_Class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String addr;

    // private일 때 값을 넣는 방법
    // 단축어 Alt+Insert
    // 1. 생성자
    // 2. setter

    // 1. 생성자
    // 객체를 생성할 때 값을 넣어주기 때문에 수정은 안된다.
    // public이 붙는 이유? Class 자체가 public이기 때문에 생성자도 public이 붙는다.
    public Student(String name, int age, String email, String addr) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.addr = addr;
    }

    // 2. setter() -> 값을 넣기, 수정하기
    // setter로 접근하게 되면 setter 메서드를 통해서 setter 메서드 안에서 private 필드에 접근하는 것이기 때문에 가능.
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    // private 걸려있는 필드 값을 다른 클래스에서 어떻게 접근을 하는가?
    // getter()
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddr() {
        return addr;
    }

    public void showInfo() {
        System.out.println("이름 : " + name + " 나이 : " + age + " 이메일 : " + email + " 주소 : " + addr);
    }
}
