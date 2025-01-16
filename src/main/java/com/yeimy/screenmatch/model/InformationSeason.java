package com.yeimy.screenmatch.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record InformationSeason(Integer Season, List<InformationEpisode> Episodes) {

}
