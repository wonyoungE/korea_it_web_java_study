package _35_Lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        // 람다식은 Calculator 객체의 calculate 메서드를 오버라이딩한 것
        // Calculator 객체를 익명 클래스로 생성, 각 인스턴스의 calculate 메서드는 다른 기능 수행중!!
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 2 = " + operate(2, 2, add));
        // => (2, 2) -> 2 + 2
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));

        // 명시적인 람다식
        // 람다식에서도 구현부가 여러줄일 수 있음 -> 인터페이스의 메서드가 하나일 때
        Calculator div2 = (x, y) -> {
            if(y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };

        // 근데 왜 굳이 이렇게 해야됨..? div2.calculate(2, 0) 하면 안되나;;
        System.out.println("2 / 0 = " + operate(2, 0, div2));
        System.out.println("2 / 0 = " + div2.calculate(2,0));

        // 익명 클래스 -> 메서드가 두 개 이상일 경우.. 람다 불가능
        // => 메서드가 여러개면 익명 클래스를 사용할 수 밖에 없음..
        Calculator div3 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        };
    }
}
