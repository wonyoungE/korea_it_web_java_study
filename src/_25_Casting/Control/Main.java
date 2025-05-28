package _25_Casting.Control;

public class Main {
    public static void main(String[] args) {
        // Power 인터페이스
        // on(), off()
        // Tv, Computer, Speaker, LEDLight, Mouse, SmartPhone
        // 재정의, 고유메서드 1개

//        Power[] powers = {new Computer(), new Mouse(), new TV()};
//        CentralControl centralControl = new CentralControl(powers);
        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(new Computer());
        centralControl.addDevice(new TV());
        centralControl.addDevice(new Mouse());
        centralControl.addDevice(new Speaker());
        centralControl.addDevice(new LEDLight());
        centralControl.addDevice(new SmartPhone());

        centralControl.powerOn();
        centralControl.powerOff();

        centralControl.unplugDevice(2);
        centralControl.performSpecificMethod();

//        Power[] deviceArrays = centralControl.getDeviceArray();
//        for(Power device : deviceArrays) {
//            System.out.println(device.getClass());
//        }

    }
}
