package _35_Lambda;

import javax.print.attribute.IntegerSyntax;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

// 람다식(Lambda Expression)
// Java 8에서 도입된 '함수형 프로그래밍'을 지원하기 위한 표현식
// 익명 클래스를 사용해 함수처럼 동작하는 코드
// => 익명 함수
// 익명 클래스 : 추상 클래스를 바탕으로 자식 클래스를 잠깐 만들어서 그 자식의 객체를 만든 것
// 람다식은 "함수형 인터페이스" (Functional Interface) 에서만 사용 가능
public class Main {
    public static void main(String[] args) {
        // 객체 생성자 안에서 오버라이드중..
        // Runnable => 할 일 목록, run()메서드 밖에 없음
        Runnable job1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 방식");
            }
        };
        job1.run();

        // ()안에 매개변수, -> 오른쪽은 실행되어야할..
        Runnable job2 = () -> System.out.println("람다 방식");
        job2.run();

        // 람다식 등장 배경
        // 람다식이 나오기 전에는 함수형 프로그래밍을 하기 위해 익명 클래스를 주로 사용
        // 익명 클래스 방식은 코드가 길어지고 불필요한 반복이 많아질 수 있어서 가독성이 저하됨

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1에 .compareTo이니까 Integer 클래스의 메서드임
                return o1.compareTo(o2);
            }
            // 두 객체 중 만약 앞의 객체가 더 작다면 음수, 같다면 0, 크다면 양수
            // 그니까 o1-o2라고 생각하면 됨
        };

        System.out.println(comparator.compare(10, 20)); // -1

        Comparator<Integer> comparator1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator1.compare(20, 10));    // 1

        // 람다식의 장점
        // 코드 간결화
        // 표현력 향상

        // 람다식의 단점
        // 디버깅의 어려움
        // 재사용성 낮음 - 실행 코드가 여러줄로 늘어났을 때 결국 익명 클래스가 되어야 함..

        // 람다식은 함수형 인터페이스에서만 사용 가능
        // 인터페이스 -> 메서드 오버라이딩 무조건
        // 주요 함수형 인터페이스 - 메서드가 하나만 있는 인터페이스
        // Supplier - T get();
        // 매개변수 없이 값을 반환하는 인터페이스, 단순히 값을 '공급'하는 역할
        // Consumer - void accept(T t);
        // 값을 매개변수로 받아서 사용하고, 아무것도 반환하지 않는 인터페이스, 데이터를 '소비'하는 역할
        // Function<T, R> - R apply(T t);
        // 하나의 매개변수를 받아서 연산을 수행한 후 결과를 return
        // T는 매개변수 타입, R은 반환 타입
        // Predicate - boolean test(T t);
        // 하나의 매개변수를 받아서 특정 조건 검사 후 true/false을 return

        // 1. supplier - 데이터 공급
        Supplier<String> stringSupplier = () -> "Hello, World";

        // 2. consumer - 데이터 소비
        Consumer<String> stringConsumer = (msg) -> System.out.println("메시지: " + msg);

        stringConsumer.accept(stringSupplier.get());
    }
    // 익명 클래스 -> 즉석에서 해당 클래스나 인터페이스의 메서드를 재정의해서 사용
    // ------ 메서드가 하나 혹은 그 이상
    // 람다식 -> 메서드가 하나만 있는 인터페이스를 재정의해서 사용할 때 표현식
    // () -> 한 줄 실행 코드;
    // () -> {
    //      여러 줄 실행 코드;
    // }
}
