package com.co.yeimy;
import com.co.yeimy.models.Episode;
import com.co.yeimy.models.Serie;
import com.co.yeimy.models.movie;
import com.co.yeimy.screenmacth.calculations.timeCalculator;
import com.co.yeimy.screenmacth.calculations.Recommendations;
import java.util.logging.Filter;


public class Primary {
    public static void main(String[] args) {
        movie myMovie = new movie();
        myMovie.setName("Encanto");
        myMovie.setLaunchDate(2021);
        myMovie.setLengthInMinutes(120);
        myMovie.setIncludeInPlan(true);
        
        myMovie.showTechnicalSheet();
        myMovie.evaluate(10);
        myMovie.evaluate(10);
        myMovie.evaluate(7.8);
        System.out.println(myMovie.getTotalEvualuate());
        System.out.println(myMovie.calculMedia());

        Serie casaDragon =new Serie();
        casaDragon.setName("La casa del dragon");
        casaDragon.setLaunchDate(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutePerSeason(50);
        casaDragon.setEpisodesPerSeason(10);
        casaDragon.showTechnicalSheet();
        System.out.println(casaDragon.getLengthInMinutes());

        movie otherMovie = new movie();
        otherMovie.setName("Matrix");
        otherMovie.setLaunchDate(1998);
        otherMovie.setLengthInMinutes(180);

        timeCalculator calculat = new timeCalculator();
        calculat.incluid(myMovie);
        calculat.incluid(casaDragon);
        calculat.incluid(otherMovie);
        System.out.println("Time needed to watch your titles on vacation "+calculat.getTimeQuantity()+ " minutos");

        Recommendations FilterRecommendations = new Recommendations();
        FilterRecommendations.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumero(1);
        episode.setNombre("La casa Targaryan");
        episode.setSerie(casaDragon);
        episode.setTotalViews(300);
        
        FilterRecommendations.filter(episode);
    }
}
