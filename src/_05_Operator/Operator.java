package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        // 연산자

        // 대입 연산자 =
        int num1 = 10;
        int num2 = 5;
        // 여기서 =은 해당 변수에 데이터(값)을 대입한다는 의미
        // 수학적인 같다(=)라는 의미가 아님

        // 산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);    // 몫
        System.out.println(num1 % num2);    // 나머지

        // 복합 대입 연산자
        num1 += 5;  // num1 = num1 + 5;
        System.out.println(num1);   // 15
        num1 -= 5;  // num1 = num1 - 5;
        System.out.println(num1);   // 10
        num1 *= 2;  // num1 = num1 * 2;
        System.out.println(num1);   // 20
        num1 /= 2;  // num1 = num1 / 2;
        System.out.println(num1);   // 10
        num1 %= 3;  // num1 = num1 % 3;
        System.out.println(num1);   // 1

        // 증감 연산자
        int j = 10;
        System.out.println(j);   // 10
        // 실행 후 증가
        System.out.println(j++); // 10
        System.out.println(j);   // 11
        // 실행 후 감소
        System.out.println(j--); // 11
        System.out.println(j);   // 10
        // 실행 전 증가
        System.out.println(++j); // 11
        // 실행 전 감소
        System.out.println(--j); // 10

        // 비교 연산자 => 결과가 boolean형 true/false 中 1개 반환
        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2);   // true
        System.out.println(num1 >= num2);   // true
        System.out.println(num1 < num2);   // false
        System.out.println(num1 <= num2);   // false
        System.out.println(num1 == num2);   // false
        System.out.println(num1 != num2);   // true

        // 논리 연산자 (&, |, !)
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); // and 논리곱 -> 하나라도 false가 있으면 false = 둘 다 true일 때 true
        System.out.println(flag1 | flag2); // or 논리합 -> 하나라도 true가 있으면 true = 둘 다 false일 때 빼고 true
        System.out.println(!flag1); // not 부정

        // 논리 연산자 조합 (&&, ||)
        // && -> 선조건이 true일 때만 후조건 실행, 선조건이 false이면 후조건 실행 안함!
        //      => 결과가 false가 많이 나오는 조건을 앞에 두면 성능이 향상되는가?
        //      => 불필요한 함수 호출 / 연산을 줄일 수 있다.
        //      => 앞의 조건이 연산 비용이 낮고, 뒤 조건이 비용이 높다면 false가 자주 나오는 조건을 앞에 두는 게 훨씬 유리.
        // || -> 선조건이 true이면 후조건 실행 안함, 선조건이 false일 때만 후조건 실행
        // 왜냐? ||은 둘 중 하나만 true이면 true가 반환되기 때문에
        // 선조건이 false여도 후조건이 true인지 확인하기 위해서 후조건도 실행
        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2);

        // 삼항 연산자
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);
        int min = (x < y) ? x : y;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String sameStr = (x != y) ? "다름" : "같음";
        System.out.println(sameStr);

        /*
            Q. int height = 숫자;
            키가 120이상인 경우 탑승 가능하도록 하는 삼항 연산자
            가능하면 "탑승 가능" 불가능하면 "탑승 불가능"
         */
        int height = 115;
        System.out.println(height >= 120 ? "탑승 가능" : "탑승 불가능");


    }
}
