package _30_Singleton.AppConfig;

import lombok.Data;

// Getter, Setter, toString, EqualsAndHashCode, RequiredArgsConstructor
@Data   // 자주 쓰는 시그니처 패키지
public class AppConfig {
    // 인스턴스가 들어가있을 정적 변수
    // static이라 객체 생성 안해도 사용 가능
    private static AppConfig instance;
    private String apiKey;
    private String appMode;

    // AppConfig 클래스 내부에서는 사용 가능
    // private로 new 생성 막기
    private AppConfig() {
        this.apiKey = "DEFAULT-KEY";
        this.appMode = "PRODUCTION";
    }

    // 무조건 getInstance로 객체 생성
    public static AppConfig getInstance() {
        if(instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}
