package _31_Generic.Wildcard.LowerBoundedWildcard;

public class SuperWildcard {
    // 하한 경계 와일드카드 : Dog 또는 Dog 클래스의 상위 타입만 허용
    // 상한 경계 = > <? extends Animal> => Animal의 자식
    // <? super Dog> => ?가 Dog의 상위
    // 쓰기 가능, 읽기 불가능
    public static void putDog(Box<? super Dog> box) {
        // box에 ?가 뭐가 오든 Dog의 상위 클래스만 받기 때문에 dog를 업캐스팅해서 set하면 됨
        box.setItem(new Dog()); // 쓰기는 가능
//        Dog dog = box.getItem();    // 읽기는 안됨, 왜냐, dog보다 상위 클래스를 Dog 클래스에 넣을 순 없잖아 ..

        Dog dog = (Dog)box.getItem(); // 이렇게 하면?? 가능하긴 한데.. 그거는 내가 box.getItem()의 반환 타입이 Dog인 걸 알기 때문임..
        //
        dog.sound();
        // Object는 모든 클래스의 부모 클래스이기 때문에 Object 클래스로 받으면 ?가 어떤 클래스인지 상관없이
        // 읽기는 가능함. 근데 Object 클래스로 업캐스팅되기 때문에 사실상 의미 없음..(업캐스팅하면 자식 클래스의 고유 메서드는 사용할 수 없다, 자식 클래스에 재정의한 게 있으면 그거 실행함. 동적 바인딩)
        // 그래서 자식 클래스의 고유 메서드를 사용하고 싶을 때 다운 캐스팅함
//        Object object = box.getItem();  // 읽을 수는 있으나, object로 반환됨

//        System.out.println("obj : " + obj);

        // getItem을 했을 때 Integer가 나올지, Object가 나올지 어떤 타입이 나올지 모르기 때문에
        // 가져올 수 없음
        // ex) Box<? super Integer> 면 Integer, Number, Object 타입인데
        // 어떤 타입이 올 지 모르기 때문에 getItem으로 담을 수 없다는 것임
        // => getItem에 어떤 게 올 지 모르는데 Object object = box.getItem(); 할 수 있음? ㄴㄴ
        // box.getItem() 했는데 Integer 타입일 수도, Number 타입일 수도, Integer 타입일 수도 있는데..
        // box의 제네릭 타입이 Number이라 getItem()하면 Number 인스턴스인데 담을 클래스가 Integer라면..?
        // Integer int = box.getItem(); <- 여기서 box의 제네릭 타입이 Number, Object일 수도 있다는 것
        // 그러면 못담잔아 ㅏ..
    }

    public static void putInteger(Box<? super Integer> box) {

    }
}
