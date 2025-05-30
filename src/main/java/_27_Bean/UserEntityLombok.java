package _27_Bean;

import lombok.*;

@ToString
@Getter
@Setter
// @RequiredArgsConstructor에 무조건 들어가는 필드를 지정하려면 final 주면 됨
// 그러면 @NoArgsConstructor는 못쓰게 됨. (무조건 하나는 있어야 하니까)
// @NoArgsConstructor
// @AllArgsConstructor
// @RequiredArgsConstructor
public class UserEntityLombok {
    // Entity는 Bean인가? ㄴㄴ
    // Bean은 객체의 구조를 짜놓은 것
    // Entity는 db의 테이블과 1:1로 매칭시켜놓은 것
    // 그렇다면, Entity는 Bean이 될 수도 있고, 안될 수도 있다.
    // Bean의 조건 : private 필드, 기본 생성자, getter/setter
    private int userId; // final
    @NonNull
    private String userName;
    private int age;
    private String email;
}
// Entity
// 데이터베이스의 테이블과 1:1 매핑되는 클래스
// 자바 객체 <=> DB 테이블 간 데이터를 매핑하기 위해 사용
// DB와 CRUD 작업

// Lombok
// 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리(도구상자)
// getter, setter, toString, 생성자, Builder 등등
