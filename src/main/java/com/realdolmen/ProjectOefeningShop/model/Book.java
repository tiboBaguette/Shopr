package com.realdolmen.ProjectOefeningShop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public abstract class Book extends Article {
    private String author;
    private String isbn;
    private int pages;
}
