package nl.wimmelsoft;

import java.io.IOException;

public class Greeting {

    private String message;
    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Greeting(String message) {
        this.message = message;
    }

    public void print() throws IOException {
        printer.print(this.message);
    }
}
