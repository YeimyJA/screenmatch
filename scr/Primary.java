public class Primary {
    public static void main(String[] args) {
        movie myMovie = new movie();
        myMovie.name = "Encanto";
        myMovie.launchDate = 2021;
        myMovie.lengthInMinutes = 120;
        
        myMovie.showTechnicalSheet();
        myMovie.evaluate(10);
        myMovie.evaluate(10);
        myMovie.evaluate(7.8);
        System.out.println(myMovie.getTotalEvualuate());
        System.out.println(myMovie.calculMedia());
        System.out.println(myMovie.calculMedia());
    
        movie anotherMovie = new movie();
        anotherMovie.name = "Matrix";
        anotherMovie.launchDate = 1998;
        anotherMovie.lengthInMinutes = 180;

        anotherMovie.showTechnicalSheet();
    }
}
