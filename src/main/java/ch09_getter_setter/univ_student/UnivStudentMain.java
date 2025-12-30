package ch09_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent2 student1 = new UnivStudent2();
        UnivStudent2 student2 = new UnivStudent2();
        UnivStudent2 student3 = new UnivStudent2();
        UnivStudent2 student4 = new UnivStudent2();
        UnivStudent2 student5 = new UnivStudent2();

        student1.setName("김일");
        student2.setName("김이");
        student3.setName("김삼");
        student4.setName("김사");
        student5.setName("김오");

        student1.setGrade(1);
        student2.setGrade(3);
        student3.setGrade(5);
        student3.setGrade(2);
        student4.setGrade(4);
        student5.setGrade(2);

        student1.setScore(3.3);
        student2.setScore(-30);
        student2.setScore(4);
        student3.setScore(2.7);
        student4.setScore(3.8);
        student5.setScore(1);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();


        // 생성자 내부에 로직을 작성한 예시
        UnivStudent2 student6 = new UnivStudent2("김육", 1, -100);
        System.out.println(student6.getName());     // 결과값 : 김육
        System.out.println(student6.getGrade());    // 결과값 : 1
        System.out.println(student6.getScore());    // 결과값 : 0.0


    }
}