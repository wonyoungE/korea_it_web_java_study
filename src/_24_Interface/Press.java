package _24_Interface;

public interface Press {
    // interface 인터페이스는 기능(메서드)의 명세(규칙, 약속)만 정의하는 틀
    // 모든 변수는 public static final(상수) => 멤버 변수 앞에 안써줘도 된다.
//  /*public static final*/ String NAME = "button";
    // 객체 생성 불가 (=생성자 없음)
    // 기능 중심 설계를 하고 싶을 때
    // 여러 클래스에서 같은 행동(메서드)을 다르게 구현하고 싶을 때

    // 리모컨을 보면 여러 기능을 하는 버튼이 있음
    // ex) 채널 변경, 음량 조절, 외부입력, .. 등등 버튼이 눌리면(=onPressed) 실행되어야 할 기능이 다르기 때문에 ..
    // 추상 메서드처럼 구현은 x
    /*abstract*/ void onPressed();  // 추상 메서드인 상태
    
    // interface up, down 만들기
    
    // 추상 클래스 vs 인터페이스
    // 추상 클래스는 하나만 상속 가능, 인터페이스는 다중 상속 가능
}
