package _29_Builder;

public class Member {
    private String name;
    private int age;
    private String email;

    private Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // Member 내부에 선언된 정적 내부 클래스
    // Builder는 객체를 만들기 위한 준비 도구
    // 최종적으로 Builder의 build 메서드가 Member의 객체를 생성할 예정
    public static class Builder {
        private String name;
        private int age;
        private String email;

        // Builder의 클래스 객체의 멤버변수에 매개변수를 대입(setter 역할)
        // 자기 자신 객체를 반환 => 메소드 체이닝을 위해서
        // 메소드 체이닝 ?
        // 메소드를 연속해서 호출할 수 있도록 객체 자신을 반환하는 방식
        // ex) 객체.getClass().getSimpleName();
        public Builder name(String name) {
            this.name = name;
            return this;    // Builder 클래스 리턴
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        // 모든 필드 설정이 끝난 후 Member 객체의 생성자를 통해
        // Builder의 객체를 넣어줌
        public Member build() {
            return new Member(this);
        }
    }
}
