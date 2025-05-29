package _14_Array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 순회

        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};
        // 반복문 for문을 통해 배열 순회
//        for (int i = 0; i < 5; i++) {
//            System.out.println(countries[i]);
//        }
//
//        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i]);
//        }

        // enhanced for (for-each) 향상된 for문
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
