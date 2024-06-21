package ru.mintrans.mintransstartsocial.util;

import ru.mintrans.mintransstartsocial.model.Import;
import ru.mintrans.mintransstartsocial.model.News;

import java.io.IOException;
import java.util.Date;

public class ImportToNewsConverter {
    private Import utilImport = new Import();
    private News utilNews = new News();

    public News ConvertImportToNews (Import incomingImport) throws IOException {
        // disassembly incomingImport to from and where references
        String importFrom = GetImportFromReference(incomingImport);
        String importWhere = GetImportWhereReference(incomingImport);
        // save date of import
        Date doa = incomingImport.getDoi();
        // take data from where, segregate header and data
        String headerOfIncomingImport = GetHeaderFromImport(importFrom);
        String bodyOfIncomingImport = GetBodyFromImport(importFrom);
        // construct News
        News incomingNewsFromImport = new News(headerOfIncomingImport, bodyOfIncomingImport, doa);
        return incomingNewsFromImport;
    }

    public String GetImportFromReference (Import incomingImport) {
        return incomingImport.getFrom();
    }

    public String GetImportWhereReference (Import incomingImport) {
        return incomingImport.getWhere();
    }

    public String GetHeaderFromImport (String importFrom) {
        String header = "Some header";
        return header;
    }

    public String GetBodyFromImport (String importFrom) {
        String body = "Some body";
        return body;
    }
}
