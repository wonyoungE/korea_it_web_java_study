package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student std = new Student();

        std.name = "손원영";
        std.age = 26;
        std.email = "seventeen17@gmail.com";
        std.addr = "경남 김해시";

        std.showInfo();
    }
}
