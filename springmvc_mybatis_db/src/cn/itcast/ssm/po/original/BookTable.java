package cn.itcast.ssm.po.original;

import java.util.Date;

public class BookTable {
    private String bookId;

    private String bookName;

    private String bookType;

    private Date bookAge;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Date getBookAge() {
        return bookAge;
    }

    public void setBookAge(Date bookAge) {
        this.bookAge = bookAge;
    }
}