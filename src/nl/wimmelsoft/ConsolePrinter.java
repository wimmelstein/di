package nl.wimmelsoft;

public class ConsolePrinter extends Printer {
    @Override
    public void print(String message) {
        System.out.println(String.format("Printing '%s' to the console", message));
    }
}
