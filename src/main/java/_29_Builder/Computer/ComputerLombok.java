package _29_Builder.Computer;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class ComputerLombok {
    private final String cpu;
    private final int ram;
    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;
}
