package ru.mintrans.mintransstartsocial.services;

import ru.mintrans.mintransstartsocial.dao.NewsDao;
import ru.mintrans.mintransstartsocial.dao.NewsDaoImpl;
import ru.mintrans.mintransstartsocial.model.News;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsService {

    NewsDao dao = new NewsDaoImpl();

    public void add (String header, String body, String doa) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(doa);
        News news = new News(header, body, date);
        dao.saveNews(news);
    }

    public News get (long id) {
        return dao.getNewsById(id);
    }

    public List<News> getAll () {
        return dao.getAllNews();
    }

    public void update (String header, String body, String doa) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(doa);
        News news = new News(header, body, date);
        dao.updateNews(news);
    }

    public void delete (long id) {
        dao.deleteNewsById(id);
    }
}
