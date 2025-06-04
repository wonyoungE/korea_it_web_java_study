package _32_Collections.strMap;

import java.util.*;

// 문제
// 1. 스캐너 객체 하나 생성, 변수명이 productMap인 hashMap 생성(키: String, 값: Integer)
// 2. 상품 등록하기 라고 출력하고 for문 이용, 5번 반복, 상품명(키)입력 받고 가격(값) 입력받고 추가(productMap)
//      ** 상품명을 입력받고 공백을 꼭 제거할 것
// 3. 전체 상품을 출력하기 => for each 사용
// 4. 상품 가격 수정 => 수정할 상품명 입력받고(공백 제거) => 입력한 상품이 존재하면 가격을 입력받고 수정
//      만약에 존재하지 않으면 존재하지 않는다고 출력
// 5. 특정 상품 검색 => 검색할 상품명 입력받고(공백 제거) => 입력한 상품이 productMap에 있는지 확인하고
//      있으면 해당 상품명과 가격 출력 => 없으면 존재하지 않는다고 출력
// 6. 정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬하기 => 정렬하고 for each 출력
// 7. 정렬하기 역순 => 역순 정렬하고 for each 출력
public class ProductMap {
    public static void main(String[] args) {
        // 1.
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        // 2.
        System.out.println("상품 등록하기");
        for (int i = 0; i < 5; i++) {
            System.out.print("상품명을 입력해주세요. 상품명: ");
            String pName = sc.nextLine().trim();
            System.out.print("상품의 가격을 입력해주세요. 가격: ");
            int price = Integer.parseInt(sc.nextLine());
            productMap.put(pName, price);
        }

        // 3.
        for(Map.Entry<String, Integer> product : productMap.entrySet()) {
            System.out.println("- " + product.getKey() + ": " + product.getValue() + "원");
        }

        // 4.
        System.out.print("가격을 수정할 상품명을 입력해주세요. 상품명: ");
        String pName = sc.nextLine().trim();
        if(productMap.containsKey(pName)) {
            System.out.print("수정할 가격을 입력해주세요. 가격: ");
            int price = Integer.parseInt(sc.nextLine());
            productMap.put(pName, price);
            System.out.println("가격을 수정했습니다. " + pName + ": " + price);
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }

        // 5.
        System.out.print("검색할 상품명을 입력해주세요. 상품명: ");
        pName = sc.nextLine();
        if(productMap.containsKey(pName)) {
            System.out.println("상품명: " + pName + " 가격: " + productMap.get(pName));
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }

        // 6.
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(productMap.entrySet());
        sortedList.sort(Map.Entry.comparingByKey());
        System.out.println("상품명 기준 정렬");
        for(Map.Entry<String, Integer> product : sortedList) {
            System.out.println("상품명: " + product.getKey() + " 가격: " + product.getValue());
        }

        // 7. 역정렬
        sortedList.sort(Map.Entry.comparingByKey(Collections.reverseOrder()));
        System.out.println("상품명 기준 역순 정렬");
        for(Map.Entry<String, Integer> product : sortedList) {
            System.out.println("상품명: " + product.getKey() + " 가격: " + product.getValue());
        }
    }
}
