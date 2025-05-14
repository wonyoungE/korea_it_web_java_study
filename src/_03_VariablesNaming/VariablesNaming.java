package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
        // 변수명 짓는 법
        /*
            1. 저장되는 데이터에 어울리는 이름, 직관적이고 한 눈에 파악하기 쉬운 이름
            2. 밑줄(_), 문자, 숫자 사용 가능, 단 숫자가 맨 앞에 올 수 없다.
            3. 한 단어 또는 2개 이상 단어를 연속
            4. 소문자로 시작, 두번째 단어부터는 시작 글자 대문자 (카멜 표기법)
                * 파스칼 표기법(쌍봉낙타 표기법) ex) LastName => 클래스명, 파일명
                * 카멜 표기법(단봉낙타 표기법) ex) lastName => 변수명, 메소드명
            5. 예약어 사용 불가(public, static, void, int, float, ...)
         */

        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carColor = "white";
        int carPassengerCapacity = 5; // 최대 탑승 인원
        int carModelYear = 2025;    // 연식

        // 상수 - final : 절대 변하지 않는 데이터 => 상수명은 다 대문자(_로 단어 구별)
        final String COUNTRY_CODE = "KR";
    }
}
