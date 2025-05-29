package _25_Casting.Control;

public class SmartPhone implements Power {
    @Override
    public void on() {
        System.out.println("스마트폰 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스마트폰 전원을 끕니다.");
    }

    public void alarm() {
        System.out.println("스마트폰이 알람을 울립니다.");
    }
}
