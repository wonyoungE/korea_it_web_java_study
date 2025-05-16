package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        // 다중 조건문
        int avgScore = 88;

        // 90 이상이면 "A"
        // 80 이상이면 "B"
        // 70 이상이면 "C"
        // 나머지는 "D"
        if(avgScore >= 90) {
            System.out.println("등급: A");
        } else if(avgScore >= 80) {
            System.out.println("등급: B");
        } else if(avgScore >= 70) {
            System.out.println("등급: C");
        } else {
            System.out.println("등급: D");
        }

        // 중첩 if
        int age = 26;
        String gender = "여성";
        // 나이가 20이상이고 여성이면 "성인 여성", 남성이면 "성인 남성"
        if(age >= 20) {
            if(gender.equals("여성")) {
                System.out.println("성인 여성입니다.");
            } else {
                System.out.println("성인 남성입니다.");
            }
        } else {
            System.out.println("미성년자 입니다.");
        }
    }
}
