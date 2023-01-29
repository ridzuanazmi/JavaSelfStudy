package LambdaExpression;

public class Main {

    public static void main(String[] args) {
        //Cat myCat = new Cat();

        // Lambda expression example
        printThing(() -> System.out.println("Meow"));

    }

    static void printThing(Printable thing) {
        thing.print();

    }
}
