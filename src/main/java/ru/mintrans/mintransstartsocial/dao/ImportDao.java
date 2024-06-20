package ru.mintrans.mintransstartsocial.dao;

import ru.mintrans.mintransstartsocial.model.Import;
import ru.mintrans.mintransstartsocial.model.News;

import java.util.List;

public interface ImportDao {
    void saveImport(Import newImport);

    Import getImportById(long id);

    List<Import> getAllImports();

    void updateImport(Import importToUpdate);

    void deleteImportById(long id);
}
