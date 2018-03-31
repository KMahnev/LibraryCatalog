package com.sberbank.librarycatalog.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.security.x509.NameConstraintsExtension;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "library")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "titleauthor")
    private String titleauthor;

    @Column(name = "publishing")
    private String publishing;

    @Column(name = "instock", nullable = false)
    private boolean instock;

    @Column(name = "reader")
    private String reader;

    @Column(name = "position", nullable = false)
    private String position;

    public Book() {

    }

    public Book(String title, String titleauthor, String publishing, Boolean instock, String reader, String position) {
        this.title = title;
        this.titleauthor = titleauthor;
        this.publishing = publishing;
        this.instock = instock;
        this.reader = reader;
        this.position = position;
    }


    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitleauthor(String titleauthor) {
        this.titleauthor = titleauthor;
    }

    public String getTitleauthor() {
        return titleauthor;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getReader() {
        return reader;
    }

    public void setInstock(boolean instock) {
        this.instock = instock;
    }

    public boolean isInstock() {
        return instock;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, title='%s', author='%s']",
                articleId, title, titleauthor);
    }
}
