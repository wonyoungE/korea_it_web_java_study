package _29_Builder;

public class MemberMain {
    public static void main(String[] args) {
        // Member 클래스의 Builder() 메서드 -> static 메서드라 객체 생성하지 않아도 사용 가능
        Member member = new Member.Builder()
                .email("error071312@gmail.com")
                .name("손원영")
                .age(26)
                .build();

        // Builder를 사용했을 때 이점
        // 1. 가독성이 높아짐
        // 2. 매개 변수의 순서를 지키지 않아도 된다.
        // 3. 유지보수성 향상 => 필드 추가 변경에 용이
        //
    }
}
