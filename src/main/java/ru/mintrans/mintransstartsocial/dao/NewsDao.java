package ru.mintrans.mintransstartsocial.dao;

import ru.mintrans.mintransstartsocial.model.News;

import java.util.List;

public interface NewsDao {
    void saveNews(News news);

    News getNewsById(long id);

    List<News> getAllNews();

    void updateNews(News news);

    void deleteNewsById(long id);
}
