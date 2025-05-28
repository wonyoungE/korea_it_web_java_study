package _25_Casting.Control;

public class TV implements Power {
    @Override
    public void on() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("TV 전원을 끕니다.");
    }

    public void channelUp() {
        System.out.println("TV 채널을 올립니다.");
    }
}
