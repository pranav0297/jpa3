package com.example.jpa3.mapping.demo_jpa3_mapping;

import javax.persistence.*;

@Entity
public class books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookname;

    @ManyToOne
    @JoinColumn(name = "authore_id")
    private author authore;

    public author getAuthore() {
        return authore;
    }

    public void setAuthore(author authore) {
        this.authore = authore;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }


}



