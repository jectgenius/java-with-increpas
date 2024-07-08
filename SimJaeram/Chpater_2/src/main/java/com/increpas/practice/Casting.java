package com.increpas.practice;

public class Casting {                          // Casting 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        // 형변환
        // 1. 명시적 형변환(강제 형변환)
        // 2. 암시적 형변환(자동 형변환)

        // 명시적 형변환(강제 형변환)은 큰 타입 변수를 작은 타입 변수로 형변환
        // 번위가 작은 변수에 범위가 큰 변수를 대입할 경우, 자료의 손실을 감안한다고 JVM에게 선언하는 것과 같습니다.

        byte b1;                        // byte형 변수 b1 선언
        int i1 = 400;                   // int형 변수 i1 선언 동시에 400 대입하여 초기화
        b1 = (byte) i1;                 // 변수 b1에 변수 i1을 byte형으로 강제 형변환 한 뒤 대입하여 초기화
        System.out.println(b1);         // -112, 큰 타입을 작은 타입으로 강제 형변환하여 값 손실

        // 암시적 형변환(자동 형변환)은 작은 타입 변수를 큰 타입으로 형변환
        // JVM이 알아서 자동으로 형변환 해주므로 형변환할 필요가 없다.
        int i2;                         // int형 변수 i2 선언
        byte b2 = 127;                  // byte형 변수 b2 선언 동시에 127 대입하여 초기화
        i2 = b2;                        // 변수 i2에 변수 b2에 저장된 값 대입하여 초기화
        System.out.println(i2);         // 127, 작은 타입을 큰 타입으로 자동 형변환하여 값 손실 없음

        int i3 = 300;                   // int형 변수 i3 선언 동시에 300 대입하여 초기화
        float f1;                       // float형 변수 f1 선언
        f1 = i3;                        // 변수 f1에 변수 i3에 저장된 값을 대입하여 초기화
        System.out.println(f1);         // 300.0, int형과 float형 모두 4byte이지만 float형은 부동소수점형 방식으로 숫자를 저장하여 더 큰 범위의 숫자를 저장할 수 있다.
                                        // 그러므로 자동 형변환

        long l1 = 500;                  // long형 변수 l1 선언 동시에 500 대입하여 초기화
        float f2;                       // float형 변수 f2 선언
        f2 = l1;                        // 변수 f2에 변수 l2에 저장된 값 대입하여 초기화
        System.out.println(f2);         // 500.0, long형은 8byte이고 float형은 4byte이지만, float형은 부동소수점형 방식으로 숫자를 저장하여 long형 보다 더 큰 범위의 숫자를 저장할 수 있다.
                                        // 그러므로 자동 형변환

        double d1 = 0.1;                // double형 변수 d1 선언 동시에 0.1 대입하여 초기화
        double d2 = 0.2;                // double형 변수 d2 선언 동시에 0.2 대입하여 초기화
        System.out.println(d1 + d2);    // 0.30000000000000004, 자바에서 실수형 자료형은 부동 소수점형 방식으로 숫자를 저장하여 정확도가 살짝 떨어질 수 있다.

        byte b4 = 100;                  // byte형 변수 b4 선언 동시에 100 대입하여 초기화
        char ch2 = (char)b4;            // char형 변수 ch2 선언 동시에 변수 b4에 저장된 값을 char형으로 강제 형변환하여 대입하여 초기화
        System.out.println(ch2);        // 'd'

        char ch3 = 'A';                 // char형 변수 ch3 선언 동시에 'A' 대입하여 초기화
        int i5 = ch3;                   // int형 변수 i5 선언 동시에 변수 ch3에 저장된 값을 int형으로 자동 형변환하여 대입하여 초기화
        System.out.println(i5);         // 65

        // 논리형은 다른 숫자형 자료형으로 형변환 불가
        boolean bool1 = true;           // boolean형 변수 bool1 선언 동시에 true 대입하여 초기화
//        int i = (int) bool1;          // int형 변수 i 선언 동시에 변수 bool1에 저장된 값을 int형으로 강제 형변환하여 대입하여 초기화하려고 하였으니ㅏ
                                        // boolean형은 어떤 숫자형 자료형으로도 형변환이 불가능하여 컴파일 오류 발생
        int i = 50;                     // int형 변수 i 선언 동시에 50 대입하여 초기화
//        boolean bool2 = (boolean)i;   // boolean형 변수 bool2 선언 동시에 변수 i에 저장된 값을 강제 형변환하여 대입하여 초기화하려고 하였으나
//                                         어떤 숫자형 자료형이든 boolean형으로 형변환이 불가능하여 컴파일 오류 발생
    }                                           // main() 메소드 정의 끝
}                                               // Casting 클래스 정의 끝
