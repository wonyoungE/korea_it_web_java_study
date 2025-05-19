package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 네모 별 찍기
        // *****
        // *****
        // *****
        // *****
        // *****
//        for (int i = 0; i < 5; i++) {       // 행
//            for (int j = 0; j < 5; j++) {   // 열
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 별 삼각형 찍기
        // *
        // **
        // ***
        // ****
        // *****
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++) {
            for(int k = 0; k < 4 - i; k++) {
                System.out.print("S");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
