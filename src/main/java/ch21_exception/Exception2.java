package ch21_exception;

class LoginFinledException extends Exception {
    public LoginFinledException(String message) {
        super(message);     // 이건 그냥 message를 argument로 한 LoginFainledException의 슈퍼 클래스 생성자를 호출한다는 뜻
        System.out.println("로그인 시 예외가 발생");
    }
}
/*
    Exception(String message) {
        this.message = message;
    }
    인 상태라고 봐야됨. 그걸 getter(getMessage())를 통해 출력했기 때매 콘솔 상의 순서가 다르게 보임.
 */
public class Exception2 {
    public static void login(String id, String password) throws LoginFinledException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r!!";
        // 특정 메서드에서 예외가 발생하는 것을 지정하고 싶다면 throws 명령어를 입력해야 함.
        if(!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFinledException("ID 또는 PW가 틀렸습니다.");
            // throw(s가 없음) : 동사원형으로 시작했으니 명령문
            // LoginFainledException() 생성자에 String argument를 집어넣어서 객체를 생성했는데,
            // 그 객체를 던지라는 의미로 해석될 수 있음.
        }
    }
    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer!!";

//        login(inputId, inputPassword);
        // throws를 달고 나니 오류가 발생함. -> try / catch / finally 쓰라는 의미
        // 혹은 main도 method에 해당하니 main 메서드에 throws 입력해도 좋음.
        try {
            login(inputId, inputPassword);
        } catch (LoginFinledException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
