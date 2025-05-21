package _17_Method;

public class Parameter {
    public static void power(int number) {
        // 거듭제곱을 하는 메서드
        // 매개변수를 전달받아서 해당 매개변수를 거듭제곱
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }

    public static void main(String[] args) {
        // Parameter
        // 매개변수, 전달값
        int num = 4;
        power(num);
        powerByExp(2, 4);
    }
}
