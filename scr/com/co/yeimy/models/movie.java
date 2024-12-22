package com.co.yeimy.models;

import com.co.yeimy.screenmacth.calculations.Rating;

public class movie extends Title implements Rating{
   private String director;

public String getDirector() {
    return director;
}

public void setDirector(String director) {
    this.director = director;
}

public int getRating(){
    return (int) (calculMedia() / 2);
}
}