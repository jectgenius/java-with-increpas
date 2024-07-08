package com.increpas.practice;

public class Operator {                             // Operator 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 증감 연산자
        int increment = 5;                          // int형 변수 increment 선언 동시에 5 대입하여 초기화
        ++increment;                                // increment에 +1, 전위 연산자
        System.out.println(increment);              // 6

        int decrement = 5;                          // int형 변수 decrement 선언 동시에 5 대입하여 초기화
        --decrement;                                // decrement에 -1, 전위 연산자
        System.out.println(decrement);              // 4

        // 산술 연산자
        int number1 = 10;                           // int형 변수 number1 선언 동시에 10 대입하여 초기화
        int number2 = 4;                            // int형 변수 number2 선언 동시에 4 대입하여 초기화
        System.out.println(number1 * number2);      // 변수 number1에 저장된 값 10과 변수 number2에 저장된 값 4를 곱셈 연산한 결과를 출력

        float number3 = 10.25f;                     // float형 변수 number3 선언 동시에 10.25f 대입하여 초기화
        int number4 = 4;                            // int형 변수 number4 선언 동시에 4 대입하여 초기화
        System.out.println(number3 % number4);      // 변수 number3와 number4에 저장된 값 10.25f와 4를 나머지 연산한 결과를 출력

        // 비교 연산자
        int number5 = 5;                            // int형 변수 number5 선언 동시에 5 대입하여 초기화
        int number6 = 10;                           // int형 변수 number6 선언 동시에 10 대입하여 초기화
        boolean check = number5 == number6;         // boolean형 변수 check 선언 동시에 number5와 number6 비교 연산한 결과 리턴 받은 값 대입하여 초기화, 5와 10은 같지 않으므로 false
        System.out.println(check);                  // false

        // 논리 연산자
        boolean b1 = 3 > 1;                         // boolean형 변수 b1 선언 동시에 3 > 1 비교 연산한 결과 리턴 받은 값 대입하여 초기화, 3은 1보다 크므로 true
        boolean b2 = false;                         // boolean형 변수 b2 선언 동시에 false 대입하여 초기화

        boolean compare = b1 && b2;                 // boolean형 변수 compare 선언 동시에 b1과 b2 and 연산한 결과 리턴 받은 값 대입하여 초기화, true && false는 false
        System.out.println(compare);                // false

        boolean compare2 = b1 || b2;                // boolean형 변수 compare2 선언 동시에 b1과 b2 or 연산한 결과 리턴 받은 값 대입하여 초기화, true || false는 true
        System.out.println(compare2);               // true

        boolean flag = false;                       // boolean형 변수 flag 선언 동시에 false 대입하여 초기화
        flag = !flag;                               // 변수 flag에 !flag 연산한 결과를 리턴 받은 값을 대입, !false는 true

        System.out.println(flag);                   // true

        System.out.println(!flag);                  // false

        // 대입 연산자, 복합 대입 연산자
        number1 = 10;                               // 변수 number1에 10 대입
        number1 -= 5;                               // 변수 number1에 number1 - 5 연산 결과 대입, 10 - 5는 5
        System.out.println(number1);                // 5

        number2 = 10;                               // 변수 number2에 10 대입
        number2 %= 3;                               // 변수 number2에 number2 % 3 연산 결과 대입, 10 % 3은 1
        System.out.println(number2);                // 1
        
    }                                               // main() 메소드 정의 끝
}                                                   // Operator 클래스 정의 끝
