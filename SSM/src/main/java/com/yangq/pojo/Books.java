package com.yangq.pojo;

/*使用lombok插件！*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

    public int getBookID() {  //这里不知道为什么我的IDEA会报红BookMapper.xml的方法，所以手动专门实现了这个
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}