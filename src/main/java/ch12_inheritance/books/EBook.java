package ch12_inheritance.books;

public class EBook extends Book{
    // 필드
    private double fileSize;
    private String format;

    // 생성자
    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    // getter / setter
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public void showInfo() {
        System.out.println("제목 : " + getTitle());
        System.out.println("저자 : " + getAuthor());
        System.out.println("크기 : " + getFileSize() + "MB");
        System.out.println("형식 : " + getFormat());

    }
}
