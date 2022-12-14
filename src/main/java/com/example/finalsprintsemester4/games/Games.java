package com.example.finalsprintsemester4.games;

import javax.persistence.*;

@Entity
public class Games {
    @Id
    @SequenceGenerator(name = "games_sequence", sequenceName = "games_sequence", allocationSize = 1, initialValue=1001)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "games_sequence")
    private Long id;
    private String title;
    private String developer;
    private String release_date;

    public Games() {
    }

    public Games(Long id, String title, String developer, String release_date) {
        this.id = id;
        this.title = title;
        this.developer = developer;
        this.release_date = release_date;
    }

    public Games(String title, String developer, String release_date) {
        this.title = title;
        this.developer = developer;
        this.release_date = release_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", developer='" + developer + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}
