package ch09_getter_setter.univ_student;

public class UnivStudent2 {
    String name;
    int grade;
    double score;

    public UnivStudent2() {
    }

    public UnivStudent2(String name) {
        this.name = name;
    }

    public UnivStudent2(int grade) {
        this.grade = grade;
    }

    public UnivStudent2(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent2(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        if(score < 0 || score > 4.5) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade < 0 || grade > 4) {
            System.out.println("불가능한 학년 입력입니다.");
            System.out.println("입력된 값: " + grade);
            return;
        }
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score < 0 || score > 4.5) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    public void showInfo() {
        System.out.println("\n이름 : " + name + "\n학년 : " + grade + "\n점수 : " + score);
    }
}