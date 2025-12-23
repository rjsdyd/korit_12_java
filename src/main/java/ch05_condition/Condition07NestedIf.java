package ch05_condition;

import java.util.Scanner;

/*
    중첩 if문 (Nested - if sentence) :
        if문 내에 if문이 중첩적으로 사용 가능

    형식 :
    if(조건식1) {
        실행문1
        if(조건식1a) {
        실행문1a
        } else if(조건식1b) {
            실행문1b
        } else if(조건식1c) {
            실행문1c
        } else {
            실행문1d
        }
        실행문1-2
     } else if (조건식2) {
        실행문 2-1
        if(조건식2) {
        실행문2
        if(조건식2a) {
        실행문2a
        } else if(조건식2b) {
            실행문2b
        } else if(조건식2c) {
            실행문2c
        } else {
            실행문2d
        }
        실행문 2-2
        }
    }
}
 */
public class Condition07NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        // 중첩 if문
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");
    }
}
