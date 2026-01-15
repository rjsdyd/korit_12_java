package ch21_exception.scores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreMain {
    public static void checkScore(int score) throws InvalidScoreException {
        if(score < 0 || score > 101) {
            throw new InvalidScoreException("점수는 0~100점 사이여야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");

        try {
            int score = scanner.nextInt();
            checkScore(score);
        } catch (InvalidScoreException e) {
            System.out.println("점수 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
