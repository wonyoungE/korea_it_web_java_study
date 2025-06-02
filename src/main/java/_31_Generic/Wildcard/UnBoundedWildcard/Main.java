package _31_Generic.Wildcard.UnBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        // Box의 제네릭이 T이기 때문에 String, Integer, ... 가능
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(1234);

        // printBox => static
        UnboundedWildcard.printBox(stringBox);
        UnboundedWildcard.printBox(integerBox);

    }
}
