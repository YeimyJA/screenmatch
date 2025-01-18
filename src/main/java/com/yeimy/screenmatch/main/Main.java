package com.yeimy.screenmatch.main;
import com.yeimy.screenmatch.model.Episode;
import com.yeimy.screenmatch.model.InformationEpisode;
import com.yeimy.screenmatch.model.InformationSeason;
import com.yeimy.screenmatch.model.InformationSerie;
import com.yeimy.screenmatch.service.ConvertPiece;
import com.yeimy.screenmatch.service.UseAPI;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private Scanner keyboard = new Scanner(System.in);
    private UseAPI useApi = new UseAPI(); 
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=d4d0bf92";
    private ConvertPiece converter = new ConvertPiece();

    public void showMenu(){
        System.out.println("Ingrese el nombre de la serie que desea buscar");
        var nameSerie = keyboard.nextLine();

        var json = useApi.getInformation(URL_BASE+nameSerie.replace(" ", "+")+API_KEY);
        var data = converter.getData(json, InformationSerie.class);
        System.out.println(data);

        List<InformationSeason> seasons = new ArrayList<>();
        for (int i = 1; i <= data.totalSeasons(); i++) {
            json = useApi.getInformation(URL_BASE+nameSerie.replace(" ", "+")+"&Season="+i+API_KEY);
            var dataSeason = converter.getData(json, InformationSeason.class);
            seasons.add(dataSeason);
        }
        //seasons.forEach(System.out::println);

        //Show title Episode and Season
        // for (int i = 0; i < data.totalSeasons(); i++) {
        //     List<InformationEpisode> episodesSeason = seasons.get(i).Episodes();
        //     for (int j = 0; j < episodesSeason.size(); j++) {
        //         System.out.println(episodesSeason.get(j).Title());                
        //     }
        // }
        //seasons.forEach(t -> t.Episodes().forEach(e->System.out.println(e.Title())));

        //Converter information to list the tipe InformationEpisode
        List<InformationEpisode> informationEpisodes = seasons.stream()
                .flatMap(t -> t.Episodes().stream())
                .collect(Collectors.toList());
        
        //Top 5 Episode
        System.out.println("Top 5 Episdodes");
        informationEpisodes.stream()
                .filter(e -> !e.imdbRating().equalsIgnoreCase("N/A"))
                 .sorted(Comparator.comparing(InformationEpisode::imdbRating).reversed())
                 .limit(5)
                 .forEach(System.out::println);

        //Coverter date list to list tipe Episode
         List<Episode> episdodes = seasons.stream()
                .flatMap(t -> t.Episodes().stream()
                    .map(d -> new Episode(t.Season(), d)))
                .collect(Collectors.toList());
        episdodes.forEach(System.out::println);
    }
}
