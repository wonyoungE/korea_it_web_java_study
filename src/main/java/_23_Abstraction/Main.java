package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플");
        phoneFactory.setName("삼성");
        phoneFactory.produce("아이폰16");
        phoneFactory.manage();
        phoneFactory.displayInfo();

        // 추상 클래스는 객체를 생성할 수 없음, 근데 이름없는 자식을 잠..깐 생성할 수 있다
        // 익명 클래스 : 추상 클래스를 바탕으로 자식 클래스를 잠깐 만들어서 그 자식의 객체를 만든 것
        // 잠깐의 의미가 뭐임? 그럼 얘는 언제까지 살아있는거임
        Factory factory = new Factory("노키아") {
            @Override
            public void produce(String model) {
                System.out.println(getName() + "잠깐 만들어진 익명 클래스가 무언가를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("잠깐 만들어진 익명 클래스가 공장을 관리합니다.");
            }
        };
        factory.manage();
        factory.produce("스마트폰");
        // 익명 클래스 => 추상 클래스의 객체처럼 보이지만 자식 클래스를 즉석에서 임시로 만들어서
        // 그 자식 클래스의 객체를 생성한 것
        // 재사용하지 않고 한 번만 쓰고 버릴 거라면 익명 클래스 사용
        // 즉, 임시로 만들어진 이름없는 자식 클래스 == 익명 클래스
        // 그러므로 추상 클래스의 객체가 만들어진 것이 아니기 때문에 추상 클래스의 개념에 위배되는 것은 아님

        TabletFactory tabletFactory = new TabletFactory("애플");
        tabletFactory.produce("아이패드 에어 4세대");
        tabletFactory.manage();
        tabletFactory.upgrade("아이패드 프로 3세대");
    }
}
