package com.realdolmen.ProjectOefeningShop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Lp extends Article {
    private String publisher;
    private LpGenre genre;
}
