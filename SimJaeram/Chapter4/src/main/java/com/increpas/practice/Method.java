package com.increpas.practice;

public class Method {                                   // Method 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작

        float area = circleArea(4.3f);            // float형 변수 area 선언 동시에 circle() 메소드 호출하여 리턴 받은 값 대입하여 초기화, 반지름이 4.3f인 원의 면적
        System.out.println(area);                       // 58.088043

        terminateProgram(5);                 // 5시간 후에 종료됩니다., terminateProgram() 메소드 호출하여 예약한 시간 뒤에 종료 안내 메세지 출력

        System.out.println(getCurrentHour());           // 5, getCurrentHour() 메소드 호출하여 리턴 받은 현재 시각 출력

        int closeTime = terminateProgram(4); // int형 변수 closeTime 선언 동시에 terminateProgram() 메소드 호출하여 리턴 받은 시각 대입하여 초기화
        System.out.println(closeTime + "시에 종료될 예정입니다."); // 9시에 종료될 예정입니다.
    }                                                   // main() 메소드 정의 끝

    static float circleArea(float radius) {             // circleArea() 메소드 정의 시작
        final float PI = 3.141592f;                     // float형 상수 PI 선언 동시에 3.141592f 대입하여 초기화, 원주율 파이
        float area = PI * radius * radius;              // float형 변수 area 선언 동시에 PI * radius * radius 연산 결과 대입하여 초기화, 원의 면적

        return area;                                    // 변수 area에 저장된 값 리턴, 원의 면적
    }                                                   // circleArea() 메소드 정의 끝

    static int terminateProgram(int reservedTime) {     // terminateProgram() 메소드 정의 시작
//        System.out.println(reservedTime + "시간 후에 종료됩니다."); // 예약한 시간 후에 프로그램 종료 안내 메세지 출력

        int closeTime = getCurrentHour() + reservedTime;// int형 변수 closeTime 선언 동시에 getCurrentHour() 메소드 호출하여 리턴 받은 값인 현재 시각과 예약한 시간을 덧셈 연산한 결과를 대입하여 초기화
        return closeTime;                               // 변수 closeTime에 저장된 값 리턴, 종료 시각
    }                                                   // terminateProgram() 메소드 정의 끝

    static int getCurrentHour() {                       // getCurrentHour() 메소드 정의 시작
        int currentHour = 5;                            // int형 변수 currentHour 선언 동시에 5 대입하여 초기화, 현재 시각
        return currentHour;                             // 변수 currentHour에 저장된 값 리턴, 현재 시각
    }                                                   // getCurrentHour() 메소드 정의 끝
}                                                       // Method 클래스 정의 끝
