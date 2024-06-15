package ru.mintrans.mintransstartsocial.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "import")
public class Import {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long newsId;
    private String from;
    private String where;

    @Temporal(TemporalType.DATE)
    private Date doi; //date of import
    public Import() {
        super();
    }

    public Import(String from, String where, Date doi) {
        super();
        this.from = from;
        this.where = where;
        this.doi = doi;
    }

    public Import(long newsId, String from, String where, Date doi) {
        super();
        this.newsId = newsId;
        this.from = from;
        this.where = where;
        this.doi = doi;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getWhere() {
        return where;
    }
    public void setWhere(String where) {
        this.where = where;
    }
    public Date getDoi() {
        return doi;
    }
    public void setDoi(Date doi) {
        this.doi = doi;
    }
}
