package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut,String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        if (isCheckedOut == true) {
            isCheckedOut = true;
            checkedOutTo = name;
        }
    }
    public void checkIn(){
        if (isCheckedOut){
            isCheckedOut = false;
            checkedOutTo = "";
        }
    }
    public String userOutput(){
        return "ID: " + id + "| ISBN: " + isbn +"| Book name '" + title + "'| Checked out status: " + isCheckedOut;
    }
    public String fullDetails(){
        return userOutput() + "| Checked out to: " + checkedOutTo;
    }
}
