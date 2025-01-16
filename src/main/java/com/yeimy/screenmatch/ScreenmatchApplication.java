package com.yeimy.screenmatch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yeimy.screenmatch.model.InformationEpisode;
import com.yeimy.screenmatch.model.InformationSeason;
import com.yeimy.screenmatch.model.InformationSerie;
import com.yeimy.screenmatch.service.ConvertPiece;
import com.yeimy.screenmatch.service.UseAPI;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var useApi = new UseAPI();
        var json = useApi.getInformation("https://www.omdbapi.com/?t=game+of+thrones&apikey=d4d0bf92");
        System.out.println(json);
        ConvertPiece converter = new ConvertPiece();
        var data = converter.getData(json, InformationSerie.class);
        System.out.println(data);
        json = useApi.getInformation("https://www.omdbapi.com/?t=game+of+thrones&Season=1&Episode=1&apikey=d4d0bf92");
        InformationEpisode episode = converter.getData(json, InformationEpisode.class);
        System.out.println(episode);

        List<InformationSeason> seasons = new ArrayList<>();
        for (int i = 1; i < data.totalSeasons(); i++) {
            json = useApi.getInformation("https://www.omdbapi.com/?t=game+of+thrones&Season="+i+"&apikey=d4d0bf92");
            var dataSeason = converter.getData(json, InformationSeason.class);
            seasons.add(dataSeason);
        }
        
        seasons.forEach(System.out::println);
    }
}
