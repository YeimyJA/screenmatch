package com.yeimy.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episode {
    private Integer Season;
    private String Title;
    private Integer numberEpisode;
    private LocalDate Released;
    private Double rating;

    public Episode(Integer number, InformationEpisode d){
        this.Season = number;
        this.Title = d.Title();
        this.numberEpisode = d.Episode();
        try {
            this.rating = Double.valueOf(d.imdbRating());
            
        } catch (NumberFormatException e) {
            this.rating = 0.0;
        }
        try {
            this.Released = LocalDate.parse(d.Released());   
        } catch (DateTimeParseException e) {
            this.Released = null;
        }

    };

    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public Integer getEpisode() {
        return numberEpisode;
    }
    public void setEpisode(Integer episode) {
        numberEpisode = episode;
    }
    public Integer getSeason() {
        return Season;
    }
    public void setSeason(Integer season) {
        Season = season;
    }
    public Double getImdbRating() {
        return rating;
    }
    public void setImdbRating(Double imdbRating) {
        this.rating = imdbRating;
    }
    public LocalDate getReleased() {
        return Released;
    }
    public void setReleased(LocalDate released) {
        Released = released;
    }

    @Override
    public String toString() {
        return "Season=" + Season + ", Episode=" + numberEpisode + ", Title=" + Title +  ", Rating=" + rating
                + ", Released=" + Released ;
    }
}
