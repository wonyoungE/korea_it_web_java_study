package _07_If;

public class IfElse {
    public static void main(String[] args) {
        // else는 조건이 거짓이면 실행되는 코드 블럭

        // 키가 120이상 이어야 탑승 가능
        int height = 120;
        if (height >= 120) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
        System.out.println(height >= 120 ? "탑승 가능" : "탑승 불가능");
    }
}
