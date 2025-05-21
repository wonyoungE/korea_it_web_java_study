package _14_Array;

import java.util.Arrays;
import java.util.Comparator;

public class Array03 {
    public static void main(String[] args) {
        Integer[] nums = {8, 4, 5, 1, 7, 10, 6, 2, 9, 3};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // 오름차순 정렬 => 따로 대입하지 않음
        // nums 변수의 값 자체를 정렬
        System.out.println(Arrays.toString(nums));

        // 내림차순
        Arrays.sort(nums, Comparator.reverseOrder());
        // int는 원시적인 자료형 => primitive type
        // Integer는 클래스로 이루어져있고 Wrapper Class
        // 같은 정수지만 int는 계산만 가능한 반면
        // Integer는 다양한 기능을 사용할 수 있다.
        // double - Double
        // float - Float
        // long - Long
    }
}
