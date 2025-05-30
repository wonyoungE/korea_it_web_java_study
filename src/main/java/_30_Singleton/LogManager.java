package _30_Singleton;

public class LogManager {
    // 시스템 전체에서 로그를 기록하는 객체인데, 하나만 있으면 됨
    // 같은 로그 객체를 공유

    // Singleton(싱글톤)
    // 애플리케이션 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
    // 자원 공유해야할 때 => 설정 파일
    // 객체를 여러 번 만들 필요가 없고 한 번만 만들고 재사용하는 경우에 사용
    private static LogManager instance; // 자기 자신의 객체를 담음
    // 객체를 담을 수 있다 == static이라서 가능(클래스 수준이라서)
    private int count;

    // 생성자를 private로 막아서 외부에서 new 생성자()로 인스턴스 생성 금지 시킴
    // 왜냐? 싱글톤에서는 무조건 getInstance()로 인스턴스를 생성할거기 때문에.
    private LogManager() { };

    // static 메서드이기 때문에 객체 생성 하지 않아도 클래스 수준에서 getInstance() 사용 가능
    // LogManager 인스턴스를 생성할 때 => getInstance()만 사용해야 됨
    // 그러려면 외부에서 new 생성자()로 인스턴스 생성 못하게 private로 걸려있어야 함
    // instance에는 LogManager 객체가 들어가는데
    // 이 instance 변수가 null이면 new로 인터페이스를 새로 생성하고, 아닐 경우에는 instance를 그대로 반환함으로써
    // 새로운 인스턴스가 생성되지 않고 같은 인스턴스를 가지게 되는 것임
    public static LogManager getInstance() {
        if(instance == null) {  // 인스턴스가 생성되지 않았다면.
            System.out.println("생성된 인스턴스가 없어서 새로 생성");
            instance = new LogManager(); // new 생성자 통해 객체 생성
            return instance;
        }
        // 생성된 인스턴스가 있다면 생성되어있는 instance 반환
        System.out.println("생성되어있는 인스턴스가 있어서 그대로 반환");
        return instance;
    }

    public void log(String msg) {
        System.out.println("LOG => " + msg);
    }

    public void countLog() {
        count += 1;
        System.out.println("LOG => " + count);
    }
}
