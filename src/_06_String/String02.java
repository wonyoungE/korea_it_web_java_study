package _06_String;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        // 특정 문자열 대체 replace(char, char)
        System.out.println(str.replace(" and", ","));

        // 문자열 자르기 substring(int, int)
        // 7번 인덱스부터 출력
        System.out.println(str.substring(7));
        // 7번 인덱스부터 11번 인덱스까지 출력 -> 끝지점은 본인 포함 안함
        System.out.println(str.substring(7, 12));
        System.out.println(str.substring(str.indexOf("movie"), str.indexOf("."))); // movie and travel

        str = "    I want to go home    ";
        // 문자열 앞뒤 공백 제거 trim()
        System.out.println(str.trim());

        String s1 = "Hello";
        String s2 = "World";

        // 문자열 이어붙이기 concat()
        System.out.println(s1.concat(s2));  // HelloWorld
        System.out.println(s1.concat(" ").concat(s2));  // Hello World

    }
}
