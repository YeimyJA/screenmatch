package com.co.yeimy.screenmacth.calculations;

public class Recommendations {
  public  void filter(Rating rating){
        if(rating.getRating()>=4)
            System.out.println("Muy bien evaluado en el momento"); 
        else if(rating.getRating()>= 2)
            System.out.println("Popular en el momento");
        else
            System.out.println("Colocalo en tu lista para verlo despues");
    }
}
