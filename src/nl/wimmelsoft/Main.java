package nl.wimmelsoft;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Greeting greeting = new Greeting("Dit is een bericht");
        greeting.setPrinter(new ConsolePrinter());
        greeting.print();
        greeting.setPrinter(new FilePrinter());
        greeting.print();
    }
}
