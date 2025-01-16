package com.yeimy.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public record InformationSerie(String Title, Integer totalSeasons, String imdbRating) {

}
