package _23_Abstraction;

public class PhoneFactory extends Factory {

    public PhoneFactory(String name) {
        super(name);
    }

    // 추상 클래스를 상속받으면 반드시 재정의(Override) 해주어야 한다.
    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장을 관리합니다.");
    }
}
