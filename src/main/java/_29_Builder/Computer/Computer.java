package _29_Builder.Computer;

public class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public void spec() {
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram);
        System.out.println("Storage : " + storage);
        System.out.println("WIFI :" + (hasWifi ? "지원" : "미지원"));
        System.out.println("Bluetooth : " + (hasBluetooth ? "지원" : "미지원"));
    }

    public static class Builder {
        // 필수
        private final String cpu;
        private final int ram;

        // 선택
        private int storage;
        private boolean hasWifi;
        private boolean hasBluetooth;

        // cpu와 ram은 필수
        // main에서 Computer.Builder()할 때 넣어주면 됨
        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder hasWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }
        public Builder hasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
