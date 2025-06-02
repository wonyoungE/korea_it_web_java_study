package _29_Builder.Computer;

public class ComputerLombokMain {
    public static void main(String[] args) {
        // @Builder 쓰면 객체 생성할 때 new 안써도 되는 이유
        // @Builder가 생성하는 builder() 메서드가
        // public static ComputerLombok.ComputerLombokBuilder() builder() {
        //    return new ComputerLombok.ComputerLombok();
        //} <= 이렇게 생겼기 때문에
        // ComputerLombok.builder() => new 객체 생성

        ComputerLombok computer = ComputerLombok.builder("AMD", 32)
                .storage(512)
                .hasWifi(false)
                .hasBluetooth(true)
                .build();

        // builder()는 모든 매개변수를 선택을 전제로 한다.
        // 필수 xx

        System.out.println(computer);
    }
}
