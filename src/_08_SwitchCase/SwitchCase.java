package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        // 조건문 - Switch Case
        // 1등 => 전액 장학금
        // 2등 => 반액 장학금
        // 3등 => 소정의 상품
        // 그 이하 => 박수

        int ranking = 2;
        if(ranking == 1) {
            System.out.println("전액 장학금");
        } else if(ranking == 2) {
            System.out.println("반액 장학금");
        } else if(ranking == 3) {
            System.out.println("소정의 상품");
        } else {
            System.out.println("짝짝짝!!");
        }
        System.out.println("수여식이 끝났습니다.!");

        // case는 해당 분기에 break가 없으면 맞는 조건 이후의 분기를 모두 실행
//        switch(ranking) {
//            case 1:
//                System.out.println("전액 장학금");
//                break;
//            case 2:
//                System.out.println("반액 장학금");
//                break;
//            case 3:
//                System.out.println("소정의 상품");
//                break;
//            default:
//                System.out.println("짝짝짝!!");
//        }
//        System.out.println("수여식이 끝났습니다.!");

        // 두 개의 분기가 같은 결과라면 하나는 생략 가능
        // 어차피 3에서 출력하고 break 걸림
        switch(ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("짝짝짝!!");
        }
        System.out.println("수여식이 끝났습니다.!");

        // if문은 범위에 해당되는 경우에 사용하고, case문은 명확한 값이 도출될 때 자주 사용한다

        int price = 7000;
        // 1등급이면 10000원, 등급이 한 단계씩 낮아질수록 -1000
        int grade = 1;

//        switch (grade) {
//            case 1:
//                price += 3000;
//                break;
//            case 2:
//                price += 2000;
//                break;
//            case 3:
//                price += 1000;
//                break;
//        }
//        System.out.println("가격: " + price);

        // break 없이 구현
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println("가격: " + price);

        // 봄은 3,4,5월 => 봄입니다.
        // 여름은 6,7,8월 => 여름입니다.
        // 가을은 9,10,11월 => 가을입니다.
        // 겨울은 12,1,2월 => 겨울입니다.
        int month = 6;

        switch(month) {
            case 3,4,5:
                System.out.println("봄입니다.");
                break;
            case 6,7,8:
                System.out.println("여름입니다.");
                break;
            case 9,10,11:
                System.out.println("가을입니다.");
                break;
            case 12,1,2:
                System.out.println("겨울입니다.");
                break;
        }

        // 1에서 7까지 숫자 하나 변수로 지정
        // 월화수목금토일
        int num = 5;
        String day = "";

        switch(num) {
            case 1:
                day = "월";
                break;
            case 2:
                day = "화";
                break;
            case 3:
                day = "수";
                break;
            case 4:
                day = "목";
                break;
            case 5:
                day = "금";
                break;
            case 6:
                day = "토";
                break;
            case 7:
                day = "일";
                break;
        }
        System.out.println("오늘은 " + day + "요일");
    }
}