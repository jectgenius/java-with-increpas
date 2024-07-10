package com.increpas.practice;

public class Array {                                          // Array 클래스 정의 시작
    public static void main(String[] args) {                  // main() 메소드 정의 시작
//        boolean[][][] trainSeat = new boolean[3][][];       // 3차원 boolean형 배열에 대한 레퍼런스 변수 trainSeat 선언 동시에 객체 생성하여 대입하여 초기화, 총 3호차, N행 M열인 열차의 예약 여부를 저장하는 배열
//        trainSeat[0] = new boolean[10][];                   // 3차원 boolean형 배열에 대한 레퍼런스 변수 trainSeat 3차원 배열에 2차원 배열 생성하여 대입하여 초기화, 1호차
//        trainSeat[1] = new boolean[10][];                   // 3차원 boolean형 배열에 대한 레퍼런스 변수 trainSeat 3차원 배열에 2차원 배열 생성하여 대입하여 초기화, 2호차
//        trainSeat[2] = new boolean[10][];                   // 3차원 boolean형 배열에 대한 레퍼런스 변수 trainSeat 3차원 배열에 2차원 배열 생성하여 대입하여 초기화, 3호차
//        trainSeat[0][0] = new boolean[3];                   // 3차원 boolean형 배열에 대한 레퍼런스 변수 trainSeat 2차원 배열에 1차원 배열 생성하여 대입하여 초기화, 1호차의 인덱스 0번째 행, 3개의 열
//        trainSeat[0][1] = new boolean[3];

        boolean[][][] trainSeat = new boolean[3][10][3];      // boolean형 3차원 배열에 대한 레퍼런스 변수 trainSeat 선언 동시에 크기가 3, 10, 3인 boolean형 배열 객체 생성하고 대입하여 초기화, 3호차 10행 3열인 열차 예약 여부 저장

        trainSeat[2][7][2] = true;                            // 배열 trainSeat의 인덱스 2, 7, 2번째 요소에 true 대입하여 저장, 인덱스 2호차의 7행번째 2열번째 좌석의 예약 여부 O
        trainSeat[0][0][0] = true;                            // 배열 trainSeat의 인덱스 2, 7, 2번째 요소에 true 대입하여 저장, 인덱스 2호차의 7행번째 2열번째 좌석의 예약 여부 O
        trainSeat[1][2][1] = true;                            // 배열 trainSeat의 인덱스 2, 7, 2번째 요소에 true 대입하여 저장, 인덱스 2호차의 7행번째 2열번째 좌석의 예약 여부 O

//        if(trainSeat[2][7][2] == true) {                    // 만약 배열 trainSeat의 인덱스 2, 7, 2번째 요소에 저장된 값이 true이면, 즉 인덱스 2, 7, 2번째 좌석이 예약된 상태이면
//            System.out.println("예매불가");                   // System.out.println() 메소드 호출하여 문자열 "예매불가" 출력, 좌석 예매불가 안내 메세지 출력
//        } else {                                            // 그렇지 않으면, 즉 인덱스 2, 7, 2번째 좌석이 예약되지 않은 상태이면
//            reservation(2, 7, 2);                           // 메소드 reservation 호출하여 해당 좌석 예약 처리
//        }

        int count = 0;                                              // int형 변수 count 선언 동시에 0 대입하여 초기화, 현재 예약된 좌석의 개수
        for(int i = 0; i < trainSeat.length; i++) {                 // for문 시작, 반복 제어 변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 tainSeat의 n차원 배열의 크기보다 작을 동안 반복 즉 3보다 작을 동안 반복, i에 +1
            for(int j = 0; j < trainSeat[i].length; j++) {          // for문 시작, 반복 제어 변수 int형 변수 j 선언 동시에 0 대입하여 초기화, j가 trainSeat의 n-1차원 배열의 크기보다 작을 동안 반복 i번째 요소의 크기보다 작을 동안 반복 즉 10보다 작을 동안 반복, j에 +1
                for(int k = 0; k < trainSeat[i][j].length; k++) {   // for문 시작, 반복 제어 변수 int형 변수 k 선언 동시에 0 대입하여 초기화, k가 trainSeat의 n-2차원 배열의 크기보다 작을 동안 반복 i, j번째 요소의 크기보다 작을 동안 반복 즉 3보다 작을 동안 반복, k에 +1
                    if(trainSeat[i][j][k] == true) {                // 만약 trainSeat의 인덱스 i, j, k번째 요소에 저장된 값이 true이면
                        count++;                                    // 변수 count에 +1
                    }                                               // 즉 trainSeat에 인덱스 i, j, k번째 좌석이 예약되어 있는 경우, 예약된 좌석의 개수 +1
                }
            }
        }

        System.out.println(count);                              // System.out.println() 메소드 호출하여 변수 count에 저장된 값 출력, 열차의 총 예약된 좌석의 개수
    }                                                           // main() 메소드 정의 끝
}                                                               // Array 클래스 정의 끝
