package ch08_classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        // 기본 생성자로 만들었으니까 전체 필드에 값을 대입해야합니다.
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;
        // 이까지가 student1 객체 생성과 필드에 값 대입 부분입니다.
        // 이하의 부분부터는 하나~세 개의 필드에 값이 이미 있는 상태로
        // 객체가 생성되겠네요. 그러면 0 ~ 2 개의 필드에 값을 대입하는 코드가
        // 있어야 할 것 같습니다.
        Student student2 = new Student(2025002);
        student2.name = "김이";
        student2.score = 100;

        Student student3 = new Student("김삼");
        student3.studentCode = 2025003;
        student3.score = 95.8;

        Student student4 = new Student(2025004, "김사");
        student4.score = 4;

        Student student5 = new Student(2025005, "김오", 80.7);
        System.out.println();   // 개행을 위한 sout

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();

        Student2 student21 = new Student2(2026001, "김이십일", 1000);
    }
}