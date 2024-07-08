package com.increpas.practice;

public class Variable {                                     // 클래스 Variable 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        // 변수 실습

        // 변수의 구분: 1. 기본 자료형 변수 2. 참조 자료형 변수
        // 기본 자료형 변수: 숫자형(정수형, 실수형), 문자형, 논리형
        // 정수형 변수: byte(1byte), short(2byte), int(4byte), long(8byte)
        // byte가 표현할 수 있는 범위는 -2^7 ~ 2^7-1, 즉, -128 ~ 127로 총 2^8개
        // 변수 선언 동시에 초기화
        byte b1 = 10;                   // byte형 변수 b1 선언 동시에 10 대입하여 초기화
        // 변수 선언 하고 초기화
        byte b2 ;                       // byte형 변수 b2 선언
        b2 = 100;                       // b2에 100 대입하여 초기화

        System.out.println(b1);         // System.out.println() 메소드 호출하여 변수 b1에 저장된 값 10 출력
        System.out.println(b2);         // System.out.println() 메소드 호출하여 변수 b2에 저장된 값 100 출력

        short s1 = 20;                  // short형 변수 s1 선언 동시에 20 대입하여 초기화
        System.out.println(s1);         // System.out.println() 메소드 호출하여 변수 s1에 저장된 값 20 출력

        int i1 = 2100000000;             // int형 변수 i1 선언 동시에 2100000000 대입하여 초기화
        System.out.println(i1);          // System.out.println() 메소드 호출하여 변수 i1에 저장된 값 2100000000 출력

        long l1 = 2200000000L;           // long형 변수 l1 선언 동시에 2200000000 대입하여 초기화
                                         // 정수형 리터럴은 기본적으로 int형으로 인식되어, 맨끝에 long형 리터럴임을 나타내는 L 작성
                                         // 리터럴도 각 자료형에 따른 크기 범위만 표현 가능
        System.out.println(l1);          // System.out.println() 메소드 호출하여 변수 l1에 저장된 값 2200000000 출력

        float f1 = 3.14f;               // float형 변수 f1 선언 동시에 3.14 대입하여 초기화
                                        // 실수형 리터럴은 기본적으로 double형으로 인식되어, 맨끝에 float형 리터럴임을 나타내는 f 작성

        double d1 = 14234123423.213412341234; // double형 변수 d1 선언 동시에 14234123423.213412341234 대입하여 초기화

        System.out.println(f1 + d1);    // System.out.println() 메소드 호출하여 f1 + d1 연산한 결과 출력

        // 문자형 변수 char
        char ch1 = 'B';                 // char형 변수 ch1 선언 동시에 문자 'B' 대입하여 초기화
        System.out.println(ch1);        // System.out.println() 메소드 호출하여 변수 ch1에 저장된 값 문자 'B' 출력

        // 논리형 변수 boolean
        boolean bool1 = true;           // boolean형 변수 bool1 선언 동시에 true 대입하여 초기화
        System.out.println(bool1);      // System.out.println() 메소드 호출하여 변수 bool1에 저장된 값 true 출력
        boolean bool2 = false;          // boolean형 변수 bool2 선언 동시에 false 대입하여 초기화
        System.out.println(bool2);      // System.out.println() 메소드 호출하여 변수 bool2에 저장된 값 false 출력

    }                                                       // main() 메소드 정의 끝
}                                                           // 클래스 Variable 정의 끝
