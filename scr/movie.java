public class movie {
    String name;
    int launchDate;
    int lengthInMinutes;
    boolean includeInPlan;
    double sumUpTheEvaluations;
    int totalEvualuate;

    void showTechnicalSheet(){
        System.out.println("The name movie is: " + name);
        System.out.println("Your lauch date is: " + launchDate);
        System.out.println("Length in minutes is: " + lengthInMinutes);
}

    void evaluate(double nota){
        sumUpTheEvaluations += nota;
        totalEvualuate++;
    }

    double calculMedia(){
        return sumUpTheEvaluations / totalEvualuate;
    }
}
