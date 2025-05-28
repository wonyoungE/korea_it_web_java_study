package _25_Casting.Control;

public class LEDLight implements Power {
    @Override
    public void on() {
        System.out.println("전등을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("전등을 끕니다.");
    }

    public void changeColor() {
        System.out.println("전등의 색을 바꿉니다.");
    }
}