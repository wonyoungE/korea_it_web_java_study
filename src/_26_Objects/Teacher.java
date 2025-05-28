package _26_Objects;

import java.util.Objects;

public class Teacher {
    // 멤버 변수
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

    // public Teacher(String schoolName) 생성자는 생성이 안된다
    // 매개변수의 타입이 같고, 갯수까지 같아버려서

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // 모든 클래스는 기본적으로 Object 클래스를 상속받는다.
    // Teacher 클래스는 아무것도 상속받고 있지 않지만(extends 없음)
    // 오버라이드 목록에 java.lang.Object의 메서드들이 있음
    @Override
    public String toString() {
        return "이름 : " + this.name + " 학교 : " + this.schoolName;
    }

    // equals에서 내용물을 기준으로 같은지 묻는 것으로 오버라이딩 했으니
    // hashCode()도 내용물 기준으로 같은지 묻는 것으로 오버라이딩 해주어야 함.
    @Override
    public int hashCode() {
        // Objects.hash는 해시코드를 생성해주는 메서드
        // name과 schoolName을 기준으로 해시코드를 생성하므로 내용이 같으면 같은 해시코드
        return Objects.hash(name, schoolName);
    }

    @Override
    // 나는 객체의 내용만 같으면 같은 객체라고 하고 싶음.
    public boolean equals(Object obj) {
        // obj에는 나랑 같은 객체가 들어오는 경우   => teacher1.equals(teacher1)
        // 같은 클래스의 다른 객체가 들어오는 경우   => teacher1.equals(teacher2)
        // 아예 다른 클래스의 객체가 들어오는 경우 로 나뉜다.    => teacher1.equals(student)

        // teacher1.equals(teacher1)
        // 내가 나 자신이랑 비교하는지 묻는 조건문
        if(this == obj) {   // 메모리 참조 주소값이 같은지 물음
            return true;
        }

        // teacher1.equals(student)
        // teacher2가 Teacher의 인스턴스냐?
        // Teacher의 인스턴스가 아니라면 => 애초에 내용이 같을 수 없다.
        if(!(obj instanceof Teacher)) {
            return false;
        }

        // teacher1.equals(teacher2)
        // 같은 클래스의 다른 객체인 경우에는 다운 캐스팅해서 내용이 같은지 직접 확인
        // 다운 캐스팅 왜 해야하지;.. => 매개변수가 Object 객체로 들어왔기 때문에 Teacher 클래스로 다운캐스팅 해주어야 함
        // 모든 클래스는 Object 클래스 상속.
        Teacher teacher = (Teacher) obj;
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
    }
    // equals에서 같다고 판별된 객체는 같은 해시코드를 가져야 한다. 라고 자바에서 공식 규칙을 세웠음
    // 그래서 equals 오버라이딩 했으면 그 기준에 따라 hashCode도 오버라이딩 해주어야 함;;
}