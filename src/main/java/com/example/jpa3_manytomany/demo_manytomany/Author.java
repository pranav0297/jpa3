package com.example.jpa3_manytomany.demo_manytomany;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int  id;
    private String name;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_books",
            joinColumns = @JoinColumn(name = "author_id",referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    private Set<Books> books;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }
}

