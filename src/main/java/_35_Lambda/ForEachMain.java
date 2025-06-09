package _35_Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리", "바나나", "참외");

//        for(String fruit : fruits) {
//            System.out.println(fruit);
//        }
        // forEach(Consumer) -> Consumer는 매개변수 받기만 하고 반환 값은 없음
        //
        fruits.forEach(fruit -> System.out.println(fruit));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.println(n * 2));
    }
}
