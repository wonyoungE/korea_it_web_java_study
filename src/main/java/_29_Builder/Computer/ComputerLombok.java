package _29_Builder.Computer;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder(builderMethodName = "customBuilder")
public class ComputerLombok {
    private final String cpu;
    private final int ram;
    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;

    // @Builder 어노테이션을 사용하면 => 자동으로 클래스명+Builder 정적 클래스를 만들어줌
    // 그리고 내부에는.. build() 메서드가 만들어진다 (직접 만들어봤던 거랑 똑같음)
    // 그래서 .build(); 를 통해서 객체 생성 가능

    // @Builder 사용할 때 특정 변수는 필수 매개변수로 지정하고 싶다면 ?
    // @Builder(builderMethodName = "메서드명") => Computer.builder() 메서드 생성되지 않음
    // Lombok이 자동으로 생성하는 builder 메서드 이름을 내가 지정하는 메서드명으로 바꾸겠다는 의미
    // @Builder(builderMethodName = "customBuilder") => Computer.build()는 생성되지 않고 Computer.customBuilder()가 생성된다

    //
    public static ComputerLombokBuilder builder(String cpu, int ram) {
        return customBuilder().cpu(cpu).ram(ram);
    }
}
