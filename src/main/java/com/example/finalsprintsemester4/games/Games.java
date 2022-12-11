package com.example.finalsprintsemester4.games;

import jakarta.persistence.*;

@Entity
public class Games {
    @Id
    @SequenceGenerator(name = "games_sequence", sequenceName = "games_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "games_sequence")
    private Long id;
    private String title;
    private String developer;
    private String releaseDate;

    public Games() {
    }

    public Games(Long id, String title, String developer, String releaseDate) {
        this.id = id;
        this.title = title;
        this.developer = developer;
        this.releaseDate = releaseDate;
    }

    public Games(String title, String developer, String releaseDate) {
        this.title = title;
        this.developer = developer;
        this.releaseDate = releaseDate;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", developer='" + developer + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
