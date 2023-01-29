package Polymorphism;

/*
Casting with classes and using objects and var references
 */

public class NextMain {
    
    public static void main(String[] args) {
        
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        // cast the Movie into an adventure similar to int into float casting
        jaws.watchMovie();
        System.out.println("");

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();
        System.out.println("");

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
        System.out.println("");
        // var is a special contextual keyword in Java that lets our code take advantage of
        // Local Variable Type inference. Using var as the type, telling Java to figure
        // out the compile-time type for us

        var plane = new Comedy("Airplane");
        plane.watchComedy();
        System.out.println("");

        /*
        var cannot be used in field declaration on a class
        var cannot be used in method signatures either as a parameter of return type
        var cannot be used without an assignment because the type cannot be inferred 
        var cannot be assigned a null literal because a type cannot be inferred in
        */

        Object unknownObject = Movie.getMovie("A", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
