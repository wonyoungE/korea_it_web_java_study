package _26_Objects;

public class Main {
    public static void main(String[] args) {
        // 모든 클래스는 Object 클래스를 상속받고 있다.
        Teacher teacher1 = new Teacher("손원영", "코리아IT");
        Teacher teacher2 = new Teacher("손원영", "코리아IT");

        System.out.println(teacher1);            // 뒤에 .toString() 숨어있음 이름 : 손원영 학교 : 코리아IT
        System.out.println(teacher1.toString()); // 이름 : 손원영 학교 : 코리아IT

        System.out.println(teacher1.hashCode());    // 468438711
        System.out.println(teacher2.hashCode());    // 468438711
        // equals가 성립되려면 내용 뿐만 아니라 hashCode도 같아야한다.
        // equals랑 hashCode는 짝지어다닌다. hashCode를 오버라이딩 해주려면 equals도 오버라이딩 해줘야한다.
        System.out.println(teacher1.equals(teacher2));
    }
}
