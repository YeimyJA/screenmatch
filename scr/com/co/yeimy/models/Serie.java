package com.co.yeimy.models;

public class Serie extends Title{
    int temporadas, episodesPerSeason, minutePerSeason;

    public int getLengthInMinutes(){
        return temporadas* episodesPerSeason * minutePerSeason;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutePerSeason() {
        return minutePerSeason;
    }

    public void setMinutePerSeason(int minutePerSeason) {
        this.minutePerSeason = minutePerSeason;
    }
    

}
