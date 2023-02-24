package com.mjc.school;

import com.mjc.school.config.CustomConfig;
import com.mjc.school.controller.menu.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main extends AnnotationConfigApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CustomConfig.class);
        Menu menu = context.getBean(Menu.class);
        menu.start();
    }
}
