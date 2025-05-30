package _30_Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("logManager1 생성");
        LogManager logManager1 = LogManager.getInstance();
        System.out.println("logManager2 생성");
        LogManager logManager2 = LogManager.getInstance();

        logManager1.log("첫 번째 로그 메시지");
        logManager2.log("두 번째 로그 메시지");

        // logManager1과 logManager2이 같은 객체인지 확인
        // 같은 객체라면 같은 메모리 주소 값 참조
        System.out.println(logManager1 == logManager2);

        logManager1.countLog();
        logManager2.countLog();
    }
}
