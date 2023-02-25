package com.mjc.school.repository.data;

import com.mjc.school.repository.model.impl.AuthorEntity;
import com.mjc.school.repository.model.impl.NewsEntity;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataSource {
    private final List<AuthorEntity> authors;
    private final List<NewsEntity> news;
    private final Random random = new Random();


    public DataSource() {
        this.authors = getAuthorsData();
        this.news = getNewsData();
    }

    public List<AuthorEntity> getAuthors(){
        return authors;
    }

    public List<NewsEntity> getNews(){
        return news;
    }

    private List<AuthorEntity> getAuthorsData(){
        List<AuthorEntity> authorEntityList = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            authorEntityList.add(new AuthorEntity((long)i,readFile("authors")));
        }
        return authorEntityList;
    }

    private List<NewsEntity> getNewsData(){
        List<NewsEntity> newsEntityList = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            newsEntityList.add(new NewsEntity((long)i,readFile("news"),readFile("content"),(long)i));
        }
        return newsEntityList;
    }

    private String readFile(String fileName){
        int lineNumber = random.nextInt(30);
        String result = "";
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);
        if (inputStream == null){
            throw new IllegalArgumentException(fileName + " not found");
        }
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

        for (int i = 0; i <= 30; i ++){
            try {
                result = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (i == lineNumber){
                return result;
            }
        }

        return result;
    }

}
