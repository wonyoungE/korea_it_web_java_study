package _21_Class.Car;

public class Car {
    String carName;
    int carYearModel;
    String carColor;

    // 생성자
    // 객체를 생성할 때 바로 속성을 대입할 수 있도록 함
    // NoArgsConstructor => 매개변수가 없는 빈 생성자
    // RequiredArgsConstructor => 매개변수가 하나라도 있는 생성자
    // AllArgsConstructor => 모든 속성값이 부여된 자동차

    Car() { // 기본 생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor");    // ***
    }

    // Overloading이 된 상태
    Car(String carName) {
        System.out.println("carName의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsConstructor");  // 속성값이 부여된 생성자
        // this는 자기 자신을 의미
        this.carName = carName;
    }

    // this는 해당 클래스로 만들어진 객체를 의미
    // this를 왜 써야하는가? => 속성의 이름과 매개변수의 이름이 같을 때 명확히 하기 위해서
    // 그래서 이름이 다르다면 this는 생략 가능하다.
    // 만약 carName = carName; 이라면 속성에 자기 자신을 대입하는 것이라 의미가 없다.
    // 하지만 this.carName이라고 명시를 해두면 속성에 매개변수 값 대입이라는 뜻이 되는 것이다.

    Car(String carName, int carYearModel) {
        this.carName = carName;
        this.carYearModel = carYearModel;
    }

    Car(String carName, int carYearModel, String carColor) {
        System.out.println("모든 속성값이 부여된 자동차");
        System.out.println("AllArgsConstructor");
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
    }

    public void startCar() {
        System.out.println(carName + "이 시동을 겁니다.");
    }

    public void drive() {
        System.out.println(carName + "이 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + "이 정지합니다.");
    }
}