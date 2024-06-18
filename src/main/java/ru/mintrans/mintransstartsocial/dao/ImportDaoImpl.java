package ru.mintrans.mintransstartsocial.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.mintrans.mintransstartsocial.model.Import;
import ru.mintrans.mintransstartsocial.model.News;
import ru.mintrans.mintransstartsocial.util.HibernateConf;

import java.util.List;

public class ImportDaoImpl {

    private SessionFactory factory = HibernateConf.getFactory();

    void saveImport(Import newImport) {
        Transaction transaction = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            session.save(newImport);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
    }

    Import getImportById(long id) {
        Transaction transaction = null;
        Import newImport = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            newImport = session.get(Import.class, id);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
        return newImport;
    }

    List<Import> getAllImports() {
        Transaction transaction = null;
        List<Import> imports = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            imports = session.createQuery("from Import").list();
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
        return imports;
    }

    void updateImport(Import importToUpdate) {
        Transaction transaction = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(importToUpdate);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
    }

    void deleteImportById(long id) {
        Transaction transaction = null;
        try(Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            Import importToDelete = session.get(Import.class, id);
            session.delete(importToDelete);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
        }
    }
}
