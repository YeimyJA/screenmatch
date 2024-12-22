package com.co.yeimy.screenmacth.calculations;

import com.co.yeimy.models.Title;

public class timeCalculator {
    private int timeQuantity;
    
    public int getTimeQuantity(){
        return timeQuantity;
    }

    public void incluid(Title title){
        this.timeQuantity += title.getLengthInMinutes();
    }

}
