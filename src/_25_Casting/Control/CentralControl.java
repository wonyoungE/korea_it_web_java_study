package _25_Casting.Control;

public class CentralControl {
    // 각 전자기기들은 Power를 상속받았기 때문에 업캐스팅으로 Power 클래스 배열에 저장할 수 있다.
    // 필드
    private Power[] deviceArray;

    // 생성자
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {   // 매개변수 device : 암시적으로 업캐스팅
        // 배열에 비어있는 칸에 기기 저장
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1) {
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            return;
        }

        deviceArray[emptyIndex] = device;

        // device => 패키지명.클래스명@메모리주소
        // device.getClass() => 패키지명.클래스명
        // device.getClass().getSimpleName() => 클래스명만 나옴!
        System.out.println(emptyIndex + "번 슬롯에 " + device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
    }

    // 배열 중에 빈 칸 찾기
    public int checkEmpty() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i;
            }
        }
        // 빈 자리가 없으면
        return -1;
    }

    public void powerOn() {
        for(Power device : deviceArray) {
            // null 예외 처리해주어야 함.
            if(device == null) {
                System.out.println("장치가 등록되어있지 않은 슬롯입니다.");
                continue;
            }
            device.on();
        }
    }

    public void powerOff() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                System.out.println("장치가 등록되어있지 않은 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    // 각 장치마다의 고유메서드를 출력하기.. => 메서드명이 다 다른데 어케 갖고옴?;;
    // 장치가 어떤 클래스의 인스턴스인지 검증 후 객체 생성, 메서드 실행
    public void performSpecificMethod() {
        for(Power device : deviceArray) {
            if(device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.restart();
            } else if(device instanceof TV) {
                TV tv = (TV) device;
                tv.channelUp();
            } else if(device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if(device instanceof LEDLight) {
                LEDLight ledLight = (LEDLight) device;
                ledLight.changeColor();
            } else if(device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.volumeUp();
            } else if(device instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) device;
                smartPhone.alarm();
            } else {
                System.out.println("장치가 연결되지 않은 슬롯입니다.");
            }
        }
    }

    // 코드 뽑기 - 나 혼자 해봄 ..
    public void unplugDevice(int index) {
        if(deviceArray[index] == null) {
            System.out.println("해당 슬롯에 연결된 장치가 없습니다.");
        }
        System.out.println(deviceArray[index].getClass().getSimpleName() + " 장치를 제거했습니다.");
        deviceArray[index] = null;
    }

    public Power[] getDeviceArray() {
        return deviceArray;
    }
}
