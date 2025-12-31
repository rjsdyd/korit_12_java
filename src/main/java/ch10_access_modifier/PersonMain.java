package ch10_access_modifier;

class Person {
    private String name;

    // alt + insert : 생성자
    public String getName() {
        System.out.print("현재이름 : ");
        return name;
    }

    public void setName(String name) {
        if (name.length() < 5) {
            this.name = name;
            System.out.println("이름이 " + this.name + "으로 설정되었습니다.");
        } else System.out.println("글자 수 제한을 넘어섰습니다.");
    }
// field를 privite 접근 제어자 / 지정자 / 제한자
        // 것은 -> main 단계에서 객체를 생성하고, 그 객체의
        // field에 값을 객체명.속성명 = 데이터; 를 통해서
        // 바꿀 수 없다는 것을 의미합니다.
        // 그렇다면 앞으로는 setter / getter를 통해서
        // field 값을 설정 및 조회해야한다는 것을 의미함.
    }

    /*
        setter / getter는 default로 access modifier가 public으로 생성됐었습니다.

        PersonMain 클래스에서 person1 객체를 생성하고,
        setter / getter를 통해서 처음 이름을 "김일"로 초기화하고,
        그 이름을 콘솔에 출력합니다.
        다시 그 이름을 "브래드피트"로 수정하면, "글자 수 제한을 넘어섰습니다."라는 안내문이 출력되면서 메서드를 종료시키고,
        "이일"로 수정할 수 있도록 setter를 설정하시고 getter를 통해서 조회할 때
        현재 이름 : 이일
        로 나올 수 있도록 작성하시오.

        실행 예
        이름이 김일로 설정되었습니다.
        글자 수 제한을 넘어섰습니다.
        이름이 이일로 설정되었습니다.
        현재 이름 : 이일
     */
    public class PersonMain {
        public static void main(String[] args) {
            // 객체 생성
            Person person1 = new Person();
            person1.setName("김일");
            person1.setName("브래드피트");
            person1.setName("이일");
            String name = person1.getName();
            System.out.println(name);
        }
    }

