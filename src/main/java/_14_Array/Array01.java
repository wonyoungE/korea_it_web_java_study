package _14_Array;

public class Array01 {
    public static void main(String[] args) {
        // 배열 -> 같은 자료형의 데이터를 여러 개 저장하는 연속된 공간
        // 고정된 크기

        String country1 = "Hungary";
        String country2 = "Croatia";
        String country3 = "Slovenia";
        String country4 = "Austria";
        String country5 = "Czech";

        // 배열 선언 첫번째 방법
//        String[] countries = new String[5];

        // 배열 선언 두번째 방법
//        String countries[] = new String[5];

//        countries[0] = "Hungary";
//        countries[1] = "Croatia";
//        countries[2] = "Slovenia";
//        countries[3] = "Austria";
//        countries[4] = "Czech";
//        countries[5] = "Korea";

//        System.out.println(countries);  // [Ljava.lang.String;@4c873330 : 주소

        // 배열 선언 세번째 방법
//        String[] countries = new String[] {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        // 배열 선언 네번째 방법
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        // 배열에서 수정
        countries[1] = "Swiss";
        System.out.println(countries[1]);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] doubles = {12.34, 23.45, 12.55};
        boolean[] booleans = {true, false, false, true};
    }
}
