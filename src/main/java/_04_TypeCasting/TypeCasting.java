package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        // 정수 -> 실수
        int scoreInt = 98;
        System.out.println(scoreInt);   // 98
        System.out.println((float)scoreInt);    // 98.0
        System.out.println((double)scoreInt);    // 98.0

        // 실수 -> 정수
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);     // 97.5
        System.out.println((int)scoreFloat);    // 97

        double scoreDouble = 88.5;
        System.out.println((int)scoreDouble);   // 88.5

        double sum1 = 98 + 77.3;    // 98 앞에 (double)이 생략되어있는 것
        System.out.println(sum1);   // 175.3

        int sum2 = 98 + (int)55.3f;
        System.out.println(sum2);   // 153

        // double -> float -> long -> int (수동 형변환)
        // 왼쪽으로 갈수록 더 자세한 숫자 표현 가능
        // 그렇기 때문에 왼쪽에 있는 자료형을 오른쪽에 있는 자료형으로 변환할 경우 일부분 생략된다.
        // 생략되기 때문에 수동으로 형변환 해줘야함
        int convertedScoreInt = (int)scoreDouble;
        System.out.println(convertedScoreInt);

        // int -> long -> float -> double (자동 형변환)
        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);

        // 숫자 -> 문자열

        // int -> 문자열
        String strNum1 = String.valueOf(123); // 첫번째 방법
        strNum1 = Integer.toString(123);      // 두번째 방법
        strNum1 = "" + 123;                     // 세번째 방법
        System.out.println(strNum1);

        // double -> 문자열
        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        // float -> 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        // 문자열 -> 숫자
        // ex) "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);
        double d = Double.parseDouble("123.45");
        System.out.println(d);

//      i = Integer.parseInt("숫자"); 불가능
    }
}
