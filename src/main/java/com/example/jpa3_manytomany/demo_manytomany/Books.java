package com.example.jpa3_manytomany.demo_manytomany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookname;

@ManyToMany(mappedBy = "books")
private Set<Author> authorSet;

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

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }
}



