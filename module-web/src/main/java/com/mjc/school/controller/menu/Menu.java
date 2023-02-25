package com.mjc.school.controller.menu;

import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.controller.implementation.NewsController;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Menu {
    private final NewsController newsController;
    private final AuthorController authorController;
    private final MenuHelper menuHelper;

    public Menu(NewsController newsController, AuthorController authorController) {
        this.newsController = newsController;
        this.authorController = authorController;
        this.menuHelper = new MenuHelper(newsController, authorController);
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                printMenu();
                int number = scanner.nextInt();
                switch (number){
                    case 1:menuHelper.getAllNews();break;
                    case 2:menuHelper.getAllAuthors();break;
                    case 3:menuHelper.getNewsById();break;
                }
            }catch (Exception e){

            }
        }
    }

    public void printMenu(){
        System.out.println("""
                Select menu:
                1. Get all news
                2. Get all author
                3. Get news by id
                4. Get author by id
                5. Create news
                6. Create author
                7. Update news by id
                8. Update author by id
                9. Delete news by id
                10 Delete author by id
                0. Exit
                """);
    }
}
