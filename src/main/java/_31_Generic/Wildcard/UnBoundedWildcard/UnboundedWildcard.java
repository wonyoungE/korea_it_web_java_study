package _31_Generic.Wildcard.UnBoundedWildcard;

public class UnboundedWildcard {
    // ? => 타입에 제한이 없다 (== 비한정적 와일드카드)
    // 하지만 읽기(get)만 가능, 쓰기(set)는 불가능 => 타입이 명확하지 않기 때문
    public static void printBox(Box<?> box) {
        System.out.println("Box 내용물: " + box.getItem());
    }

    public static void setBox(String str, Box<?> box) {
//        box.setItem(str);  // capture of ?
        // ?가 무슨 타입일지 몰라서 str 넣는 것도 안됨
        // ?가 Integer인데 String 타입을 넣을 순 없자나~
    }
}
