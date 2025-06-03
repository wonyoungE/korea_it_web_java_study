package _32_Collections.strList;

import java.sql.Array;
import java.util.*;

// Collection
// 여러 객체를 모아놓는 것
// List => 순서가 있는 데이터의 집합, 중복된 요소를 허락함
// ArrayList, LinkedList
public class StrList {
    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>();  // 방법 1
//        // element 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A");  // 중복 허용

        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "A"));  // 방법 2, List 생성과 동시에 값 넣기
        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

        String[] strArray = new String[] {
                "손원영", "손원일"
        };
        System.out.println(strArray);   // 메모리 참조 주소값 [Ljava.lang.String;@776ec8df
        System.out.println(Arrays.toString(strArray));  // [손원영, 손원일]

        // 출력
        System.out.println(strList1);   // [A, B, A]
        System.out.println(strList2);   // [java, python, C#, javascript, kotlin]

        // 특정 요소(E)가 포함되어 있는지 확인
        // => contains() 사용, return 타입 : boolean
        String searchElem1 = "python";
        boolean isContains1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함 여부: " + isContains1);    // true

        String searchElem2 = "py";
        boolean isContains2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함 여부 : " + isContains2);   // false -> 정확히 일치하는 요소가 있는지 확인

        String email = "test@gmail.com";    // String은 char가 이어져있는 것,
        boolean isContains3 = email.contains("@");  // 그렇기 때문에 문자열에서 한 글자만 포함하는지 검색해도 true 반환
        System.out.println("@의 포함 여부 : " + isContains3);    // true
        // String의 경우 char들이 '순서대로' 나열된 것이기 때문에 char 하나가 포함된 것을
        // contains()로 부분 검색이 가능하나
        // searchElem2의 경우는 element가 완전히 일치하는지를 확인하기 때문에
        // 위와 같은 결과(=false)가 나온다.

        // 특정 element 삭제 -> remove() -> return boolean
        // contains와 같이 요소와 완전히 같아야 삭제
        String removeElem1 = "kotlin";
        boolean removeResult = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부 : " + removeResult);
        System.out.println(strList2);   // [java, python, C#, javascript]

        // list의 정렬 -> 배열과 동일
        Collections.sort(strList2);     // 재대입 따로 안함. 원본 리스트 정렬 시킴
        System.out.println("정렬된 strList2 : " + strList2);   // 정렬된 strList2 : [C#, java, javascript, python]
        // 역순 정렬
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println("역순 정렬된 strList2 : " + strList2); // 역순 정렬된 strList2 : [python, javascript, java, C#]

        // 일반 for문 순회
        for(int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i) + " 언어");
        }
        // 향상된 for문
        for(String lang : strList2) {
            System.out.println(lang);
        }

        // Q. TodoList
        // 1. todoList를 담을 List 생성, Scanner 생성
        // 2. 사용자에게 todo를 입력받을 건데 몇 개 입력할 건지 count변수에 입력받기
        // 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        // 4. 향상된 for문 이용, todoList 출력하기
        // 5. todoList 출력한 뒤 특정 todo 포함 여부 확인하기 위해서 searchTodo라는 변수에
        //      찾을 키워드를 입력받고 해당 searchTodo가 있는지 여부 출력하기
        // 6. 포함 여부 확인 후 삭제할 todo 입력 받아서 deleteTodo에 대입해두고 삭제 후 성공 여부 출력
        // 7. todo들 정렬하고 전체 출력
        // 8. 역순으로 정렬하고 다시 출력
        // 9. 전체 todo들의 개수 출력
    }
}
