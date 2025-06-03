package _32_Collections.strMap;

import java.util.*;

public class StrMap {
    // Map - 키(key) / 값(value)의 쌍으로 이루어진 데이터들의 집합
    // 키는 중복될 수 없다, value는 중복 가능, 순서 없음

    public static void main(String[] args) {
        // Map<Key, Value>
        Map<String, String> strMap1 = new HashMap<>();

        // Map에 Key-Value 쌍으로 삽입 -> .put(키, 값)
        strMap1.put("kor2025713", "손원영");
        strMap1.put("kor2025714", "손원일");
        strMap1.put("kor2025715", "손원이");
        strMap1.put("kor2025716", "손원삼");
        strMap1.put("kor2025717", "손원사");

        // 출력
        System.out.println(strMap1);

        // Map의 순회
        // Map은 직접적으로 순회할 수 없다 => 직접 for-each 돌릴 수 없음
        // 순회하기 위해서는 Iterable<?> 인터페이스를 구현한 클래스이거나 배열(T[])것들만 가능
        // Collection은 Iterable 인터페이스를 상속받음 (iterable은 반복이 가능하게 하는 인터페이스) => List, Set
        // 근데 Map은 Collection 아님, 그래서 순회 불가
        // 그럼에도 순회하고 싶으면?
        System.out.println(strMap1.entrySet()); // 키 값 전체를 set 형태로 반환
        System.out.println(strMap1.keySet());   // 키만 set 형태로 반환

        // keySet() 이용했을 때
        for(String key : strMap1.keySet()) {
            System.out.println("키: " + key + " 값: " + strMap1.get(key));
        }

        // entrySet()을 이용했을 때 => 키랑 값 둘 다 가져오기 때문에 둘 다 넣어줄 곳이 필요
        // Map.Entry<K, V>
        for(Map.Entry<String, String> entry : strMap1.entrySet()) {
            System.out.println("키: " + entry.getKey() + " 값: " + entry.getValue());
        }
        // entrySet을 이용하게 되면 키 값 전체 내용이 set형태로 오는데 keySet처럼 한 가지만 String으로 들어가는 게 아님
        // 그래서 키,값 형태를 받아줄 수 있는 Map.Entry<K, V>에 넣어야 함.
        // Map.Entry는 Map에 들어가는 데이터의 형식인 키 값 형태인 것임

        // 수정 또는 추가
        // 이미 있는 키라면 해당 키의 값 수정
        // 없는 키라면 키, 값 추가
        strMap1.put("kor2025717", "손원칠");
//        System.out.println(strMap1);

        // 특정 키의 조회
        System.out.println(strMap1.get("kor2025716"));
        // Map에는 인덱스가 없음(=순서 없음) -> 키로 접근해서 값을 출력

        // 특정 key의 존재 여부
        boolean isContain1 = strMap1.containsKey("kor2025716");
        System.out.println("kor2025716의 존재 여부 : " + isContain1);

        // 특정 value의 존재 여부
        boolean isContains2 = strMap1.containsValue("손원삼");
        System.out.println("손원삼의 존재 여부 : " + isContains2);

        // Map => Set
        // Map을 담으려면 키, 밸류 모두를 받아야함 => Map.Entry<K, V>
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        System.out.println(entrySet2.size());   // 5, 키.밸류 한 쌍을 하나의 element로 봄
        System.out.println(entrySet2);

        // Map => List (set 거쳐서)
        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
        // map -> 컬렉션 아님
        // set, list -> 컬렉션임, addAll로 서로 요소 넣었다 뺐다 할 수 있음
        entryList1.addAll(entrySet2);
        // Map은 Collection이 아니기 때문에 Set을 거쳐서 넣는다.
        System.out.println(entryList1);

        // Map 정렬 => 사실은 불가능
        // Map은 빠른 탐색 및 검색을 위해서 만들어진(설계된) 형태
        // 정렬은 고려하지 않고 만듦 => 그래서 순서를 보장하지 않음
        // 그럼에도 정렬을 하고 싶다면?
        Collections.sort(entryList1, Map.Entry.comparingByValue()); // 값 기준 정렬
        System.out.println("값 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey()); // 키 기준 정렬
        System.out.println("키 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("키 기준 역순 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("값 기준 역순 정렬 : " + entryList1);

        // keySet 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
    }
}
