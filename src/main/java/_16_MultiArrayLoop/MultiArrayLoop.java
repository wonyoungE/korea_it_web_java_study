package _16_MultiArrayLoop;

public class MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // seats[0] => {"A1", "A2", "A3", "A4", "A5"}
        // seats[0].length => 5
        // seats[1] => {"B1", "B2", "B3", "B4", "B5"}
        // seats[1].length => 5

//        for (int i = 0; i < seats.length; i++) {
//            for (int j = 0; j < seats[0].length; j++) {
//                System.out.print(seats[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 향상된 for문
        for(String[] seatsArray : seats) {
            for(String seat : seatsArray) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }

        String[][] imaxSeats = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[0].length; j++) {
                imaxSeats[i][j] = eng[i] + (j + 1);
            }
        }

        for(String[] seatsArray : imaxSeats) {
            for(String seat : seatsArray) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }

        // 숙제
        // 다차원 배열 합 구하기
        // 3x3크기 1부터 홀수만 차례대로 대입하고 출력해서 확인
        // 그 수들의 합 구하기
        // 1 3 5
        // 7 9 11
        // 13 15 17

        // 1) 3x3 크기 2차원 배열 생성
        int[][] oddMultiArray = new int[3][3];
        // 2) 홀수만 차례대로 대입
        for (int i = 0; i < oddMultiArray.length; i++) {
            for (int j = 0; j < oddMultiArray[0].length; j++) {
                oddMultiArray[i][j] = (6 * i) + (2 * j) + 1;
            }
        }

        // 3) 대입한 값 확인
        for(int[] row : oddMultiArray) {
            for(int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // 4) 수들의 합 구하기
        int sum = 0;
        for(int[] row : oddMultiArray) {
            for(int column : row) {
                sum += column;
            }
        }
        System.out.println("수들의 합: " + sum);
    }
}