package ru.mintrans.mintransstartsocial.model;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class News {
    private long id;
    private String header;
    private String body;

    @Temporal(TemporalType.DATE)
    private Date doa; //date of adding
    public News() {
        super();
    }

    public News(String header, String body, Date doa) {
        super();
        this.header = header;
        this.body = body;
        this.doa = doa;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public Date getDoa() {
        return doa;
    }
    public void setDoa(Date doa) {
        this.doa = doa;
    }
}
