package com.co.yeimy.models;
public class movie {
    private String name;
    private int launchDate;
    private int lengthInMinutes;
    private boolean includeInPlan;
    private double sumUpTheEvaluations;
    private int totalEvualuate;


    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public void setIncludeInPlan(boolean includeInPlan) {
        this.includeInPlan = includeInPlan;
    }

    public int getTotalEvualuate() {
        return totalEvualuate;
    }
    
    public void showTechnicalSheet(){
        System.out.println("The name movie is: " + name);
        System.out.println("Your lauch date is: " + launchDate);
        System.out.println("Length in minutes is: " + lengthInMinutes);
}

    public void evaluate(double nota){
        sumUpTheEvaluations += nota;
        totalEvualuate++;
    }

    public double calculMedia(){
        return sumUpTheEvaluations / totalEvualuate;
    }

}
