package com.increpas.practice;

import java.util.Scanner;

public class LoopStatement {                                                // LoopStatement 클래스 정의 시작
    public static void main(String[] args) {                                // main() 메소드 정의 시작
        // while문
        Scanner scanner = new Scanner(System.in);                           // 변수 scanner에 Scanner 객체 생성하여 대입
        int score = 0;                                                      // int형 변수 score 선언 동시에 0 대입하여 초기화, 사용자가 입력한 점수를 저장

        System.out.println("점수를 입력해 주세요");                            // System.out.println() 메소드 호출하여 문자열 "점수를 입력해 주세요" 출력, 점수 입력 안내 메세지 출력
        score = scanner.nextInt();                                          // 변수 score에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 저장, 사용자가 입력한 점수
                                                                            // while문은 먼저 조건식 검사 후 실행문장을 반복하므로 어떤 경우에는 불필요하게 반복되는 코드가 있을 수 있음
        while(score < 0 || score > 100) {                                   // while문 시작, 변수 score에 저장된 값이 0 보다 작거나 100 보다 크면, 즉 사용자가 입력한 점수가 0 보다 작거나 100 보다 크면 반복
            System.out.println("점수를 입력해주세요");                         // System.out.println() 메소드 호출하여 문자열 "점수를 입력해 주세요" 출력, 점수 입력 안내 메세지 출력
            score = scanner.nextInt();                                      // 변수 score에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 저장, 사용자가 입력한 점수
        }                                                                   // while문 끝

        System.out.println("입력하신 점수는 " + score + "점 입니다.");         // System.out.println() 메소드 호출하여 문자열 "입력하신 점수는 " + score + "점 입니다." 출력, 입력한 점수 안내 메세지 출력

        // do-while문                                                       // do-while문은 먼저 실행문장 실행 후 조건식을 검사함
        do {                                                                // do-while문 시작
            System.out.println("점수를 입력해주세요");                         // System.out.println() 메소드 호출하여 문자열 "점수를 입력해 주세요" 출력, 점수 입력 안내 메세지 출력
            score = scanner.nextInt();                                      // 변수 score에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 저장, 사용자가 입력한 점수
        } while(score < 0 || score > 100);                                  // do-while문 끝, 변수 score에 저장된 값이 0 보다 작거나 100 보다 크면, 즉 사용자가 입력한 점수가 0 보다 작거나 100 보다 크면 반복

        System.out.println("입력하신 점수는 " + score + "점 입니다.");          // System.out.println() 메소드 호출하여 문자열 "입력하신 점수는 " + score + "점 입니다." 출력, 입력한 점수 안내 메세지 출력

        // for문
        // 구구단 출력 프로그램
        System.out.println("몇 단을 출력할까요?");                             // System.out.println() 메소드 호출하여 문자열 "몇 단을 출력할까요?" 출력, 단수 입력 안내 메세지 출력
        int dan = scanner.nextInt();                                        // int형 변수 dan 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴하여 대입하여 초기화

        for(int i = 1; i <= 9; i++) {                                       // for문 시작, 반복 제어 변수 int형 변수 i 선언 동시에 1 대입하여 초기화, i가 9보다 작거나 같을 동안 반복, i에 +1
            System.out.println(dan + " x " + i + " = " + (dan * i));        // System.out.println() 메소드 호출하여 문자열 "dan + " x " + i + " = " + (dan * i)" 출력, 구구단 출력
        }                                                                   // for문 끝

        System.out.println("출력 완료");                                     // System.out.println() 메소드 호출하여 문자열 "출력 완료" 출력, 출력 완료 안내 메세지 출력

        // label과 break문, continue문
        for(int i = 1; i <= 3; i++) {                                       // 바깥 for문 시작, 반복 제어 변수 int형 변수 i 선언 동시에 1 대입하여 초기화, i가 3보다 작거나 같을 동안 반복, i에 +1
            for(int j = 1; j <= 5; j++) {                                   // 안쪽 for문 시작, 반복 제어 변수 int형 변수 j 선언 동시에 1 대입하여 초기화, j가 5보다 적거나 같을 동안 반복, j에 +1
                if(j == 3) {                                                // 만약 j가 3이면
                    break;                                                  // for문을 빠져나감, 라벨 지정이 없으면 자기 자신을 둘러싸고 있는 반복문 1개만 빠져나감, 라벨을 지정한 경우 지정한 라벨을 부착한 반복문을 빠져나감
                }
                System.out.println("(" + i + ", " + j + ")");               // System.out.println() 메소드 호출하여 문자열 "(i, j)" 출력, 현재 (i, j) 값 출력
            }                                                               // 안쪽 for문 끝
            System.out.println("---------");                                // System.out.println() 메소드 호출하여 문자열 "---------" 출력, 안쪽과 바깥쪽 반복문 구분선 출력
        }                                                                   // 바깥 for문 끝

        // label과 break문, continue문
        outter:
        for(int i = 1; i <= 3; i++) {                                       // 바깥 for문 시작, 반복 제어 변수 int형 변수 i 선언 동시에 1 대입하여 초기화, i가 3보다 작거나 같을 동안 반복, i에 +1
            inner:
            for(int j = 1; j <= 5; j++) {                                   // 안쪽 for문 시작, 반복 제어 변수 int형 변수 j 선언 동시에 1 대입하여 초기화, j가 5보다 적거나 같을 동안 반복, j에 +1
                if(j == 3) {                                                // 만약 j가 3이면
                    break outter;                                           // for문을 빠져나감, 라벨 지정이 없으면 자기 자신을 둘러싸고 있는 반복문 1개만 빠져나감, 라벨을 지정한 경우 지정한 라벨을 부착한 반복문을 빠져나감
                }
                System.out.println("(" + i + ", " + j + ")");               // System.out.println() 메소드 호출하여 문자열 "(i, j)" 출력, 현재 (i, j) 값 출력
            }                                                               // 안쪽 for문 끝
            System.out.println("---------");                                // System.out.println() 메소드 호출하여 문자열 "---------" 출력, 안쪽과 바깥쪽 반복문 구분선 출력
        }                                                                   // 바깥 for문 끝

        // label과 break문, continue문
        for(int i = 1; i <= 3; i++) {                                       // 바깥 for문 시작, 반복 제어 변수 int형 변수 i 선언 동시에 1 대입하여 초기화, i가 3보다 작거나 같을 동안 반복, i에 +1
            for(int j = 1; j <= 5; j++) {                                   // 안쪽 for문 시작, 반복 제어 변수 int형 변수 j 선언 동시에 1 대입하여 초기화, j가 5보다 적거나 같을 동안 반복, j에 +1
                if(j == 3) {                                                // 만약 j가 3이면
                    continue;                                               // 이번 반복을 중단하고 다음 반복으로 넘어감, 라벨 지정이 없으면 자기 자신을 둘러싸고 있는 반복문 1개의 다음 반복으로 넘어감, 라벨을 지정한 경우 지정한 라벨을 부착한 반복문의 다음 반복으로 넘어감
                }
                System.out.println("(" + i + ", " + j + ")");               // System.out.println() 메소드 호출하여 문자열 "(i, j)" 출력, 현재 (i, j) 값 출력
            }                                                               // 안쪽 for문 끝
            System.out.println("---------");                                // System.out.println() 메소드 호출하여 문자열 "---------" 출력, 안쪽과 바깥쪽 반복문 구분선 출력
        }                                                                   // 바깥 for문 끝

        // label과 break문, continue문
        outter:
        for(int i = 1; i <= 3; i++) {                                       // 바깥 for문 시작, 반복 제어 변수 int형 변수 i 선언 동시에 1 대입하여 초기화, i가 3보다 작거나 같을 동안 반복, i에 +1
            for(int j = 1; j <= 5; j++) {                                   // 안쪽 for문 시작, 반복 제어 변수 int형 변수 j 선언 동시에 1 대입하여 초기화, j가 5보다 적거나 같을 동안 반복, j에 +1
                if(j == 3) {                                                // 만약 j가 3이면
                    continue outter;                                        // 이번 반복을 중단하고 다음 반복으로 넘어감, 라벨 지정이 없으면 자기 자신을 둘러싸고 있는 반복문 1개의 다음 반복으로 넘어감, 라벨을 지정한 경우 지정한 라벨을 부착한 반복문의 다음 반복으로 넘어감
                }
                System.out.println("(" + i + ", " + j + ")");               // System.out.println() 메소드 호출하여 문자열 "(i, j)" 출력, 현재 (i, j) 값 출력
            }                                                               // 안쪽 for문 끝
            System.out.println("---------");                                // System.out.println() 메소드 호출하여 문자열 "---------" 출력, 안쪽과 바깥쪽 반복문 구분선 출력
        }                                                                   // 바깥 for문 끝

    }                                                                       // main() 메소드 정의 시작
}                                                                           // LoopStatement 클래스 정의 끝
