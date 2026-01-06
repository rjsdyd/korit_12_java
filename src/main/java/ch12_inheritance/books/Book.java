package ch12_inheritance.books;

public class Book {
    // 필드
    private String title;
    private String author;

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter / setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void showInfo() {
        System.out.println("제목 : " + getTitle());
        System.out.println("저자 : " + getAuthor());
    }
}
