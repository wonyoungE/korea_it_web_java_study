package _24_Interface;

public class PowerButton extends Button {
    private boolean status;

    // Button 클래스의 추상 메서드 onPressed 재정의 <- 필수
    @Override
    public void onPressed() {
        if(status) {    // status = true;
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
