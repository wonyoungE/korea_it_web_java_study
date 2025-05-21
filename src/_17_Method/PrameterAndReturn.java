package _17_Method;

public class PrameterAndReturn {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }

    private static int getStrLength(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        int power = getPower(3);
        System.out.println(power);

        int powerByExp = getPowerByExp(2, 4);
        System.out.println(powerByExp);

        // 문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력하는 메서드
        System.out.println(getStrLength("안녕하세요 반갑습니다."));
    }

}
