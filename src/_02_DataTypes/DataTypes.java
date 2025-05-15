package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello");    // 문자열
        System.out.println(123);    // 정수
        System.out.println("123");  // 문자열

        // 변수 : 코드의 재사용성을 높이고, 유지보수가 용이해지도록 한다.
        // 자료형 변수명 = 데이터;

        // 정수 - int, long
        int num = 123;
        int num1;   // 변수명만 선언해둔 상태 (= 초기화하지 않은 상태)
        num1 = 234; // 초기화
        num1 = 456;
        System.out.println("num1은 : " + num1);

        long l = 10_000_000_000_000L;   // 값 맨 끝에 L 써줘야 long으로 인식, _ -> 값에는 영향 안 줌
        System.out.println("l은 : " + l);


        // 실수 - float, double (double이 float보다 소수점 자리수 더 많이 표현 가능)
        float f = 3.14F;
        double d = 3.1415921234;
        // 부동소수점의 오류

        // 문자 - char
        char a = 'a'; // '' -> 문자, "" -> 문자열
        char b = 'b';
        System.out.println(a + b); // 195
        System.out.println("" + a + b); // ab  연산에 문자열이 있으면 문자열로 인식한다.

        // 문자열 - String (다른 자료형과 다르게 대문자로 시작, 자료형이 아닌 클래스이다.)
        String str = "안녕하세요";
        System.out.println(str);

        // 논리 자료형 - boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;
        System.out.println(isEmpty);

        /*
        * 제 이름은 *** 입니다. 제 나이는 **살이고
        * 취미는 ***입니다.
        * */
        String name = "손원영";
        int age = 26;
        String hobby = "음악 감상";
        String mbti = "ISTP";

        System.out.println("제 이름은 " + name + "입니다. 제 나이는 " + age + "살이고\n취미는 " + hobby + "입니다.");
        System.out.println("제 MBTI는 " + mbti + "입니다.");


    }
}
