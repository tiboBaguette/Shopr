package com.realdolmen.ProjectOefeningShop.controller;

import com.realdolmen.ProjectOefeningShop.model.Article;
import com.realdolmen.ProjectOefeningShop.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ArticleController {
    private final ArticleService articleService = new ArticleService();

    @RequestMapping({"", "/"})
    public List<Article> showArticles() {
        List<Article> articles = articleService.getAllArticles();

        return articles;
    }
}
