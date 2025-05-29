package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student std = new Student("손원영", 26, "error071312@gmail.com", "경상남도..");
        // 사용자는 메서드 안의 내용은 모르고 그냥 메서드 사용만 하면 되므로 '추상화'
        std.showInfo(); // 이름 : 손원영 나이 : 26 이메일 : error071312@gmail.com 주소 : 경상남도..

        // setter를 이용해서 객체의 필드 값 수정
        std.setName("손원일");
        std.showInfo(); // 이름 : 손원일 나이 : 26 이메일 : error071312@gmail.com 주소 : 경상남도..

//        System.out.println(std.name);   -> std 객체의 name 필드가 private이기 때문에(같은 클래스 내에서 부르는 것이 아니기 때문에) 오류
        System.out.println(std.getName());  // getter() 메서드를 거쳐서 값을 가져옴

        // setter(), getter()을 사용하게 되면 OOP의 4가지 원칙 중 하나인 캡슐화를 이루는 것임.
        // 직접 접근을 막아서 안정성을 높이게 되므로.
    }
}