package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        // 대소문자 구분 않고 내용만 비교
        System.out.println(str2.equalsIgnoreCase("python"));
        System.out.println("---------------------------------");

        // == 은 사실 참조 위치를 비교하는 것
        // 같은 내용이면 같은 주소의 메모리를 참조한다.
        // 1234가 저장되어있는 메모리 공간을 passwd1, passwd2가 같이 참조한다.
        String passwd1 = "1234";
        String passwd2 = "1234";
        // 그렇기 때문에 == 을 이용했을 때 true라는 결과가 나옴 (참조 주소가 같음)
        System.out.println(passwd1 == passwd2);
        // equals()는 내용 비교하는 메서드
        System.out.println(passwd1.equals(passwd2));
        System.out.println("---------------------------------");

        // 내용이 같더라도 새로운 메모리 공간을 각각 할당하여 다른 위치에 저장
        // 각각 참조하고 있다.
        passwd1 = new String("1234");
        // 같은 내용(1234)이지만 새로운 메모리 공간을 참조한다.
        passwd2 = new String("1234");
        // 그렇기 때문에 ==을 이용했을 때 false라는 결과가 나옴 (참조 주소가 다름)
        System.out.println(passwd1 == passwd2);
        // equals()는 내용 비교 메서드이기 때문에 역시 true
        System.out.println(passwd1.equals(passwd2));


    }
}
