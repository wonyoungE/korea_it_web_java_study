package _29_Builder.Computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("AMD 7500f", 16)
                .storage(512)
                .hasWifi(false)
                .hasBluetooth(true)
                .build();

        computer.spec();
    }
}
