package com.realdolmen.ProjectOefeningShop.service;

import com.realdolmen.ProjectOefeningShop.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    private final List<Article> articles = new ArrayList<>();

    public List<Article> getAllArticles() {
        // TODO: get articles from database
        articles.add(new NonFiction());
        articles.add(new Fiction());
        articles.add(new Game());
        articles.add(new Lp());

        return articles;
    }
}
