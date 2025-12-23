package ch05_condition;

import java.util.Scanner;

public class Condition05Task {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 50점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >> 68
            이름을 입력하세요 김일
            김일 학생의 점수는 68점이고, 학점은 D입니다.
         */
//        Scanner scanner = new Scanner(System.in);
//        int score = 0;
//        String name;
//        char grade = 'A';
//        char grade2 = 'B';
//        char grade3 = 'C';
//        char grade4 = 'D';
//        char grade5 = 'F';
//        System.out.print("점수를 입력하세요 >>> ");
//        scanner.nextInt();
//        System.out.print("이름을 입력하세요 >>> ");
//        scanner.nextLine();
//        if (score > 90) {
//            grade = 'A';
//        } else if (score > 80) {
//            grade2 = 'B';
//        } else if (score > 70) {
//            grade3 = 'C';
//        } else if (score > 60) {
//            grade4 = 'D';
//        } else if (score < 50){
//            grade5 = 'F';
//        }
//        System.out.println();
        // 문제 풀이
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        if (score > 89) {
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

        System.out.println(name + "학생의 점수는 " + score + "점이고," + "학점은 " + grade + "입니다.");
    }
}

