package _28_Static.Package;

public class Person {
    // 전역 변수
    // 클래스 수준
    public static int population = 0;
    // 멤버 변수
    public String name;
    
    public Person(String name) {
        this.name = name;
        System.out.println("현재 인구수 :" + population);
        population++;
        System.out.println("객체가 생성됨");
    }
    
    public void sayHello() {
        System.out.println("안녕하세요. 저는 " + name + "입니다.");
    }
    
    // 클래스 수준
    public static void showPopulation() {
        System.out.println("전체 인구 수 : " + population);
    }
}
