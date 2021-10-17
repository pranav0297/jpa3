package com.example.jpa3.mapping.demo_jpa3_mapping;

import javax.persistence.*;
import java.util.Set;

@Entity
public class author{

 @Embedded
   private address address1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int  id;
    private String name;

    @OneToMany(mappedBy = "authore",cascade = CascadeType.ALL)
    private Set<books> booksSet ;

    public address getAddress1() {
        return address1;
    }

    public void setAddress1(address address1) {
        this.address1 = address1;
    }


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

    public Set<books> getBooksSet() {
        return booksSet;
    }

    public void setBooksSet(Set<books> booksSet) {
        this.booksSet = booksSet;
    }
}
