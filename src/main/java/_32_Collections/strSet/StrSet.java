package _32_Collections.strSet;

import java.util.*;

/*
    List는 순서가 있고 중복 허용
    Set은 순서가 없고 중복 허용 안함
    수학에서의 집합 개념을 도입한 게 set이라고 생각하면 됨
    특성 차이 때문에 list -> set, set -> list 형변환하는 게 중요
    중복이 있는 list를 만들고 중복을 한 번 제거하기 위해서 set로 변환 후에 중복 제거를 할 수 있다
 */
public class StrSet {
    // Set - 중복을 허용하지 않는 데이터들의 집합 => HashSet, LinkedHashSet, TreeSet
    // 같은 값을 두 번 이상 저장할 수 없으며, 보통 고유한 값의 집합을 다룰 때 사용
    // HashSet - 순서가 없고 가장 빠른 성능
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("1");
        strSet1.add("1");
        strSet1.add("2");
        strSet1.add("3");
        strSet1.add("3");
        strSet1.add("3");
        strSet1.add("3");

        // 출력
        System.out.println(strSet1);    // [1, python, 2, java, 3]
        // 결과로 알 수 있는 것 -> 중복이 없고, 순서가 없다.

        for(String elem : strSet1) {
            System.out.println(elem);
        }

        // 순서가 없기 때문에 index로 접근 못 함. list처럼 get으로 접근 불가
//        for (int i = 0; i < strSet1.size(); i++) {
//            strSet1.get(i);
//        }

        // 특정 element 추출 -> list로 형변환
        strList1.addAll(strSet1);
        for (int i = 0; i < strList1.size(); i++) {
            System.out.println(strList1.get(i));
        }

        strList1.addAll(strSet1);
        strList1.addAll(strSet1);
        System.out.println("리스트에 중복이 추가된 후 : ");
        for (int i = 0; i < strList1.size(); i++) {
            System.out.println(strList1.get(i));
        }

        Collections.sort(strList1);
        System.out.println(strList1);

        Set<String> strSet2 = new HashSet<>();
        strSet2.addAll(strList1);
        System.out.println(strSet2);
    }
}
