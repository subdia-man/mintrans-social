package ru.mintrans.mintransstartsocial.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.mintrans.mintransstartsocial.model.News;
import ru.mintrans.mintransstartsocial.util.HibernateConf;

import java.util.List;

public class NewsDaoImpl implements NewsDao {
    private SessionFactory factory = HibernateConf.getFactory();
    @Override
    public void saveNews(News news) {
        Transaction transaction = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            session.save(news);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
    }

    @Override
    public News getNewsById(long id) {
        Transaction transaction = null;
        News news = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            news = session.get(News.class, id);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
        return news;
    }

    @Override
    public List<News> getAllNews() {
        Transaction transaction = null;
        List<News> news = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            news = session.createQuery("from News").list();
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
        return news;    }

    @Override
    public void updateNews(News news) {
        Transaction transaction = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(news);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
    }

    @Override
    public void deleteNewsById(long id) {
        Transaction transaction = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            News news = session.get(News.class, id);
            session.delete(news);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
    }
}
