package _24_Interface;

// extends => 단일 상속 (클래스, 추상클래스)
// implements => 다중 상속 (인터페이스)
public abstract class Button implements Press, Up, Down{

    // 추상 메서드가 하나라도 있으면 그 클래스는 추상 메서드
    // 모든 버튼 클래스에서 무조건 재정의 해줄 메서드 => 버튼마다 오버라이드 해주라고 abstract 붙여줌
    @Override     // @ : 어노테이션, @ 뒤 : 시그니처
    public abstract void onPressed();

    // onUp, onDown : 특정 클래스에서만 사용할 메서드
    // 그렇기 때문에 abstract를 붙여서 추상 클래스로 만들어버리면
    // up클래스에서 onDown도 재정의해주어야하는 상황이 발생
    @Override
    public void onUp() {

    };

    @Override
    public void onDown() {

    };
}
