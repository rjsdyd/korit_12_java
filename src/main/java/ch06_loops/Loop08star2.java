package ch06_loops;

import java.util.Scanner;

/*
    Scanner를 이용한 별찍기

    실행 예
    몇 줄의 별을 생성하시겠습니까? >>> 3
    *
    **
    ***
    로 만들어질 수 있도록 작성하시오.
    다 하신 분들은

    ***
    **
    *

    하세요.
 */
public class Loop08star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        int row = scanner.nextInt();
        for ( int i = 0 ; i < row + 1 ; i++ ) {
            for( int j = 0 ; j < i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = row ; j - i > 0 ; j-- ){
                System.out.print("🦑");
            }
            System.out.println();
        }
    }
}