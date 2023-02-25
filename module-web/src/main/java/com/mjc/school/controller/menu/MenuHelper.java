package com.mjc.school.controller.menu;

import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.controller.implementation.NewsController;
import org.springframework.stereotype.Component;

@Component
public class MenuHelper {
    private final NewsController newsController;
    private final AuthorController authorController;

    public MenuHelper(NewsController newsController, AuthorController authorController) {
        this.newsController = newsController;
        this.authorController = authorController;
    }

    public void getAllNews(){
        newsController.readAll().forEach(System.out::println);
    }

    public void getAllAuthors() {
        authorController.readAll().forEach(System.out::println);
    }

    public void getNewsById(){

    }
}
