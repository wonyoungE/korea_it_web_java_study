package _25_Casting.Animal;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    public void wagTail() {
        System.out.println("강아지가 꼬리를 흔들고 있어요.");
    }
}
