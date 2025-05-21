package _17_Method;

public class Return {
    public static String getName() {
        String name = "손원영";
        return name;
    }

    public static int getAge() {
        int age = 26;
        return age;
    }

    public static void main(String[] args) {
        // return 반환값
        // void -> 반환 값이 없다
        System.out.println(getName());
        System.out.println(getAge());

        String name = getName();
        int age = getAge();

        System.out.println(name);
        System.out.println(age);
    }
}
