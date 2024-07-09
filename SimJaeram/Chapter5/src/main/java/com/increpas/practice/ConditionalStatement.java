package com.increpas.practice;

import java.util.Scanner;

public class ConditionalStatement {                         // CoditinalStatement 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작

        // 단순 if문
        int ageOfJohn = 17;                                 // int형 변수 ageOfJohn 선언 동시에 17 대입하여 초기화, John의 나이 17살

        int ageOfMichael = 25;                              // int형 변수 ageOfMichael 선언 동시에 25 대입하여 초기화, Michael의 나이 25살

        int movieGrade = 20;                                // int형 변수 movieGrade 선언 동시에 20 대입하여 초기화, 영화 관람 등급 20살

        if(ageOfJohn >= movieGrade) {                       // 만약 변수 ageOfJohn에 저장된 값이 변수 movieGrade에 저장된 값보다 크거나 같으면, 즉 John의 나이가 영화 관람 등급 이상이면
            System.out.println("john : 관람가능");           // System.out.println() 메소드 호출하여 문자열 "john : 관람가능" 출력, 즉 john 관람 가능 안내 메세지 출력
        }

        if(ageOfMichael >= movieGrade) {                    // 만약 변수 ageOfMichael에 저장된 값이 변수 movieGrade에 저장된 값보다 크거나 같으면, 즉 Michael의 나이가 영화 관람 등급 이상이면
            System.out.println("Michael : 관람가능");        // System.out.println() 메소드 호출하여 문자열 "Michael : 관람가능" 출력, 즉 Michael 관람 가능 안내 메세지 출력
        }

        System.out.println("연령체크 완료!");                 // System.out.println() 메소드 호출하여 문자열 "연령체크 완료!" 출력, 즉 연령 체크 완료 안내 메세지 출력

        // if-else문
        int scoreOfJohn = 72;                               // int형 변수 scoreOfJohn 선언 동시에 72 대입하여 초기화, John의 점수 72점
        String msgOfJohn = "";                              // String형 변수 msgOfJohn 선언 동시에 빈 문자열 객체 생성 후 대입하여 초기화, John에게 안내할 메세지

        int scoreOfMichael = 58;                            // int형 변수 scoreOfMichael 선언 동시에 72 대입하여 초기화, Michael의 점수 58점
        String msgOfMichael = "";                           // String형 변수 msgOfMichael 선언 동시에 빈 문자열 객체 생성 후 대입하여 초기화, Michael에게 안내할 메세지

        int testCutline = 60;                               // int형 변수 testCutline 선언 동시에 60 대입하여 초기화, 시험 컷트라인 점수 60점

        if(scoreOfJohn >= testCutline) {                    // 만약 변수 scoreOfJohn에 저장된 값이 변수 testCutline에 저장된 값보다 크거나 같으면, 즉 John의 점수가 시험 컷트라인 점수보다 크거나 같으면
            msgOfJohn = "John! 축하합니다. 합격입니다.";        // 변수 msgOfJohn에 문자열 "John! 축하합니다. 합격입니다." 대입하여 저장, John에게 안내할 메세지
        }
        else {                                              // 그렇지 않으면, 즉 John의 점수가 시험 컷트라인 점수보다 작으면
            msgOfJohn = "John! 안타깝습니다. 불합격입니다.";    // 변수 msgOfJohn에 문자열 "John! 안타깝습니다. 불합격입니다." 대입하여 저장, John에게 안내할 메세지
        }

        if(scoreOfMichael >= testCutline) {                 // 만약 변수 scoreOfMichael에 저장된 값이 변수 testCutline에 저장된 값보다 크거나 같으면, 즉 Michael의 점수가 시험 컷트라인 점수보다 크거나 같으면
            msgOfMichael = "Michael! 축하합니다. 합격입니다.";  // 변수 msgOfMichael에 문자열 "Michael! 축하합니다. 합격입니다." 대입하여 저장, Michael에게 안내할 메세지
        }
        else {                                              // 그렇지 않으면, 즉 Michael의 점수가 시험 컷트라인 점수보다 작으면
            msgOfMichael = "Michael! 안타깝습니다. 불합격입니다.";// 변수 msgOfMichael에 문자열 "Michael! 안타깝습니다. 불합격입니다." 대입하여 저장, Michael에게 안내할 메세지
        }

        System.out.println(msgOfJohn);                      // System.out.println() 메소드 호출하여 변수 msgOfJohn에 저장된 문자열 출력, John에게 안내할 메세지
        System.out.println(msgOfMichael);                   // System.out.println() 메소드 호출하여 변수 msgOfMichael에 저장된 문자열 출력, Michael에게 안내할 메세지
        System.out.println("프로그램 종료!");                 // System.out.println() 메소드 호출하여 문자열 "프로그램 종료!" 출력, 프로그램 종료 안내 메세지 출력


        // 다중 if-else문
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스 객체 numberScanner 생성
        System.out.println("할인을 도와드립니다. 총 구매액이 얼마입니까?");// System.out.println() 메소드 호출하여 문자열 "할인을 도와드립니다. 총 구매액이 얼마입니까?" 출력, 총 구매액 입력 안내 메세지 출력
        int totalPrice = scanner.nextInt();                 // int형 변수 totalPrice 선언 동시에 numberScanner 객체의 nextInt() 메소드 호출하여 사용자로 부터 입력 받은 값을 리턴 받아 대입하여 초기화, 총 구매액

        if(totalPrice < 0) {                                // 만약 변수 totalPrice에 저장된 값이 0보다 작으면, 즉 총 구매액이 음수이면
            System.out.println("잘못된 입력입니다.");          // System.out.println() 메소드 호출하여 문자열 "잘못된 입력입니다." 출력, 잘못된 입력 안내 메세지 출력
            return;                                         // main() 메소드에서 리턴, 프로그램 종료
        } else if(totalPrice <= 10_000) {                   // 그렇지 않고 만약 변수 totalPrice에 저장된 값이 10_000보다 작거나 같으면, 즉 총 구매액이 0원 이상이고 10_000원 이하이면
            totalPrice -= totalPrice * 0.01;                // 변수 totalPrice에 totalPrice - totalPrice * 0.01 연산 결과 대입하여 저장, 즉 총 구매액에 1% 할인
            //totalPrice = totalPrice - totalPrice * 0.01;
        } else if(totalPrice <= 100_000) {                  // 그렇지 않고 만약 변수 totalPrice에 저장된 값이 100_000보다 작거나 같으면, 즉 총 구매액이 10_000원 초과이고 100_000원 이하이면
            totalPrice -= totalPrice * 0.05;                // 변수 totalPrice에 totalPrice - totalPrice * 0.05 연산 결과 대입하여 저장, 즉 총 구매액에 5% 할인
        } else {                                            // 그렇지 않으면, 즉 총 구매액이 100_000원 초과이면
            totalPrice -= totalPrice * 0.1;                 // 변수 totalPrice에 totalPrice - totalPrice * 0.1 연산 결과 대입하여 저장, 즉 총 구매액에 10% 할인
        }

        System.out.println("지불하실 가격은 " + totalPrice + "원 입니다."); // System.out.println() 메소드 호출하여 문자열 "지불하실 가격은 " + totalPrice + "원 입니다." 출력
                                                                        // 총 구매액에서 할인된 지불 가격 안내 메세지 출력

        // 중첩된 if문
        System.out.println("성별을 입력하십시오.('남' 또는 '여')");// System.out.println() 메소드 호출하여 문자열 "성별을 입력하십시오.('남' 또는 '여')" 출력, 성별 입력 안내 메세지 출력
        char gender = scanner.next().charAt(0);             // char형 변수 gender 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열을 chatAt() 메소드 호출하여 인덱스 0번째 문자만 리턴 받아 대입하여 초기화
                                                            // scanner 객체의 문자만 입력 받는 메소드가 없으므로 문자열을 입력 받아 인덱스 0번째 문자를 떼어냄
        if(gender == '남') {                                 // 만약 변수 gender에 저장된 값이 '남'이면, 즉 사용자가 입력한 성별이 '남'이면
            System.out.println("만으로 나이를 입력하십시오");   // System.out.println() 메소드 호출하여 문자열 "만으로 나이를 입력하십시오" 출력, 즉 만 나이 입력 안내 메세지 출력
            int age = scanner.nextInt();                    // int형 변수 age 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴받아 대입하여 초기화, 즉 사용자가 입력한 만 나이 저장

            if(age <= 16)                                   // 만약 변수 age에 저장된 값이 16보다 작거나 같으면, 즉 사용자가 입력한 만 나이가 16살 이하이면
                System.out.println("만 16세 이하는 지원이 불가능합니다."); // System.out.println() 메소드 호출하여 문자열 "만 16세 이하는 지원이 불가능합니다." 출력, 즉 만 16세 이하 지원 불가능 안내 메세지 출력
            else if(age <= 37)                              // 그렇지 않고 만약 변수 age에 저장된 값이 37보다 작거나 같으면, 즉 사용자가 입력한 만 나이가 16살 초과 37살 이하이면
                System.out.println("지원이 가능합니다.");      // System.out.println() 메소드 호출하여 문자열 "지원이 가능합니다." 출력, 즉 만 17세 이상 37세 이하 지원 가능 안내 메세지 출력
            else                                            // 그렇지 않으면, 즉 변수 age에 저장된 값이 37보다 크면, 즉 사용자가 입력한 만 나이가 37살 초과면
                System.out.println("만 38세 이상은 지원이 불가능합니다.");// System.out.println() 메소드 호출하여 문자열 "만 38세 이상은 지원이 불가능합니다." 출력, 즉 만 38세 이상이면 지원 불가능 안내 메세지 출력
        } else                                              // 그렇지 않으면, 변수 gender에 저장된 값이 '남'이 아니면, 즉 사용자가 입력한 성별이 '여'이면
            System.out.println("여성은 여군지원 페이지를 이용해주세요.");// System.out.println() 메소드 호출하여 문자열 "여성은 여군지원 페이지를 이용해주세요." 출력, 즉 여성은 여군지원 페이지 이용 안내 메세지 출력

        // switch문
        System.out.println(":::XX헬스클럽 이용혜택:::");       // System.out.println() 메소드 호출하여 문자열 ":::XX헬스클럽 이용혜택:::" 출력, 즉 XX헬스클럽 이용혜택 안내 메세지 출력
        System.out.println("결제하신 개월 수를 입력하세요(2 개월 이상)"); // System.out.println() 메소드 호출하여 문자열 "결제하신 개월 수를 입력하세요(2 개월 이상)" 출력, 즉 이용혜택 안내를 위해 결제한 개월 수 입력 안내 메세지 출력
        int month = scanner.nextInt();                      // int형 변수 month 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 즉 사용자가 결제한 개월 수

        switch(month) {                                     // switch문 시작, 변수 month에 저장된 값에 따라 해당되는 case문으로 분기
            default:                                        // 변수 month에 저장된 값이 모든 case에 해당되지 않는 경우, 즉 사용자가 결제한 개월 수가 7개월 이상인 경우
                System.out.println("회비 50% 할인!");        // System.out.println() 메소드 호출하여 문자열 "회비 50% 할인!" 출력, 즉 회비 50% 할인! 이용혜택 안내 메세지 출력
                break;                                      // switch문을 빠져나감
            case 6:                                         // 변수 month에 저장된 값이 6인 경우, 즉 사용자가 결제한 개월 수가 6개월인 경우
                System.out.println("한 달 개별 코칭!");       // System.out.println() 메소드 호출하여 문자열 "한 달 개별 코칭!" 출력, 즉 한 달 개별 코칭! 이용혜택 안내 메세지 출력
            case 5:                                         // 변수 month에 저장된 값이 5인 경우, 즉 사용자가 결제한 개월 수가 5개월인 경우
                System.out.println("한 달 무료이용권!");       // System.out.println() 메소드 호출하여 문자열 "한 달 무료이용권!" 출력, 즉 한 달 무료이용권! 이용혜택 안내 메세지 출력
                break;                                      // switch문을 빠져나감
            case 4:                                         // 변수 month에 저장된 값이 4인 경우, 즉 사용자가 결제한 개월 수가 4개월인 경우
                System.out.println("러닝화 제공!");          // System.out.println() 메소드 호출하여 문자열 "러닝화 제공!" 출력, 즉 러닝화 제공! 이용혜택 안내 메세지 출력
            case 3:                                         // 변수 month에 저장된 값이 3인 경우, 즉 사용자가 결제한 개월 수가 3개월인 경우
                System.out.println("헬스복 제공!");           // System.out.println() 메소드 호출하여 문자열 "헬스복 제공!" 출력, 즉 헬스복 제공! 이용혜택 안내 메세지 출력
                break;                                      // switch문을 빠져나감
            case 2:                                         // 변수 month에 저장된 값이 2인 경우, 즉 사용자가 결제한 개월 수가 2개월인 경우
                System.out.println("락커룸 1달 이용권");       // System.out.println() 메소드 호출하여 문자열 "락커룸 1달 이용권" 출력, 즉 락커룸 1달 이용권 이용혜택 안내 메세지 출력
                break;                                      // switch문을 빠져나감
        }                                                   // switch문 끝

        // if문 vs switch문
        System.out.println("월을 입력하세요");                 // System.out.println() 메소드 호출하여 문자열 "월을 입력하세요" 출력, 즉 월 입력 안내 메세지 출력
        month = scanner.nextInt();                          // 변수 month에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 저장
        switch(month) {                                     // switch문 시작, 변수 month에 저장된 값에 따라 해당되는 case문으로 분기
            case 1:                                         // 변수 month에 저장된 값이 1인 경우, 즉 1월인 경우
            case 3:                                         // 변수 month에 저장된 값이 3인 경우, 즉 3월인 경우
            case 5:                                         // 변수 month에 저장된 값이 5인 경우, 즉 5월인 경우
            case 7:                                         // 변수 month에 저장된 값이 7인 경우, 즉 7월인 경우
            case 8:                                         // 변수 month에 저장된 값이 8인 경우, 즉 8월인 경우
            case 10:                                        // 변수 month에 저장된 값이 10인 경우, 즉 10월인 경우
            case 12:                                        // 변수 month에 저장된 값이 12인 경우, 즉 12월인 경우
                System.out.println("31일");                 // System.out.println() 메소드 호출하여 문자열 "31일" 출력, 즉 1, 3, 5, 7, 8, 10, 12월은 총 31일 안내 메세지 출력
                break;                                      // switch문을 빠져나감
            case 4:                                         // 변수 month에 저장된 값이 4인 경우, 즉 4월인 경우
            case 6:                                         // 변수 month에 저장된 값이 6인 경우, 즉 6월인 경우
            case 9:                                         // 변수 month에 저장된 값이 9인 경우, 즉 9월인 경우
            case 11:                                        // 변수 month에 저장된 값이 11인 경우, 즉 11월인 경우
                System.out.println("30일");                  // System.out.println() 메소드 호출하여 문자열 "30일" 출력, 즉 4, 6, 9, 11월은 총 30일 안내 메세지 출력
                break;                                      // switch문을 빠져나감
            case 2:                                         // 변수 month에 저장된 값이 2인 경우, 즉 2월인 경우
                System.out.println("28일");                  // System.out.println() 메소드 호출하여 문자열 "28일" 출력, 즉 2월은 총 28일 안내 메세지 출력
                break;                                      // switch문을 빠져나감
            default:                                        // 변수 month에 저장된 값이 모든 case에 해당되지 않은 경우, 즉 1월인 경우
                System.out.println("잘못된 입력");           // System.out.println() 메소드 호출하여 문자열 "잘못된 입력" 출력, 즉 사용자가 입력한 월이 잘못됨 안내 메세지 출력
        }                                                  // switch문 끝

        if(month == 1 || month == 3 || month == 5 || month == 7 // if문 시작, 만약 변수 month에 저장된 값이 1이거나 또는 3이거나 또는 5이거나 또는 7이거나 또는
                || month == 8 || month == 10 || month == 12) {  // 8이거나 또는 10이거나 또는 12면
            System.out.println("31일");                         // System.out.println() 메소드 호출하여 문자열 "31일" 출력, 즉 1, 3, 5, 7, 8, 10, 12월은 총 31일 안내 메세지 출력
        } else if(month == 4 || month == 6 || month == 9 || month == 11) { // 그렇지 않고 만약 변수 month에 저장된 값이 4이거나 또는 6이거나 또는 9이거나 또는 11이면
            System.out.println("30일");                         // System.out.println() 메소드 호출하여 문자열 "30일" 출력, 즉 4, 6, 9, 11월은 총 30일 안내 메세지 출력
        } else if(month == 2) {                                 // 그렇지 않고 만약 변수 month에 저장된 값이 2이면
            System.out.println("28일");                         // System.out.println() 메소드 호출하여 문자열 "28일" 출력, 즉 2월은 총 28일 안내 메세지 출력
        } else {                                                // 그렇지 않으면, 즉 변수 month에 저장된 값이 1 ~ 12월에 해당되지 않은 경우
            System.out.println("잘못된 입력");                    // System.out.println() 메소드 호출하여 문자열 "잘못된 입력" 출력, 즉 사용자가 입력한 월이 잘못됨 안내 메세지 출력
        }                                                       // if문 끝

    }                                                      // main() 메소드 정의 끝
}                                                          // CoditinalStatement 클래스 정의 끝
