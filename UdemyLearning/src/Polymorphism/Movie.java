package Polymorphism;

public class Movie {
    
    // fields
    private String title;

    // constructor
    public Movie(String title) {
        this.title = title;
    }

    // method
    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        //get.Class returns type information about the runtime instance. 
        //get.SimpleName gets the name of the class 
        System.out.println(title + " is a " + instanceType + " film");
    }

//  this is known as factory method; get an object without having to know the details
//  of how to create a new one or specify the exact we want
    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);            
        };
    }

}// end of Movie class

class Adventure extends Movie {

    // constructor
    public Adventure(String title) {
        super(title);
    }

    // method
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                            "Pleasant Scene" ,
                            "Scary Music",
                            "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure movie!");
    }
     
}

class ScienceFiction extends Movie {

    // constructor
    public ScienceFiction(String title) {
        super(title);
    }

    // method
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                            "Bad aliens do bad stuff" ,
                            "Space guys chase aliens",
                            "Planet blows up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching an Science Fiction movie!");
    }
     
}

class Comedy extends Movie {

    // constructor
    public Comedy(String title) {
        super(title);
    }

    // method
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                            "Funney scene1" ,
                            "Funney scene2",
                            "Funney scene3");
    }
    
    public void watchComedy() {
        System.out.println("Watching an Comedy movie!");
    } 
}