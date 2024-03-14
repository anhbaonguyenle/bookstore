package com.lenguyenbaoanh.bookstore.model;

import java.util.Date;

public class author {
    private long author_id;
    private String name;
    private String nation;
    private Date birthday;
    private String description;

    public author() {
    }
    public author(long author_id, String name, String nation, Date birthday, String description) {
        this.author_id = author_id;
        this.name = name;
        this.nation = nation;
        this.birthday = birthday;
        this.description = description;
    }
    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "author{" +
                "author_id=" + author_id +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                '}';
    }
}
