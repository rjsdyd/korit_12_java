package ch16_bean;

import ch14_casting.centralcontrol.Power;
import lombok.Getter;

/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |      -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
@Getter
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    // 기본 생성자로 User1 객체를 생성
    // 알아서 method 정의
    // username 1
    // password 1234
    // email a@test.com
    // name 안근수

    public UserEntity(int username, int password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public UserEntity() {

    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "username : " + username +
                "\npassword : " + password +
                "\nemail : " + email +
                "\nname : " + name;
    }
}
