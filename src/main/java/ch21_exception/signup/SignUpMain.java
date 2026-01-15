package ch21_exception.signup;

import ch21_exception.scores.ScoreMain;

import java.util.Scanner;

public class SignUpMain {
    public static void checkId(String id) throws InvalidIdException {
        if(id.length() < 8) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 >> ");

        try {
            String id = scanner.nextLine().replace(" ", "");
            checkId(id);
        } catch (InvalidIdException e) {
            System.out.println("아이디 입력 오류 : " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
