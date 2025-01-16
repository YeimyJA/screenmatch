package com.yeimy.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public record InformationEpisode(String Title, Integer Episode, String imdbRating, String Released) {

}
