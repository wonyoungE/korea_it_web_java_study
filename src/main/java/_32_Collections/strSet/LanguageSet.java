package _32_Collections.strSet;

import java.util.*;

// 문제
// 1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"
// 리스트 만들어서 추가
// 2. set 하나 만들어서 리스트에 있던 요소들을 넣고 중복 제거하기 => 제거한 후 set 출력
// 3. 정렬 위해서 다시 List 하나 만들고 set에 있던 요소들 list에 넣기
// 4. 요소들을 넣은 리스트를 정렬하고 정렬된 언어 목록 출력하기
// 5. searchLang 변수에 "Java" 대입하고 해당 변수를 이용해서 리스트에서 몇 개 있는지 출력(검색)
// 6. 중복 제거를 위해 만들었던 set를 이용해서 중복 제거된 후의 언어 갯수 출력하기
public class LanguageSet {
    public static void main(String[] args) {
        // 1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"
        // 리스트 만들어서 추가
        List<String> langList = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Python",
                                                "Java", "Java", "C++", "C", "Java"));

        System.out.println("전체 언어 목록");
        System.out.println(langList);

        // 2. set 하나 만들어서 리스트에 있던 요소들을 넣고 중복 제거하기 => 제거한 후 set 출력
        Set<String> langSet = new HashSet<>(langList);
        System.out.println("중복이 제거된 언어 목록");
        System.out.println(langSet);

        // 3. 정렬 위해서 다시 List 하나 만들고 set에 있던 요소들 list에 넣기
        List<String> sortedList = new ArrayList<>(langSet);

        // 4. 요소들을 넣은 리스트를 정렬하고 정렬된 언어 목록 출력하기
        Collections.sort(sortedList);
        System.out.println("정렬된 언어 목록");
        System.out.println(sortedList);

//        Collections.sort(langList);
//        String searchLang = "Java";
//        int count = langList.lastIndexOf(searchLang) - langList.indexOf(searchLang) + 1;
//        System.out.print(searchLang + "이 langList에 몇 개 있나요? ");
//        System.out.println(count <= 0 ? searchLang + "이 langList에 없어요." : count + "개 있어요.");

        // 5. searchLang 변수에 "Java" 대입하고 해당 변수를 이용해서 리스트에서 몇 개 있는지 출력(검색)
        String searchLang = "Java";
        int frequency = Collections.frequency(langList, searchLang);
        System.out.println(searchLang + "은 총 " + frequency + "개 있습니다.");

        System.out.println("중복 제거 후 언어의 개수 : " + langSet.size());
    }
}
