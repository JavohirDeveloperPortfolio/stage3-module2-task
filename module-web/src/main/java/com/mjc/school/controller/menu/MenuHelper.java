package com.mjc.school.controller.menu;

import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.controller.implementation.NewsController;
import com.mjc.school.service.dto.AuthorDtoResponse;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import org.springframework.stereotype.Component;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter news Id: ");
        Long id = scanner.nextLong();
        NewsDtoResponse newsDtoResponse = newsController.readById(id);
        System.out.println(newsDtoResponse);
    }

    public void getAuthorById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author Id: ");
        Long id = scanner.nextLong();
        AuthorDtoResponse authorDtoResponse = authorController.readById(id);
        System.out.println(authorDtoResponse);
    }

    public void createNews() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter news title: ");
        String title = scanner.nextLine();
        System.out.println("Enter news content: ");
        String content = scanner.nextLine();
        System.out.println("Enter news author id");
        Long authorId = scanner.nextLong();
        NewsDtoRequest createRequest = new NewsDtoRequest(title, content, authorId);
        NewsDtoResponse newsDtoResponse = newsController.create(createRequest);
    }
}
