/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author imady
 */
@XmlRootElement
public class Message {
    private Long id;
    private String content;
    private String author;
    private Date published;
    private List<Comment> comments;

    public Message() {
    }
    
    public Message(Long id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.published = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    
}
