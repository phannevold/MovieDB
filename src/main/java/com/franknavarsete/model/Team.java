package com.franknavarsete.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Frank
 * Date: 08.08.13
 * Time: 18:12
 */
@Entity
@Table(name = "TEAMS")
public class Team {

    @Id @GeneratedValue
    private Integer id;

    private String name;

    private Integer rating;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
