package _09_For;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        // for(선언; 조건; 증감) {
        //      반복될 코드
        // }

//        for(int i = 0; i < 10; i++) {
//            // i가 0부터 9까지
//            System.out.println("안녕" + i);
//        }
//
//        for(int i = 0; i < 50; i++) {
//            System.out.println("ㅎㅇ" + i);
//        }

        // 1~10중에서 짝수만 출력
        // 1)
//        for (int i = 1; i <= 10; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        // 2)
//        for(int i = 2; i <= 10; i += 2) {
//            System.out.println(i);
//        }

        // 10부터 1까지 거꾸로 출력
//        for(int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

        // 문제 -> 1부터 100까지 다 더한 값을 출력하시오
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}