package ru.mintrans.mintransstartsocial.services;

import ru.mintrans.mintransstartsocial.dao.ImportDao;
import ru.mintrans.mintransstartsocial.dao.ImportDaoImpl;
import ru.mintrans.mintransstartsocial.model.Import;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ImportService {

    ImportDaoImpl dao = new ImportDaoImpl();

    public void add (String from, String where, String doi) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(doi);
        Import newImport = new Import(from, where, date);
        dao.saveImport(newImport);
    }

    public Import get (long id) {
        return dao.getImportById(id);
    }

    public List<Import> getAll () {
        return dao.getAllImports();
    }

    public void update (String from, String where, String doi) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(doi);
        Import importToUpdate = new Import(from, where, date);
        dao.updateImport(importToUpdate);
    }

    public void delete (long id) {
        dao.deleteImportById(id);
    }

}
