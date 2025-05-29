package _27_Bean;

public class Main {
    public static void main(String[] args) {
        // UserEntity
        // userId, userName, age, email => private
        // 기본생성자 하나 만들기
        // getter/setter
        // toString() 오버라이드해서 정보 모두 출력되도록

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUserName("손원영");
        userEntity.setAge(26);
        userEntity.setEmail("error071312@gmail.com");

        // .toString() 생략
        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUserName("이원영");
        userEntityLombok.setAge(21);
        userEntityLombok.setEmail("210@gmail.com");
        System.out.println(userEntityLombok.toString());


    }
}






// 자바 실행 원리
// .java 파일을 빌드
// 빌드하는 과정에는 컴파일, 테스트, 리소스 복사가 있다.
// 컴파일 -> 영어로 쓰여있는 코드를 .class 바이트 파일 형식으로 바꿔줌
// .class 파일을 JVM(Java Virtual Machine)에서 읽고 실행.
// 빌드 단계에서 빌더 역할을 하는 도구 => 그래들, 메이븐
// 메이븐을 사용하기 위해서는 프로젝트 자체가 메이븐 프로젝트여야 한다.
// pom.xml의 dependencies에 모듈들을 가져다가 등록해둔다.

// 메이븐 프로젝트 자바 파일 경로
// 일반 자바 프로젝트는 src/패키지/.java 였지만
// 메이븐에서는 src/main/java 안에 패키지와 .java 파일이들어감.
// target 폴더가 생김.