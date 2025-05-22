package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner => 입력
        // Scanner 클래스, 객체 생성
        Scanner scanner = new Scanner(System.in);
        // String 문자열을 입력받기
        // next() => 토큰 단위로 읽기
        // 토큰 : 공백 문자 (띄어쓰기, 탭, 엔터)
        // nextLine() => 엔터가 입력될 때 까지 인식
        // nextLine() 제외 모든 next 메서드가 토큰 단위로 인식

        // 토큰 단위로 읽기 때문에
        // '안녕 하세요'를 입력하면
        // '안녕'은 str1에 저장되지만,
        // 공백을 만났기 때문에 '하세요'는 str2에 저장됨
//        String str1 = scanner.next();   // 안녕
//        String str2 = scanner.next();   // 하세요
//        System.out.println(str1);       // 안녕
//        System.out.println(str2);       // 하세요

        // 엔터가 입력될 때까지 문자열로 인식하기 때문에
        // '안녕 하세요'를 입력하면
        // str3에 '안녕 하세요'가 저장된다.
//        String str3 = scanner.nextLine();
//        System.out.println(str3);   // 안녕 하세요

        // int 정수 입력받기
        // nextInt()
        // 123 456
//        int num1 = scanner.nextInt();   // 123
//        int num2 = scanner.nextInt();   // 456
//        System.out.println(num1);       // 123
//        System.out.println(num2);       // 456

        // num에 123\n을 입력하면 메모리에는 123 + \n이 입력된 상태
        // 메모리 버퍼의 str에 \n이 들어간 상태 -> nextLine()은 엔터가 입력될 때까지 인식하므로
        // scanner.nextLine()이 입력도 안받고 끝나버린다.
        // 문제 상황
//        int num = scanner.nextInt();    // 123\n
//        String str = scanner.nextLine();
//        System.out.println("num은 " + num + "str은 " + str);  // num은 123 str은
//        // 해결 방법? 버퍼 메모리에서 \n을 지우기 위해 nextLine()을 한 번 더 입력받는다
//        // 해결
//        int num5 = scanner.nextInt();    // 123\n
//        scanner.nextLine(); // 버퍼 메모리에서 \n을 지우기
//        String str5 = scanner.nextLine();   // 가나다
//        System.out.println("num은 " + num5 + "str은 " + str5);  // num은 123 str은 가나다

        int age;
        String name;
        // 두 개 입력받고 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력해주세요 >>>");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("이름을 입력해주세요 >>>");
        name = sc.nextLine();
        System.out.println("나이 : " + age + " 이름 : " + name);
    }
}
