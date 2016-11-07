package com.jvs.ws.entities;

/**
 * Created by jorgevs on 11/6/2016.
 */
public class Book {
    private long bookId;
    private String title;
    private String author;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

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

}
