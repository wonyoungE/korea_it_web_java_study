package _29_Builder.Computer;

public class ComputerLombokMain {
    public static void main(String[] args) {
        ComputerLombok computer = ComputerLombok.builder()
                .cpu("AMD")
                .ram(32)
                .storage(512)
                .hasWifi(false)
                .hasBluetooth(true)
                .build();

        // builder()는 모든 매개변수를 선택을 전제로 한다.
        // 필수 xx

        System.out.println(computer);
    }
}
