package _06_String;

public class String01 {
    public static void main(String[] args) {
        String str = "My Name is WonYoung Son";

        // 문자열 길이
        System.out.println(str.length());
        // 대문자
        System.out.println(str.toUpperCase());
        // 소문자
        System.out.println(str.toLowerCase());

        // 문자열 포함 여부 -> true, false
        System.out.println(str.contains("name"));
        System.out.println(str.contains("are"));

        // 해당 문자열 위치 정보 반환 -> 인덱스는 0부터 시작
        // 없는 문자열인 경우 -1 반환
        System.out.println(str.indexOf("name"));
        System.out.println(str.indexOf("age"));

        str = "I like music and movie and travel";
        // 해당 문자열이 여러개인 경우 마지막 위치 반환
        System.out.println(str.lastIndexOf("and"));
        // 없는 문자열인 경우 -1 반환
        System.out.println(str.lastIndexOf("java"));
        // 해당 문자열로 시작하는지 여부 -> true / false
        System.out.println(str.startsWith("I like"));   // true
        System.out.println(str.startsWith("My Name"));  // false
        // 해당 문자열로 끝나는지 여부 -> true / false
        System.out.println(str.endsWith("travel"));     // true
        System.out.println(str.endsWith("music"));     // false


    }
}
