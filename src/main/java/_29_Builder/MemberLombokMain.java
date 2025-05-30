package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok member = MemberLombok.builder()
                .age(26)
                .build();

        System.out.println(member.getAge());
        System.out.println(member.getName());   // null
    }
}