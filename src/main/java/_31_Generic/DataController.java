package _31_Generic;

import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터: ", "손원영", 26, 26.0);
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<>("이름 :", "손원영");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 : ", 26);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율 : ", 3.14);
        System.out.println(responseData3);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("현재 날짜 : ", now);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(1);
        userEntityLombok.setUserName("손원영");
        userEntityLombok.setAge(26);
        userEntityLombok.setEmail("error071312@gmail.com");
        ResponseData<UserEntityLombok> user = new ResponseData<>("유저 : ", userEntityLombok);
        System.out.println(user);   // 내가 임의로 만든 클래스의 toString()이 있으면 걔를 불러온다
    }
}
