package ru.mintrans.mintransstartsocial.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mintrans.mintransstartsocial.model.News;
import ru.mintrans.mintransstartsocial.model.User;
import ru.mintrans.mintransstartsocial.services.NewsService;
import ru.mintrans.mintransstartsocial.services.UserService;

import java.net.HttpURLConnection;
import java.text.ParseException;
import java.util.List;

@RestController
public class NewsController {
    NewsService newsService = new NewsService();
    @PostMapping("/add-news")
    public int add (String header, String body, String dateOfAdding) throws ParseException {
        newsService.add(header, body, dateOfAdding);
        return HttpURLConnection.HTTP_OK;
    }

    @GetMapping("/get-news")
    public News get (long id) {
        return newsService.get(id);
    }

    @GetMapping ("/get-all-news")
    public List<News> getAll () {
        return newsService.getAll();
    }

    @PostMapping ("/update-news")
    public int update (String header, String body, String dateOfAdding) throws ParseException {
        newsService.update(header, body, dateOfAdding);
        return HttpURLConnection.HTTP_OK;
    }

    @DeleteMapping("/delete-news")
    public int delete (long id) {
        newsService.delete(id);
        return HttpURLConnection.HTTP_OK;
    }
}
