package _30_Singleton.AppConfig;

public class AppConfigMain {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();

        System.out.println(appConfig);  // AppConfig(apiKey=DEFAULT-KEY, appMode=PRODUCTION)
        appConfig.setApiKey("TEST-KEY-123");
        appConfig.setAppMode("DEBUG");
        System.out.println(appConfig);  // AppConfig(apiKey=TEST-KEY-123, appMode=DEBUG)

        // 사실 새로운 객체를 생성한 게 아님
        AppConfig appConfigAnother = AppConfig.getInstance();
        System.out.println(appConfigAnother);   // AppConfig(apiKey=TEST-KEY-123, appMode=DEBUG)
        System.out.println(appConfig == appConfigAnother);  // true
    }
}
